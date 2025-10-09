package BoletinRefuerzo;

import Boletin1.MiEntradaSalida;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num1 = MiEntradaSalida.leerEntero("Introduce un numero");
        int num2 = MiEntradaSalida.leerEntero("Introduce otro numero");

        int resultado = num1 + num2;

        System.out.println("El resultado es: " + resultado);
    }
}
