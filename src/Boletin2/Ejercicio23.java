package Boletin2;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int M = 1000, D = 500, C = 100, L = 50, X = 10, V = 5, I = 1;

        String numRumano;
        int acumulado = 0;
        int temporal = 0;
        int anterior = Integer.MAX_VALUE;

        numRumano = sc.nextLine();

        for (int i = 0; i < numRumano.length(); i++) {
            char letraActual = numRumano.charAt(i);
            int valorDeLetra = 0;

            switch (letraActual) {
                case 'M': {
                    valorDeLetra = M;
                    break;
                }
                case 'D': {
                    valorDeLetra = D;
                    break;
                }
                case 'C': {
                    valorDeLetra = C;
                    break;
                }
                case 'L': {
                    valorDeLetra = L;
                    break;
                }
                case 'X': {
                    valorDeLetra = X;
                    break;
                }
                case 'V': {
                    valorDeLetra = V;
                    break;
                }
                case 'I': {
                    valorDeLetra = I;
                    break;
                }
            }

            if (valorDeLetra < anterior) {
                if (temporal > 0) {
                    acumulado += temporal;
                }

                temporal = valorDeLetra;

            } else if (valorDeLetra == anterior) {
                acumulado += temporal + valorDeLetra;

                temporal = 0;
            }
            else {
                acumulado += valorDeLetra - temporal;
                temporal = 0;
            }

            anterior = valorDeLetra;
        }

        if (temporal > 0) {
            acumulado += temporal;
        }

        System.out.printf("El numero %s en decimal es %d", numRumano, acumulado);
    }
}