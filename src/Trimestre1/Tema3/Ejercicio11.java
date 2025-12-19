package Trimestre1.Tema3;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasame parámetros el tamaño del array");
        int arraytam = sc.nextInt();
        int[] numeros = new int[arraytam];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el valor " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Pasame parámetros el tamaño del otro array");
        int arraytam2 = sc.nextInt();
        int[] numeros2 = new int[arraytam2];

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Introduce el valor " + (i + 1) + ":");
            numeros2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(unirArrays(numeros, numeros2)));

    }
    public static boolean contieneELemento(int[] array, int consulta){
        for (int j : array){
            if (j== consulta){
                return true;
            }
        }
        return false;
    }
    public static int[] unirArrays(int[] array1, int[] array2){
        int size = 0;
        int[] comunes = new int[array1.length];
        int comparacion = Math.min(array1.length, array2.length);
        for (int i = 0; i < comparacion; i++) {
            if(contieneELemento(array1,array2[i]) && !contieneELemento(comunes,array2.length)){
                comunes[size++] = array2[i];
            }
        }
        comunes = Arrays.copyOf(comunes,size);
        return comunes;
    }
}