package Boletin1;

import java.util.Scanner;

public class EjercicioNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce un número entero positivo: ");
            num = sc.nextInt();
        } while (num <= 0);

        int suma = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    suma = suma + i;
                }
            }

            if (suma == num) {
                System.out.println("El numero es perfecto");
            } else {
                System.out.println("El numero no es perfecto");
            }

        sc.close();
    }
}
