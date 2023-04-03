package OpenBootCamp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Tarea789 {

    public static void main(String[] args) {

        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] array1 = {"valor1", "valor2", "valor3"};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        /*Crea un array bidimensional de enteros y recórrelo, mostrando la posición y
         el valor de cada elemento en ambas dimensiones.*/
        int[][] miArray = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < miArray[i].length; j++) {
                System.out.println("Posición [" + i + "][" + j + "]: " + miArray[i][j]);
            }
        }

        /*Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        Elimina el 2o y 3er elemento y muestra el resultado final. */


            Vector<String> vector = new Vector<String>();

            //agregamos elementos al vector
            vector.add("hola");
            vector.add("que pasa");
            vector.add("como");
            vector.add("estais");
            vector.add("por ahi");

            //eliminamos
            vector.remove(1);
            vector.remove(1);

            //Mostrar el resultado final
            System.out.println("Vector Final: " + vector);

        /*Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
        1000 elementos para ser añadidos al mismo.*/
        /*Que tiene que copiarse el vector por completo muchas veces, se producen problemas de rendimiento
        aumentando el tiempo de uso de memoria.
         */

        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        // Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> miArrayList = new ArrayList<String>();
        miArrayList.add("Elemento Primero");
        miArrayList.add("Elemento Segundo");
        miArrayList.add("Elemento Tercero");
        miArrayList.add("Elemento Cuarto");

        // Copiar el ArrayList en una LinkedList
        LinkedList<String> miLinkedList = new LinkedList<String>(miArrayList);

        // Recorrer el ArrayList y mostrar los elementos
        System.out.println("ArrayList:");
        for (String elemento : miArrayList) {
            System.out.println(elemento);
        }

        // Recorrer la LinkedList y mostrar los elementos
        System.out.println("LinkedList:");
        for (String elemento : miLinkedList) {
            System.out.println(elemento);
        }
        /*Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y
         muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer
         "for" de relleno.
         */
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();

        // Rellenar el ArrayList con elementos 1..10
        for (int i = 1; i <= 10; i++) {
            arraylist2.add(i);
        }

        // Recorrer el ArrayList y eliminar los elementos pares
        for (int i = 0; i < arraylist2.size(); i++) {
            if (arraylist2.get(i) % 2 == 0) {
                arraylist2.remove(i);
                i--;
            }
        }

        // Mostrar el ArrayList final
        System.out.println("ArrayList final: " + arraylist2);
        }





    }




