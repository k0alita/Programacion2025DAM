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
        double numA = MiEntradaSalida.leerEntero("Introduce el coeficiente A");
        double numB = MiEntradaSalida.leerEntero("Introduce el coeficiente B");
        double numC = MiEntradaSalida.leerEntero("Introduce el coeficiente C");

        if (numA == 0) {
            System.out.println("No es una ecuacion de segundo grado");
        } else {
            double delta = numB * numB - 4 * numA * numC;

            if (delta > 0) {
                double x1 = (-numB + Math.sqrt(delta)) / (2 * numA);
                double x2 = (-numB - Math.sqrt(delta)) / (2 * numA);
                System.out.println("La ecuacion tiene dos soluciones: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -numB / (2 * numA);
                System.out.println("La ecuacion tiene una solucion: x = " + x);
            } else {
                System.out.println("La ecuacion no tiene soluciones reales");
            }
        }
    }
}
