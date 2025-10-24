package BoletinMatrices;

/*
Crea un metodo que reciba dos matrices, que deben ser de igual tamaño, y sume el
contenido de las posiciones en una tercera matriz, que será la que devuelva:
| 1 2| + | 4 1| = | 5 3|
| 4 6| | 1 0| | 5 6|

 */

public class Ejercicio8 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}};

        int sumaTotal = sumaDeMatriz(matriz, matriz2);

        System.out.println("La suma total de la matriz es: " + sumaTotal);
    }


    public static int sumaDeMatriz(int[][] matriz, int[][] matriz2) {
        int suma = 0;
        int sumaTotal = 0;
        for (int i = 0; i < matriz.length; i++) { //Recorrer filas y columnas de la matriz
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        int suma2 = 0;
        for (int i = 0; i < matriz2.length; i++) { //Recorrer filas y columnas de la matriz
            for (int j = 0; j < matriz2[i].length; j++) {
                suma2 += matriz2[i][j];
            }
        }

        sumaTotal = suma + suma2;

        return sumaTotal;
    }
}