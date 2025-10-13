package Tema3;

import java.util.Random;

public class Ejercicio5 {

    public static void generarArray(int tamaño) {
        int[] array = new int[tamaño];
        Random rand = new Random();

        System.out.println("Array generado (" + tamaño + " elementos): ");
        for (int i = 0; i < tamaño; i++) {
            array[i] = rand.nextInt(1001);
            System.out.println(array[i] + "");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        generarArray(40);
    }
}
