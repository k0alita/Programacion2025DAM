package Tema3;

import java.util.Random;

public class Ejercicio5 {

    public static int[] generaArrayAleatorio(int tamaño) {
        int[] array = new int[tamaño];
        Random r = new Random();

        System.out.println("Array generado (" + tamaño + " elementos): ");
        for (int i = 0; i < tamaño; i++) {
            array[i] = r.nextInt(1001);
            System.out.println(array[i] + "");
        }

        System.out.println();
        return array;
    }

    public static void main(String[] args) {
        generaArrayAleatorio(40);
    }
}
