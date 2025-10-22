package BoletinMatrices;

/*
Crea un metodo que sume todas las posiciones de una matriz y devuelva dicho número
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}}; // Creacion se la matriz y su asignacion a filas y columnas

        int suma = sumaDeMatriz(matriz);

        System.out.println("La suma total de la matriz es: " + suma);

    }

    public static int sumaDeMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length ; i++) { //Recorrer filas y columnas de la matriz
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
