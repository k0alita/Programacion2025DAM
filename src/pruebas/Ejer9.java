package pruebas;

import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();

        while (num <= 0) {
            System.out.println("Introduce un numero positivo: ");
            num = sc.nextInt();
        }

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
    }
}
