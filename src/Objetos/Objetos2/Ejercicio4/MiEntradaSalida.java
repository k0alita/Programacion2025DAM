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
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.println(mensaje);
            numero = sc.nextInt();

            if (numero > 0) {
                valido = true;
            } else {
                System.out.println("Error: El número debe ser positivo. Inténtalo de nuevo.");
            }

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
}
