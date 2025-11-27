package Objetos.Objetos2.Ejercicio4;

import Objetos.Objetos2.Ejercicio4.Exceptions.MiEntradaSalidaException;

import java.util.Scanner;

public class MiEntradaSalida {
    static Scanner sc = new Scanner(System.in);
    public static int solicitarEntero(String mensaje) {
        System.out.println(mensaje);
        return sc.nextInt();
    }
    public static int solicitarEnteroPositivo(String mensaje) {
        int numero = sc.nextInt();

        while (numero < 0) {
            System.out.println("Introduce un numero positivo");
            numero = sc.nextInt();
        }

        return numero;
    }

    public static int solicitarEnteroEnRango(String mensaje, int numMin, int numMax) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.println(mensaje);
            numero = sc.nextInt();

            if (numero >= numMin && numero <= numMax) {
                valido = true;
            } else {
                System.out.println("Error: El número debe estar dentro del rango. Inténtalo de nuevo.");
            }

        }
        return numero;
    }

    public static char solicitarCaracter(String mensaje) {
        char caracter = '\0';
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje);
            String entrada = sc.nextLine();

            if (entrada.isEmpty()) {
                System.out.println("Error: Debes introducir al menos un carácter.");
                continue;
            }

            caracter = entrada.charAt(0);
            valido = true;

        }

        return caracter;
    }

    public static char solicitarCaracterSN(String mensaje) {
        char caracter = '\0';
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje);
            String entrada = sc.nextLine().toUpperCase().trim();

            if (entrada.isEmpty()) {
                System.out.println("Error: Debes introducir un carácter.");
                continue;
            }

            caracter = entrada.charAt(0);

            if (caracter == 'S' || caracter == 'N') {
                valido = true;
            } else {
                System.out.println("Error: Debes introducir 'S' o 'N'.");
            }
        }

        return caracter;
    }
}
