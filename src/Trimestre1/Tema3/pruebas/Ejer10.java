package Trimestre1.pruebas;

import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();

        while (num < 0) {
            System.out.println("Introduce un numero que sea positivo o cero: ");
            num = sc.nextInt();
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial ("+ num +") = " + factorial);
    }
}
