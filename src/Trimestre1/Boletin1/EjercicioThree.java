package Trimestre1.Boletin1;

import java.util.Scanner;

public class EjercicioThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros: ");
        int cantNums = sc.nextInt();

        while (cantNums == 0 || cantNums < 0) {
            System.out.println("Vuelve a introducir los numeros: ");
            cantNums = sc.nextInt();
        }

        for (int i = 1; i < cantNums + 1; i++) {
            System.out.print("Introduce el número " + i + ": ");
            double num = sc.nextDouble();
            if (num % 2 == 0) {
                System.out.println("El numero " + num + " es par");
            } else{
                System.out.println("El numero "  + num + " es impar");
            }
        }
    }
}