package Trimestre1.BoletinMatrices;
/*
Crea un metodo que compruebe si una matriz pasada por parámetro es simétrica en
función del eje X. Es decir, la matriz
1 3 5 6
4 2 0 8
4 2 0 8
1 3 5 6
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] numeros = {{1,3,5,6}, {4,2,0,8}, {4,2,0,8}, {1,3,5,6}};

        System.out.println("La matriz es simetrica?: " + comprobarMatrizSimetrica(numeros));
    }

    public static boolean comprobarMatrizSimetrica(int[][] matriz) {
        for (int i = 0; i <= matriz.length / 2; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[matriz.length - 1 -i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
