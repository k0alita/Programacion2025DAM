package BoletinMatrices;
/*
Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
misma, pero leídos por columnas:
1 3 5 --> La salida es: 1 0 3 2 5 7
0 2 7
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}};

        mostrarMatriz(matriz);
    }
    public static void mostrarMatriz(int[][] matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
