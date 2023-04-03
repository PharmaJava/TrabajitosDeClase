import java.util.Scanner;

public class ConvenioCompleto {
    public static void main(String[] args) {

        //Calcular salario bruto

        double farm22 = 1985.35, farm23 = 2064.76, farm24 = 2137.03;
        double nocFarm22 = 2.48, nocFarm23 = 2.48, nocFarm24 = 2.56;
        double plusAdj22 = 81.70, plusAdj23 = 84.97, plusAdj24 = 87.94;
        double tec22 = 1345.92, aux22 = 1223.91, nocTec22 = 1.62, nocaux22 = 1.61;
        double tec23 = 1399.75, aux23 = 1272.87, nocTec23 = 1.69, nocaux23 = 1.57;
        double tec24 = 1448.74, aux24 = 1317.42, nocTec24 = 1.75, nocaux24 = 1.62;


        double salario = 0, salarioAnual = 0;


        Scanner entrada = new Scanner(System.in);


        int profesion;
        do {
            System.out.println("Marque 1 si eres Farmaceutico, 2 si eres Tecnico, 3 si eres Auxiliar, 4 si desea salir");
            profesion = entrada.nextInt();

            switch (profesion) {

                case 1:
                    System.out.println("Hola Farmaceutico");

                    System.out.println("Marque 0 para 2022, 1 para 2023 y 2 para 2024");
                    int num = entrada.nextInt();
                    System.out.println("Introduce el porcentaje de jornada que estás contratado (1-100)");
                    double porcentaje = entrada.nextDouble();

                    System.out.println("Introduce las horas nocturnas trabajadas este mes");
                    int numHoras = entrada.nextInt();

                    switch (num) {

                        case 0:
                            salario = ((farm22* (porcentaje/100) / 12) * 2) + (plusAdj22 / 12) * 2 + (numHoras * nocFarm22) + plusAdj22 + farm22* (porcentaje/100);
                            salarioAnual = ((farm22* (porcentaje/100) )+ plusAdj22) * 14;

                            System.out.println("Tu salario mensual es de " + salario + " euros brutos");
                            System.out.println("Tu salario anual sin horas nocturnas es de " + salarioAnual + " euros brutos");
                            break;

                        case 1:
                            salario = ((farm23 * (porcentaje/100) / 12) * 2) + (plusAdj23 / 12) * 2 + numHoras * nocFarm23 + plusAdj23 + farm23* (porcentaje/100);
                            salarioAnual = (farm23* (porcentaje/100) + plusAdj23) * 14;

                            System.out.println("Tu salario mensual es de " + salario + " euros brutos");
                            System.out.println("Tu salario anual sin horas nocturnas es de " + salarioAnual + " euros brutos");
                            break;

                        case 2:
                            salario = ((farm24* (porcentaje/100) / 12) * 2) + (plusAdj24 / 12) * 2 + numHoras * nocFarm24 + plusAdj24 + farm24* (porcentaje/100);
                            salarioAnual = (farm24* (porcentaje/100) + plusAdj24) * 14;

                            System.out.println("Tu salario mensual es de " + salario + " euros brutos");
                            System.out.println("Tu salario anual sin horas nocturnas es de " + salarioAnual + " euros brutos");
                            break;

                    }
                    System.out.println("Buen cuenco de arroz");

                    break;

                case 2:
                    System.out.println("Hola Tecnico");

                    System.out.println("Marque 0 para 2022, 1 para 2023 y 2 para 2024");
                    int num1 = entrada.nextInt();
                    System.out.println("Introduce el porcentaje de jornada que estás contratado (1-100)");
                    double porcentaje1 = entrada.nextDouble();

                    System.out.println("Introduce las horas nocturnas trabajadas este mes");
                    int numHoras1 = entrada.nextInt();

                    switch (num1) {

                        case 0:
                            salario = ((tec22* (porcentaje1/100) / 12) * 2) + (numHoras1 * nocTec22) + tec22* (porcentaje1/100);
                            salarioAnual = (tec22 * (porcentaje1/100))* 14;

                            System.out.println("Tu salario mensual es de " + salario + " euros brutos");
                            System.out.println("Tu salario anual sin horas nocturnas es de " + salarioAnual + " euros brutos");
                            break;

                        case 1:
                            salario = ((tec23* (porcentaje1/100) / 12) * 2) + numHoras1 * nocTec23 + tec23* (porcentaje1/100);
                            salarioAnual = (tec23 * (porcentaje1/100))* 14;

                            System.out.println("Tu salario mensual es de " + salario + " euros brutos");
                            System.out.println("Tu salario anual sin horas nocturnas es de " + salarioAnual + " euros brutos");
                            break;

                        case 2:
                            salario = ((tec24* (porcentaje1/100) / 12) * 2) + numHoras1 * nocTec24 + tec24* (porcentaje1/100);
                            salarioAnual = (tec24* (porcentaje1/100) )* 14;

                            System.out.println("Tu salario mensual es de " + salario + " euros brutos");
                            System.out.println("Tu salario anual sin horas nocturnas es de " + salarioAnual + " euros brutos");
                            break;


                    }

                    System.out.println("Buen cuenco de arroz");
                    break;
                case 3:

                    System.out.println("Hola Auxiliar");

                    System.out.println("Marque 0 para 2022, 1 para 2023 y 2 para 2024");
                    int num2 = entrada.nextInt();

                    System.out.println("Introduce el porcentaje de jornada que estás contratado (1-100)");
                    double porcentaje2 = entrada.nextDouble();
                    System.out.println("Introduce las horas nocturnas trabajadas este mes");
                    int numHoras2 = entrada.nextInt();

                    switch (num2) {

                        case 0:
                            salario = ((aux22* (porcentaje2/100) / 12) * 2) + (numHoras2 * nocaux22) + aux22* (porcentaje2/100);
                            salarioAnual = (aux22* (porcentaje2/100)) * 14;

                            System.out.println("Tu salario mensual es de " + salario + " euros brutos");
                            System.out.println("Tu salario anual sin horas nocturnas es de " + salarioAnual + " euros brutos");
                            break;

                        case 1:
                            salario = ((aux23* (porcentaje2/100) / 12) * 2) + numHoras2 * nocaux23 + aux23* (porcentaje2/100);
                            salarioAnual = (aux23* (porcentaje2/100)) * 14;

                            System.out.println("Tu salario mensual es de " + salario + " euros brutos");
                            System.out.println("Tu salario anual sin horas nocturnas es de " + salarioAnual + " euros brutos");
                            break;

                        case 2:
                            salario = ((aux24* (porcentaje2/100) / 12) * 2) + numHoras2 * nocaux24 + aux24* (porcentaje2/100);
                            salarioAnual = (aux24* (porcentaje2/100)) * 14;

                            System.out.println("Tu salario mensual es de " + salario + " euros brutos");
                            System.out.println("Tu salario anual sin horas nocturnas es de " + salarioAnual + " euros brutos");

                            System.out.println("Buen cuenco de arroz");
                            break;
                    }

            }

        } while (profesion != 4);
    }
}