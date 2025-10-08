package Boletin2;

/*
Realizar un programa que muestre todas las tablas de multiplicar (del 1 al
10).
 */

public class Ejercicio9 {
    public static void main(String[] args) {

        int num = 1;

        while (num != 10) {
            num++;
            System.out.println();
            System.out.println("Tabla del: " + num);
            for (int i = 1; i < 11; i++) {
                int resultadoTotal = num * i;
                System.out.println(num + " x " + i + " = " + resultadoTotal);
            }
        }

    }
}
