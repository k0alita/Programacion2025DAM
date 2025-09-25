package EjerciciosClase;

import java.util.Scanner;

public class DivisorOtraForma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para ver sus divisores");
        int num = sc.nextInt();

        int comprobar = 2;

        while (num % comprobar != 0) {
            comprobar++;
        }
        System.out.println("EL primer divisor de:  " + num + " es " + comprobar);
    }
}