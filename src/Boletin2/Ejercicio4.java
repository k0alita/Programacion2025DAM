package Boletin2;

import Boletin1.MiEntradaSalida;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Adivina el numero: ");
        int num = MiEntradaSalida.leerEntero("Introduce un numero: ");
        int numAleatorio = (int) (Math.random() * 100);
        System.out.println(numAleatorio);

        while (num > 100 || num < 0) {
            num = MiEntradaSalida.leerEntero("Introduce un numero entre 0 y 100");
        }
        int errores = 1;
        while (num < numAleatorio) {
            num = MiEntradaSalida.leerEntero("El numero aleatorio es mas grande, introduce otro numero: ");
            errores++;
            System.out.println("Tienes un total de: " + errores + " errores");
            if (errores >= 5) {
                System.out.println("Tienes un total de: " + errores + " errores, has perdido");
                break;
            }
        }
        while (num > numAleatorio) {
            num = MiEntradaSalida.leerEntero("El numero aleatorio es mas pequeño, introduce otro numero: ");
            errores++;
            System.out.println("Tienes un total de: " + errores + " errores");
            if (errores >= 5) {
                break;
            }
        }

        if (num == numAleatorio) {
            System.out.println("Has acertado el numero en: " + errores + " intentos");
        }

    }
}
