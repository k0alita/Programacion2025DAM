package Tema3;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {1, -2, 3, 4, 5, 6, -7, -8, 9, 10};

        int numNegativos = 0;

        for (int a: numeros) {
            if (a < 0) numNegativos++;
        }

        System.out.println("El total de numero negativo es: " + numNegativos);
    }
}
