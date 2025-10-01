package Boletin2;

import Boletin1.MiEntradaSalida;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num;
        int numAleatorio = (int) (Math.random() * 100) + 1;
        int errores = 0;
        System.out.println(numAleatorio);

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

        } while (errores < 5);

        System.out.println("Intentos maximos el numero era: " + numAleatorio);

    }
}
