package Boletin2;

import Boletin1.MiEntradaSalida;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Adivina el numero: ");
        int num = MiEntradaSalida.leerEntero("Introduce un numero: ");
        int numAleatorio = (int) (Math.random() * 100);
        System.out.println(numAleatorio);

        while (num < numAleatorio) {
            num = MiEntradaSalida.leerEntero("El numero aleatorio es mas grande, introduce otro numero: ");
        }
        while (num > numAleatorio) {
            num = MiEntradaSalida.leerEntero("El numero aleatorio es mas pequeño, introduce otro numero: ");
        }

        if (num == numAleatorio) {
            System.out.println("Has acertado el numero");
        }

    }
}
