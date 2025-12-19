package Trimestre1.Tema3;

import Trimestre1.Boletin1.MiEntradaSalida;

public class Ejercicio8 {
    public static int posicionArray(int buscar) {
        int[] numeros = {2,7,5,3,4,6,1,4,7};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                return i + 1;
            }
        }
           return -1;
    }


    public static void main(String[] args) {
        int numero = MiEntradaSalida.leerEntero("Dime un numero: ");
        int pos;
        if ((pos = posicionArray(numero)) == -1 ){
            System.out.println("El numero no esta en el array");
        } else {
            System.out.printf("El numero esta en el array, en la posicion: %d", pos);
        }
    }
}
