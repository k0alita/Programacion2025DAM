package Boletin1;

import java.util.Scanner;

public class MiEntradaSalida {
    private static Scanner sc = new Scanner(System.in);

    /**
     * Lee un entero mostrando el mensaje pasado como parametro
     *
     * @param mensaje El mensaje a mostrar
     * @return el entrero leido por teclado
     */

    /*
    Comentario de
    varias lineas
     */

    //Comentario de una sola linea

    public static int leerEntero(String mensaje) {
        System.out.println(mensaje);
        return sc.nextInt();
    }

    public static int leerEnteroPositivo(String mensaje) {
        System.out.println(mensaje);
        int a = sc.nextInt();
        while (a <= 0) {
            System.out.println("El numero tiene que ser positivo");
            a = sc.nextInt();
        }
        return a;
    }

    public static int leerEnteroEntre(String mensaje) {
        System.out.println(mensaje);
        int a = sc.nextInt();
        while (a < 0 || a > 10) {
            System.out.println("El numero tiene que estar entre 0 y 10");
            a = sc.nextInt();
        }
        return a;
    }


    public static void main(String mensaje) {
        int a = MiEntradaSalida.leerEnteroPositivo("Introduce un numero");
        System.out.printf("El numero introducido es %d ", a);
    }
}

