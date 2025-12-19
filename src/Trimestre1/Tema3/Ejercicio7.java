package Trimestre1.Tema3;

import java.util.Scanner;

public class Ejercicio7 {
    public static int[] generarArray(int tamaño) {
        int[] array = new int[tamaño];
        System.out.println("Array generado:");
        for (int i = 0; i < tamaño; i++) {
            array[i] = (int)(Math.random() * 1001); // Números entre 0 y 1000
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        return array;
    }

    public static boolean contieneElemento(int[] array, int elemento) {
        for (int num : array) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }

    public static void comprobarValorEnArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();

        // Generamos el array aleatorio
        int[] array = generarArray(tamaño);

        System.out.print("Introduce el valor a buscar: ");
        int valorBuscado = sc.nextInt();

        boolean encontrado = contieneElemento(array, valorBuscado);

        if (encontrado) {
            System.out.println("El valor " + valorBuscado + " SÍ está en el array.");
        } else {
            System.out.println("El valor " + valorBuscado + " NO está en el array.");
        }
    }

    // Main para ejecutar el programa
    public static void main(String[] args) {
        comprobarValorEnArray();
    }
}
