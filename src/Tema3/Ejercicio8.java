package Tema3;

import Boletin1.MiEntradaSalida;

public class Ejercicio8 {
    public static void posicionArray(int buscar) {
        int[] numeros = {7, 4, 3, 1, 9, 5, 6, 8, 2, 10};

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                System.out.println("El numero buscando ocupa la posicion: " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("-1");
        }
    }


    public static void main(String[] args) {
        posicionArray(4);
    }
}
