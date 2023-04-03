import java.util.Scanner;

public class FiestaDeAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAmigos = 0;

        // Pedimos el número de amigos que pueden asistir
        while (numAmigos < 1 || numAmigos > 6) {
            System.out.print("Introduce el número de amigos que pueden asistir (entre 1 y 6): ");
            try {
                numAmigos = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número entero válido");
            }
            if (numAmigos < 1 || numAmigos > 6) {
                System.out.println("El número debe estar entre 1 y 6");
            }
        }

        // Creamos el array de nombres de amigos
        String[] nombres = new String[numAmigos];

        // Pedimos los nombres de los amigos y los almacenamos en el array
        for (int i = 0; i < numAmigos; i++) {
            System.out.print("Introduce el nombre del amigo " + (i+1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Mostramos los nombres de los amigos que asistirán a la fiesta
        System.out.println("Los amigos que asistirán a la fiesta son:");
        for (String nombre : nombres) {
            System.out.println(nombres);
        }

        scanner.close();
    }
}
