package Boletin2;

import Boletin1.MiEntradaSalida;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num = MiEntradaSalida.leerEntero("Introduce un numero: ");

        int digitos = 0;
        do {
            num /= 10;
            digitos++;
        } while (Math.abs(num)>0);

        System.out.println("El total de digitos es: " + digitos);
    }
}
