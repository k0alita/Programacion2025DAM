package Tema3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos elementos quieres en el Array?: ");
        int cantNums = sc.nextInt();

        int num;
        int mayor = 0;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < cantNums; i++) {
            System.out.println("Introduzca el numero " + i);
            num = sc.nextInt();
            if (num > mayor) {
                mayor = num;
            } else menor = num;
        }

        int media;

        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero mayor es: " + mayor);





    }
}
