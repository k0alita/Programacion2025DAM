package Objetos.Objetos4.Ejercicio1.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce la palabra, para comprobar si es un polimdormo: ");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.next();

        if (contadorCaracteres(cadena)) {
            System.out.println("Esta cadena es un palimdromo");
        } else {
            System.out.println("Esta cadena no es un palindormo");
        }

    }

    public static boolean contadorCaracteres(String cadena) {
        cadena = cadena.toLowerCase().replaceAll(" ", "");
        String palabraInvertida = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(palabraInvertida);

    }
}
