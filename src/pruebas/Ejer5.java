package pruebas;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce numeros: ");
        int numero = sc.nextInt();

        int positivosTotales = 0;
        while (numero >= 0) {
            positivosTotales++;
            System.out.println("Introduce un numero (Negativo para parar): ");
            numero = sc.nextInt();
        }
        System.out.println("Has introducido " + positivosTotales + " numeros positivos");
    }
}
