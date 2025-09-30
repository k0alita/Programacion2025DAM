package Boletin1;

import java.util.Scanner;

public class MiEntradaSalida {
    private static Scanner sc = new Scanner(System.in);

    /**
     * Lee un entero mostrando el mensaje pasado como parametro
     * @param mensaje El mensaje a mostrar
     * @return el entrero leido por teclado
     */
    public static int leerEntero(String mensaje) {
        System.out.println("Introduce un numero: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int a = MiEntradaSalida.leerEntero("Introduce un numero");
        System.out.printf("El numero introducido es %d ", a);
    }
}
