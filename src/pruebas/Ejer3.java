package pruebas;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cantidad de numeros: ");
        int cantidadNums = sc.nextInt();

        while (cantidadNums <= 0) {
            System.out.println("Introduce una cantidad mayor a 1: ");
            cantidadNums = sc.nextInt();
        }

        for (int i = 1; i < cantidadNums + 1; i++) {
            System.out.println("Introduce el numero " + i + ":");
            double num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("El numero: " + i + " es par");
            } else {
                System.out.println("El numero: " + i + " es impar");
            }
        }
    }
}
