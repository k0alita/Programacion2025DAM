package BoletinMatrices;

/*
Crear un metodo que devuelva el número de casilla a la que corresponden unas
coordenadas. Es decir, el número de casilla empezando por la casilla [0,0], y recorriendo
primero por filas y luego por columnas. Por ejemplo, la casilla [1,5] en una matriz de 6x6
ocuparía el número 12. En la misma matriz, la casilla [4,0] ocuparía el número 25.
1 2 3 4 5 6
7 8 9 10 11 12
13 14 15 16 17 18
19 20 21 25 23 24
25 26 27 28 29 30

El metodo no debería recorrer el array con ningún tipo de bucle.
 */

import java.util.Scanner;


public class Ejercicio15 {

    final int FILA = 0;
    final int COLUMNA = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las cordenada X de la matriz");
        FILA = sc.nextInt();
        System.out.println("Dime la cordenada Y de la matriz");
        columna = sc.nextInt();

        System.out.println(fila + " , " + columna);
    }

//    public static int encontrarCordenadas(int[][] matriz) {
//        for (int i = 0; i < matriz.length; i++) {
//            if (i == )
//        }
//
//        return
//    }
}
