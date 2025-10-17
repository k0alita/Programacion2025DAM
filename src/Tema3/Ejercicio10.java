package Tema3;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] array = {1,1,1,2,3,4,4,4,5,6};
        int duplicados = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                duplicados++;
            }
        }

    }

}
