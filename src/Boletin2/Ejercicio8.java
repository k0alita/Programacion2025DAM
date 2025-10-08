package Boletin2;

/*
Realizar un programa que calcule las soluciones de una ecuación de
segundo grado. Deben pedirse los tres coeficientes A, B, C e informar de si
la ecuación tiene dos soluciones, una solución, o ninguna solución.

A*x2+ B*x+C= 0
 */

import Boletin1.MiEntradaSalida;

public class Ejercicio8 {
    public static void main(String[] args) {
        double a = MiEntradaSalida.leerEntero("Introduce el coeficiente A");
        double b = MiEntradaSalida.leerEntero("Introduce el coeficiente B");
        double c = MiEntradaSalida.leerEntero("Introduce el coeficiente C");

        System.out.println("Esta ecuación de segundo grado tiene "+MiEntradaSalida.ecuacionSegundoGrado(a,b,c, false)+" soluciones");
    }
}
