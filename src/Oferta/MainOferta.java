package Oferta;

import Oferta.Oferta;

import java.util.Scanner;

public class MainOferta {
    public static void main(String[] args) {

        Oferta oferta1= new Oferta( "JavaDeveloper", "Oracle", "Jhon el Hacker",
                "Sin Experiencia", "22/07/2024", 25000,false, true);

        oferta1.mostrarOferta();

        Scanner sc= new Scanner (System.in);

        System.out.println("¿Qué oferta está solicitando?");
        String nombreOferta = sc.nextLine();

        System.out.println("Cúal es la empresa");
        String empresa = sc.nextLine();

        System.out.println("Quién es la persona de contacto?");
        String personaContacto = sc.nextLine();

        System.out.println("Cúal es la experiencia requerida?");
        String experiencia= sc.nextLine();

        System.out.println("Cúal es el sueldo?");
        double sueldo = sc.nextDouble();


        System.out.println("La oferta es remota? (true/false):");
        boolean esRemoto = sc.nextBoolean();



        System.out.println("La oferta esta solicitada? (true/false):");
        boolean estaSolicitada = sc.nextBoolean();

        System.out.println("Ingrese la fecha de solicitud: (dd/mm/año)");
        String fechaSolicitud = sc.nextLine();



        Oferta oferta2 = new Oferta( nombreOferta,  empresa,  personaContacto,experiencia,  fechaSolicitud,
                sueldo, estaSolicitada, esRemoto);

        oferta2.mostrarOferta();

        oferta1.setEsRemoto(!oferta1.isEsRemoto());

        System.out.println("Registro modificado..");
        oferta1.mostrarOferta();

    }

}