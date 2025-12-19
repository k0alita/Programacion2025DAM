package Trimestre1.BoletinMatrices;
/*
Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
misma, leídos por filas:
1 3 5 --> La salida es: 1 3 5 0 2 7
0 2 7
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 5}, {0, 2, 7}}; // Creacion se la matriz y su asignacion a filas y columnas

        mostrarMatrizEnUnaLinea(matriz);
    }

    public static void mostrarMatrizEnUnaLinea(int[][] matriz) {
        // Recorrer la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); // Mostrar la matriz en linea
            }
        }
    }
}
