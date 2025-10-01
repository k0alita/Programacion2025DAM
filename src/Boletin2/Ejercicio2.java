package Boletin2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int exp = 0;
        do {
            System.out.println("Introduce la base: ");
            base = sc.nextInt();
            System.out.println("Introduce el exponente: ");
            exp = sc.nextInt();
        } while (base < 0 || exp < 0);

        int total = 1;
        for (int i = 1; i <= exp; i++) {
            total *= base;
        }

        System.out.println("El total de la potencia es: " + total);
    }
}
