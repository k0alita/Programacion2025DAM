package pruebas;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numero quieres introducir");
        int cantNums = sc.nextInt();

        while (cantNums <= 0) {
            System.out.println("Introduce una cantidad mayor a 0");
            cantNums = sc.nextInt();
        }

        double suma = 0;
        for (int i = 1; i < cantNums + 1; i++) {
            System.out.println("Introduce el numero " + i + ":");
            int num = sc.nextInt();
            suma += num;
        }

        double media = suma / cantNums;
        System.out.println("La media de los " + cantNums + " numeros es " + media);
    }
}
