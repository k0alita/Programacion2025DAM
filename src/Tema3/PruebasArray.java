package Tema3;

public class PruebasArray {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,7,8};

        for (int a: x){
            System.out.println(a);
        }
    }

    public static void pruebaInt(int x) {
        x = 0;
    }

    public static void modificaArray(int[] enteros) {
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = 0;
        }
    }
}


