package Boletin1;

import java.util.Scanner;

public class EjercicioSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int numA = sc.nextInt();
        System.out.println("Introduce otro numero entero: ");
        int numB = sc.nextInt();

        int resultadoTotal = 0;

        for (int i = 0; i < numB; i++) {
            resultadoTotal += numA;
        }

        System.out.println("El resultado es " + resultadoTotal);
    }
}
