package Trimestre1.Tema3;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumaPares = 0;

        for (int i = 0; i < numeros.length; i+=2) {
            sumaPares += numeros[i];
        }

        System.out.println("La suma total es: " + sumaPares);

    }
}
