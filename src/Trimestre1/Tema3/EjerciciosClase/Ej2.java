package Trimestre1.EjerciciosClase;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;


        do {
            System.out.println("Introduce una contrasena valida: ");
            password = sc.next();

            if (password.length() < 8) {
                System.out.println("Contrasena no validad, otra: ");
            }

        } while (password.length() < 8);
        System.out.println("Contrasena valida");
    }
}