package pruebas;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numA= sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int numB = sc.nextInt();

        int producto = 0;

        for (int i = 0; i < numB ; i++) {
            producto += numA;
        }
        System.out.println("El producto es: " + producto);
    }
}
