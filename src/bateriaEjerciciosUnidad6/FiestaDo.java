import java.util.Scanner;

public class FiestaDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAmigos = 0;

        // Pedimos el número de amigos que pueden asistir
        do {
            System.out.print("Introduce el número de amigos que pueden asistir (entre 1 y 6): ");
            String entrada = scanner.nextLine();
            if (entrada.matches("\\d+") && Integer.parseInt(entrada) >= 1 && Integer.parseInt(entrada) <= 6) {
                numAmigos = Integer.parseInt(entrada);
                break;
            } else {
                System.out.println("Debes introducir un número entero válido entre 1 y 6");
            }
        } while (true);

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
            System.out.println(nombre);
        }

        scanner.close();
    }
}
