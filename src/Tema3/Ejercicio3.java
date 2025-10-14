package Tema3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos elementos quieres en el Array?: ");
        int cantNums = sc.nextInt();

        int[] numeros = new int[cantNums];

        for (int i = 0; i < cantNums; i++) {
            System.out.println("Introduzca el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0], menor = numeros[0], suma = 0;

        int sumaMayor = 0, sumaMenor = 0;
        for (int num : numeros) {
            suma+= num;
            if (num > mayor) {
                mayor = num;
            } else if (num == mayor) {
                sumaMayor++;
            }
            if (num < menor) {
                menor = num;
            } else if (num == menor) {
                sumaMenor++;
            }
        }

        double media = (double) suma / cantNums;

        System.out.println("El numero mayor es: " + mayor + " y se ha repetido: " + sumaMayor + " veces");
        System.out.println("El numero menor es: " + menor + " y se ha repetido: " + sumaMenor + " veces");
        System.out.println("La media es: " + media);
    }
}
