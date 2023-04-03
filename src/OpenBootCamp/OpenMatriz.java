package OpenBootCamp;

public class OpenMatriz {


        public static void main(String[] args) {
            String[][] matriz = new String[4][6];

            int i;
            int j;
            for(i = 0; i < matriz.length; i++) {
                for(j = 0; j < matriz.length; j++) {
                    matriz[i][j] = "X";
                }
            }

            System.out.println("Matriz de 4 filas y 6 columnas");

            for(i = 0; i < matriz.length; ++i) {
                for(j = 0; j < matriz.length; ++j) {
                    System.out.println(matriz[i][j]);
                }

                System.out.println();
            }

        }
    }

