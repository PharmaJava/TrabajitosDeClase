package Animalitos;

import Animalitos.Pajaro;
import Animalitos.Perro;

public class MainAnimal {
    public static void main(String[] args) {

            Perro perro1= new Perro("Labrador", "docil", 45.3, true, 11.5,
                    true);
            perro1.mostrarAnimal();
            perro1.sonidoAnimal();

            Pajaro pajarito1= new Pajaro ("Inseparables", "alegre", 0.23, true,
                    "amarillo", true);

            pajarito1.mostrarAnimal();
            pajarito1.sonidoAnimal();
        }
    }

