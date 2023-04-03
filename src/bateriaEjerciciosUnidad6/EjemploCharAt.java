package bateriaEjerciciosUnidad6;

public class EjemploCharAt {

    public static void main(String[] args) {
        // Creamos una cadena de texto
        String saludo = "Hola mundo";

        // Obtenemos el primer carácter de la cadena
        char c1 = saludo.charAt(0);

        // Obtenemos el último carácter de la cadena
        char c2 = saludo.charAt(saludo.length() - 1);

        // Mostramos los resultados por pantalla
        System.out.println("El primer carácter de " + saludo + " es " + c1);
        System.out.println("El último carácter de " + saludo + " es " + c2);
    }
}