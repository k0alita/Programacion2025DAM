package BoletinMatrices;

/*
 Crea un metodo que reciba dos matrices, y compruebe si son exactamente iguales.
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}};
        int[][] matriz2 = {{1,2,3}, {4,5,6}};
        boolean contiene = esIgualLaMatriz(matriz, matriz2); // Recibe el resultado del boolean del metodo

        if (contiene) {
            System.out.println("La matriz es igual");
        } else {
            System.out.println("La matriz no es igual");
        }
        esIgualLaMatriz(matriz, matriz2);
    }
    public static boolean esIgualLaMatriz(int[][] matriz, int[][] matriz2) {
        if (matriz.length != matriz2.length) {
            return false;
        }
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length != matriz2[i].length) {
                return false;
            }

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
