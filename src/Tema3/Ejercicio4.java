package Tema3;

import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        final int TOTAL_NUMEROS = 6000;

        int[] numeros = new int[TOTAL_NUMEROS];
        int[] contadorUltimoDigito = new int[10];
        Random rand = new Random();

        int sumaTotal = 0;

        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            numeros[i] = rand.nextInt(101);
            sumaTotal += numeros[i];
            int ultimoDigito = numeros[i] % 10;
            contadorUltimoDigito[ultimoDigito]++;
        }

        double media = (double) sumaTotal / TOTAL_NUMEROS;

        System.out.println("=== RESULTADOS ===");
        double sumaPorcentajes = 0;
        int mayorRepeticion = 0;
        int digitoMasRepetido = 0;

        for (int i = 0; i < contadorUltimoDigito.length; i++) {
            double porcentaje = (contadorUltimoDigito[i] * 100.0) / TOTAL_NUMEROS;
            sumaPorcentajes += porcentaje;
            System.out.printf("El dígito %d se ha repetido %d veces. Esto equivale a un %.2f%%\n",
                    i, contadorUltimoDigito[i], porcentaje);

            if (contadorUltimoDigito[i] > mayorRepeticion) {
                mayorRepeticion = contadorUltimoDigito[i];
                digitoMasRepetido = i;
            }
        }

        System.out.print("\nDígitos que NO han aparecido: ");
        boolean algunoFalta = false;
        for (int i = 0; i < contadorUltimoDigito.length; i++) {
            if (contadorUltimoDigito[i] == 0) {
                System.out.print(i + " ");
                algunoFalta = true;
            }
        }
        if (!algunoFalta) {
            System.out.print("Ninguno, todos han aparecido al menos una vez.");
        }

        double mediaPorcentajes = sumaPorcentajes / 10;

        System.out.println("\n\n=== ESTADÍSTICAS FINALES ===");
        System.out.printf("Media de los números generados: %.2f\n", media);
        System.out.printf("El dígito final más repetido es: %d (con %d apariciones)\n", digitoMasRepetido, mayorRepeticion);
        System.out.printf("La suma de todos los porcentajes es: %.2f%%\n", sumaPorcentajes);
        System.out.printf("La media de porcentaje por dígito es: %.2f%%\n", mediaPorcentajes);
    }
}