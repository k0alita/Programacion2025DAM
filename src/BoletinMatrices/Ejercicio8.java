//package BoletinMatrices;
//
///*
//Crea un metodo que reciba dos matrices, que deben ser de igual tamaño, y sume el
//contenido de las posiciones en una tercera matriz, que será la que devuelva:
//| 1 2| + | 4 1| = | 5 3|
//| 4 6| | 1 0| | 5 6|
//
// */
//
//public class Ejercicio8 {
//    public static void main(String[] args) {
//        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}};
//        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}};
//
//        sumaDeMatriz(sumarMatrices(matriz1, matriz2));
//    }
//
//
//    public static int sumarMatrices(int[][] matriz1, int[][] matriz2) {
//        int[][] matrizResultado = new int[matriz1.length][matriz1[0].length];
//        for (int i = 0; i < matriz1.length; i++) { //Recorrer filas y columnas de la matriz
//            for (int j = 0; j < matriz1[i].length; j++) {
//                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
//            }
//        }
//        return matrizResultado;
//    }
//
//    public static void sumarMatriz
//}