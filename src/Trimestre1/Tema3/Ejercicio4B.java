package Trimestre1.Tema3;

import Trimestre1.Boletin1.MiEntradaSalida;

public class Ejercicio4B {
    final static int CANTIDAD_NUMEROS = 6000;
    public static void main(String[] args) {
        int[] digitos = new int[10];
        double media;
        double suma = 0;
        int digito;
        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            int numGenerado = MiEntradaSalida.generaAleatorioEntre(0,100,true);
            suma += numGenerado;
            digitos[numGenerado % 10]++;
        }
    }
}
