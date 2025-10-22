package BoletinMatrices;

/*
Crea un metodo que compruebe si en una matriz hay algún valor negativo, y devuelva un
valor booleano.
 */


public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] matriz = {{1, -2, 3}, {4, 5, 6}}; // Creacion se la matriz y su asignacion a filas y columnas
        boolean contiene = contieneNegativo(matriz); // Recibe el resultado del boolean del metodo

        if (contiene) {
            System.out.println("La matriz contiene numero negativo");
        } else {
           System.out.println("La matriz no contiene numero negativo");
        }
    }

    public static boolean contieneNegativo(int[][] matriz) {

        for (int i = 0; i < matriz.length ; i++) { //Recorrer filas y columnas de la matriz
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0){
                    return true;
                }
            }
        }
        return false;
    }
}
