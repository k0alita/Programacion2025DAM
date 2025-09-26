package EjerciciosClase;

import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caracteres;

        do {
                System.out.println("Introduce una contrasena valida: ");
                String contrasena = sc.next();
                caracteres = contrasena.length();

                if (caracteres < 8) {
                    System.out.println("Contrasena no validad, otra: ");
                }


        } while (caracteres < 8);
        System.out.println("Contrasena valida");
    }
}