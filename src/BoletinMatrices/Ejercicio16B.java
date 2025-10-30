package BoletinMatrices;

public class Ejercicio16B {
    public static void main(String[] args) {  //Ejemplo de uso que imprime la matriz resultado
        int[][] matriz = {{1, 0, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] resultado = generarMatrizResultado(matriz);
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean esPar(int valor) {
        return valor % 2 == 0;
    }

    public static int contarAdyacentesPares(int[][] matriz, int fila, int col) {
        int contador = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = col - 1; j <= col + 1 ; j++) {
                if (i == fila && j == col) continue;
                if (i >= 0 && i < matriz.length && j >= 0 && j < matriz[0].length) {
                    if (esPar(matriz[i][j])) contador++;
                }
            }
        }
        return contador;
    }

    public static int[][] generarMatrizResultado(int[][] matriz) {
        int [][] resultado = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultado[i][j] = contarAdyacentesPares(matriz,i,j);
            }
        }
        return resultado;
    }
}
