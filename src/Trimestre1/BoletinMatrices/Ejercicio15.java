package Trimestre1.BoletinMatrices;

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


public class Ejercicio15 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,23,2,2,2,2,2,2}, {1,2,23,2,2,2,2,2,2}};
        System.out.println("La posicion 0 , 5 ocupa el numero " + posicionEnMatriz(matriz,0, 5));
    }

    public static int posicionEnMatriz(int[][] matriz, int i, int j) {
        if (matriz == null || matriz.length == 0) {
            return -1; // error
        }
        return matriz[0].length * i + j + 1;
    }
}
