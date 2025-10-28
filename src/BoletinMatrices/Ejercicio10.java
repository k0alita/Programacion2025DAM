package BoletinMatrices;

/*
Crea un metodo que compruebe si una matriz pasada por parámetro es simétrica en
función del eje Y. Es decir, la matriz
1 3 0 3 1
4 2 7 2 4
6 1 9 1 6
0 8 8 8 0
 */
public class Ejercicio10 {
    public static boolean comprobarMatrizSimetricaEjeY(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= matriz[0].length / 2; j++) {
                if (matriz[i][j] != matriz[i][matriz[0].length - 1 - j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 1}, {4, 5, 4}, {7, 8, 7}};
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("¿Matriz 1 es Simetrico?: " + comprobarMatrizSimetricaEjeY(matriz1));
        System.out.println("¿Matriz 2 es Simetrico?: " + comprobarMatrizSimetricaEjeY(matriz2));
    }

}


