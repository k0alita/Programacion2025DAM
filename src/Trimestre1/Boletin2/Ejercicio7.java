package Trimestre1.Boletin2;

/*
Realizar un programa que solicite dos números enteros mayores que 0, que
calcule el máximo común divisor entre ellos mediante el algoritmo de
Euclides y que muestre por pantalla el resultado.
 */

import Trimestre1.Boletin1.MiEntradaSalida;

public class Ejercicio7 {
    public static void main(String[] args) {
        int num1 = MiEntradaSalida.leerEnteroPositivo("Introduce un numero: ");
        int num2 = MiEntradaSalida.leerEnteroPositivo("Introduce otro numero: ");

        while (num2 != 0) {
            int resto = num1 % num2;
            num1 = num2;
            num2 = resto;
        }

        System.out.println("El maximo comun divisor es: " + num1);
    }
}
