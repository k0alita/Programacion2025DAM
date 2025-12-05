package Objetos.Objetos4.Ejercicio1.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce la palabra: ");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.next();

        contadorCaracteres(cadena);

    }




    public static void contadorCaracteres(String cadena) {
        int contadorMayus = 0;
        int contadorMinus = 0;
        int contadorNums = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                contadorMayus++;
            } else if (Character.isLowerCase(cadena.charAt(i))) {
                contadorMinus++;
            } else if (Character.isDigit(cadena.charAt(i))) {
                contadorNums++;
            }


        }
        System.out.printf("Hay %d caracteres Mayuscula, %d Caracteres Minusculas, y %d Numeros", contadorMayus, contadorMinus, contadorNums);
    }
}
