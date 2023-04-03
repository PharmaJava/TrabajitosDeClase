package bateriaEjerciciosUnidad6;

import java.util.Scanner;

public class Fiesta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int amiguitos= 0;

        while (amiguitos <1 || amiguitos > 6){
            System.out.println("Introduce el número de amigos que van a asistir: ");
            try{
                amiguitos= Integer.parseInt(sc.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Debes introducir un número del 1 al 6");

            }if (amiguitos <1 || amiguitos >6);
            System.out.println("El número de amigos tiene que ser entre 1 y 6");

        }

        String nombresdeAmigos [] = new String [amiguitos];

        for (int i =0; i <amiguitos; i++){
            System.out.println("Introduce el nombre del amigo " + (i+1) + ": ");
            nombresdeAmigos[i]=sc.nextLine();

        }
        System.out.println("Los asistentes a la fiesta serán: ");
        for (String amigos : nombresdeAmigos){
            System.out.println(nombresdeAmigos);
        }

    }
}
