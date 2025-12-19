package Trimestre1.Tema3;

import java.util.Random;

public class Ejercicio6 {

    public static void generarArray(int tamaño, int buscar) {
        int[] array = new int[tamaño];
        Random r = new Random();


        boolean encontrado = false;
        System.out.println("Array generado (" + tamaño + " elementos): ");
        for (int i = 0; i < tamaño; i++) {
            array[i] = r.nextInt(100);
            System.out.println(array[i] + "");

            if (array[i] == buscar) {
                encontrado = true;
            }

        }
        if (encontrado) {
            System.out.println("Has encontrado el número " + buscar + " en el array.");
        } else {
            System.out.println("No se encontró el número " + buscar + " en el array.");
        }


        System.out.println();
    }

    public static void main(String[] args) {
        generarArray(55, 55);
    }
}
