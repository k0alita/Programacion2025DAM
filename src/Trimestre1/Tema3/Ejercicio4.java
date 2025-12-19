package Trimestre1.Tema3;

import Trimestre1.Boletin1.MiEntradaSalida;

public class Ejercicio4 {
    final static int NUMEROS_ALEATORIOS = 6000;

    public static void main(String[] args) {
        int[] numeros = new int[NUMEROS_ALEATORIOS];

        double media;
        double suma = 0;
        int digito;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] =  MiEntradaSalida.generaAleatorioEntre(0,100,true);
        }
        for (int a : numeros) {
            suma += a;
        }
        media = suma / NUMEROS_ALEATORIOS;
        System.out.println("La media es: " + media);

        int[] digitos = new int[10];
        for (int b: numeros) {
            digitos[b % 10]++;
        }
        int mayor = numeros[0];
        int mayorIndice = 0;
        for (int i = 0; i < digitos.length; i++) {
            if (digitos[i] > mayor) {
                mayor = digitos[i];
                mayorIndice = i;
            }
        }
        System.out.println("El digito que mas se repite es: " + mayorIndice);
        for (int i = 0; i < digitos.length; i++) {
            System.out.printf("El numero %d se ha repetido %d veces. Equivale a un %.2f%%%n", i, digitos[i], ((digitos[i] / (double) NUMEROS_ALEATORIOS) * 100));
        }
    }
}