package Trimestre1.Boletin1;

import java.util.Scanner;

public class EjercicioTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();

        while (num1 >= 11) {
            System.out.println("Numero invalido - Introduce una cantidad entre 0 y 10 ");
            num1 = sc.nextInt();
        }

        for (int i = 1; i < 11; i++) {
            int resultado = num1 * i;
            System.out.println(num1 + " x " + i + " = " + resultado);
        }
    }
}
