package bateriaEjerciciosUnidad6;

public class EjemploConcat {

    public static void main(String[] args) {
        // Creamos dos cadenas de texto
        String nombre = "Juan";
        String apellido = "Pérez";

        // Concatenamos las cadenas usando el método concat ()
        String nombreCompleto = nombre.concat(" ").concat(apellido);

        // Mostramos el resultado por pantalla
        System.out.println("El nombre completo es " + nombreCompleto);
    }
}