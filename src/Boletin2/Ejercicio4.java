package Boletin2;

import Boletin1.MiEntradaSalida;

public class Ejercicio4 {
    private static final int MAX_INTENTOS = 5;
    public static void main(String[] args) {
        int num;
        int numAleatorio = (int) (Math.random() * 100) + 1;
        int errores = 0;

        System.out.println("Adivina el número entre 1 y 100 en 5 intentos");

        do {
            num = MiEntradaSalida.leerEntero("Introduce un numero:");
            errores++;

            if (num < 1 || num > 100) {
                System.out.println("El numero tiene que ser entre 1 y 100");
            } else if (num < numAleatorio) {
                System.out.println("El numero aleatorio es mayor que " + num);
            } else if (num > numAleatorio) {
                System.out.println("El numero aleatorio es menor que " + num);
            } else {
                System.out.println("Has adivinado el numero en: " + errores + " intentos");
                return;
            }

            System.out.println("Intentos: " + errores + "/5");

        } while (errores < MAX_INTENTOS);

        System.out.println("Intentos maximos el numero era: " + numAleatorio);

    }

    /*
    Clases para Generar Numero Aleatorios y entre un rango
     */

    public static int GenerarAleatorio(int max) {
        return (int) (Math.random() * max + 1);
    }

    public static int GenerarAleatorioEntre(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
