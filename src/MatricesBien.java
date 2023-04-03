import java.util.Scanner;

public class MatricesBien {
    public static void main(String[] args) {
        String[][] matriz = new String [4][6];

        //Relleno matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = "X";
            }
        }

        System.out.println("Matriz de 4 filas y 6 columnas");
         for (int i = 0; i <  matriz.length; i++){
             for (int j = 0; j < matriz[i].length; j++){
                 System.out.printf("%-6s", matriz[i][j]);
             }
             System.out.println();
         }

         // tenemos que hacer 2 bucles DO WHILE para sacar el ejemplo.
         Scanner sc = new Scanner (System.in);
            System.out.println("**Introduce las coordenadas del elemento a cambiar** ");
         int fila, columna;
          do {

              System.out.println("Coordenada I(filas): ");

              fila = sc.nextInt();
              if (fila < 0 || fila > 3) {

                  System.out.println("Coordenada I fuera de rango");
              }
          } while (fila < 0 || fila > 3);

          do{
              System.out.println("Coordenada J(columnas): ");
              columna = sc.nextInt();

              if (columna <0 || columna >5){
                  System.out.println("Coordenada J fuera de rango");
              }
          } while( columna < 0 || columna > 5);


        //Aqui metemos la palabra que deseemos

          System.out.println("Introduce el nuevo elemento: ");
        String nuevo = sc.next();
        matriz[fila][columna] = nuevo;

        //Mostramos la matriz con la palabra JAVA
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%-6s", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("El elemento nuevo introducido en la matriz tiene "
                + nuevo.length() + " caracteres.");

    }

}
