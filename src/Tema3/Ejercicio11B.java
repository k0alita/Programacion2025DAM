package Tema3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio11B {

    /*
     * Crea un método que acepte 2 arrays, y devuelva un nuevo array con los elementos
     * que ambos arrays tienen en común (la intersección).
     */

    public static void main(String[] args) {

        int[] array1 = {1, 2, 1, 3, 3, 5, 6, 2, 9, 5, 6};
        int[] array2 = {4, 2, 5, 9, 1, 4, 6, 2, 10, 4, 7, 9};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int[] array3 = new int[Math.min(array1.length, array2.length)];
        int elementosArrayFinal = 0;

        for (int i = 0; i < array1.length; i++) {
            if (contieneElemento(array2, array1[i]) && !contieneElemento(array3, array1[i], elementosArrayFinal)){
                array3[elementosArrayFinal] = array1[i];
                elementosArrayFinal++;
            }
        }

        int[] arrayADevolver = new int[elementosArrayFinal];
        for (int i = 0; i < elementosArrayFinal; i++){
            arrayADevolver[i] = array3[i];
        }


        System.out.println(Arrays.toString(arrayADevolver));

    }

    public static boolean contieneElemento(int[] array, int elementoABuscar, int max){
        for (int i = 0; i < max; i++) {
            if (array[i] == elementoABuscar){
                return true;
            }
        }
        return false;
    }

    public static boolean contieneElemento(int[] array, int elementoABuscar){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementoABuscar){
                return true;
            }
        }
        return false;
    }
}
