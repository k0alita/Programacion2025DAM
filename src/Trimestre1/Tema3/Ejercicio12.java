package Trimestre1.Tema3;

public class Ejercicio12 {
    public static int[] ordenarEnBurbuja(int[] array) {
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        ordenarEnBurbuja(array);

        System.out.println("Array ordenado de menor a mayor:");
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
