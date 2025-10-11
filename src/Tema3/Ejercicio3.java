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
        int contMayor = 0, contMenor = 0;

        for (int num : numeros) {
            suma += num;
            if (num > mayor) { mayor = num; contMayor = 1; }
            else if (num == mayor) contMayor++;
            if (num < menor) { menor = num; contMenor = 1; }
            else if (num == menor) contMenor++;
        }



        System.out.println("El mayor número es " + mayor + (contMayor > 1 ? " (se repite " + contMayor + " veces)" : ""));
        System.out.println("El menor número es " + menor + (contMenor > 1 ? " (se repite " + contMenor + " veces)" : ""));
        System.out.println("La media es: " + (double)suma / cantNums);





    }
}
