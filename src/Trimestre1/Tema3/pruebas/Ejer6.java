package Trimestre1.pruebas;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numA= sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int numB = sc.nextInt();

        int producto = 0;

        for (int i = 0; i < Math.abs(numB); i++) { // Añadimos Math.abs para que de igual el negativo
            producto += numA;
        }

        if (numB < 0) producto = -producto;

        System.out.println("El producto es: " + producto);
    }
}
