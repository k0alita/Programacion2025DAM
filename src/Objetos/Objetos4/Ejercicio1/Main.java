package Objetos.Objetos4.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce la palabra: ");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.next();

        System.out.println("Introduce el carácter a buscar: ");
        char caracter = sc.next().charAt(0);

        int resultado = comprobarCaracteres(cadena, caracter);
        System.out.println("El carácter '" + caracter + "' aparece " + resultado + " veces.");
    }

    public static int comprobarCaracteres(String cadena, char caracter) {
        int contadorCaracter = 0;
        cadena = cadena.toLowerCase();
        caracter = Character.toLowerCase(caracter);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contadorCaracter++;
            }
        }

        return contadorCaracter;
    }
}