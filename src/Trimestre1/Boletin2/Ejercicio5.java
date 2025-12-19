package Trimestre1.Boletin2;

import Trimestre1.Boletin1.MiEntradaSalida;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num = MiEntradaSalida.leerEntero("Introduce un numero: ");

        int comprobar = 2;

        while (comprobar <= num / 2 && num % comprobar != 0) {
            comprobar++;
        }
        if (num % comprobar == 0) {
            System.out.printf("El numero %d no es primo", num);
        } else {
            System.out.printf("El numero %d es primo", num);
        }
    }
}