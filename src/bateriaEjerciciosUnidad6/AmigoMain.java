package bateriaEjerciciosUnidad6;

import java.util.Scanner;

public class AmigoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Introduce el número de amigos que vienen, 6 es el máximo: ");
        int numAmigos= sc.nextInt();
        while (numAmigos<1 || numAmigos > 6){
            System.out.println("Número de amigos no válidos, por favor introduce el número correcto");
            numAmigos=sc.nextInt();
        }
        Amigos[] amigos = new Amigos [numAmigos];
        for (int i=0; i<numAmigos; i++){
            System.out.println("Introduce los datos del amigo " + (i+1) + ":");
            System.out.println("Nombre: ");
            String nombre = sc.next();
            System.out.println("Teléfono");
            int telefono= sc.nextInt();
            System.out.print("¿Ha confirmado asistencia? (true/false): ");
            boolean confirmado= sc.nextBoolean();
            amigos [i]= new Amigos(nombre, telefono, confirmado);
        }
        System.out.println("Los datos introducidos son");
        for (int i =0 ; i< numAmigos; i++){
        System.out.println("Amigo  "+ (i+1)+ ":");
        System.out.println("Nombre "+ amigos[i].getNombre());
        System.out.println("Telefono "+ amigos[i].getTelefono());
        System.out.println("Ha confirmado la asistencia? "+(amigos[i].isConfirmado() ? "Si" :"No"));
    }
}
}
