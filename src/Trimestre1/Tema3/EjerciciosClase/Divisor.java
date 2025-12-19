package Trimestre1.EjerciciosClase;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para ver sus divisores");
        int num = sc.nextInt();

        int comprobar = 2;

        while (comprobar <= num / 2 && num % comprobar != 0) {
            comprobar++;
        }
        if (num % comprobar == 0) {
            System.out.println("EL primer divisor de:  " + num + " es " + comprobar);
        } else {
            System.out.printf("El numero %d es primo", num);
        }
    }
}
