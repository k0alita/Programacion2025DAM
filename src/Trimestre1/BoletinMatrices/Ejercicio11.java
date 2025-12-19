package Trimestre1.BoletinMatrices;
/*
Crea un metodo que reciba dos matrices, y compruebe si son matrices inversas, es decir,
si tienen los mismos valores en los índices inversos:
5 8 9 0         2 3 7 1
4 7 5 2    y    2 5 7 4
1 7 3 2         0 9 8 5
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 1}, {4, 5, 4}, {7, 8, 7}};
        int[][] matriz2 = {{1, 2, 1}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("¿Matriz 1 es Simetrico?: " + comprobarMatrizInversa(matriz1, matriz2));
        System.out.println("¿Matriz 2 es Simetrico?: " + comprobarMatrizInversa(matriz2, matriz1));
    }

    public static boolean comprobarMatrizInversa(int[][] matriz1, int [][] matriz2) {
        if ((matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length)) {
            return false;
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz2[(matriz1.length - 1) - i][(matriz1[i].length - 1) - j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
//
