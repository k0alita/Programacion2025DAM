package Boletin1;

import java.util.Scanner;

public class EjercicioEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char respuesta;
        int menor = Integer.MAX_VALUE;

        do {
            System.out.print("Introduce un número: ");
            int num = sc.nextInt();

            if (num < menor) {
                menor = num;
            }

            do {
                System.out.print("¿Desea introducir más números (S/N)? ");
                respuesta = sc.next().charAt(0);
            } while (respuesta != 'S' && respuesta != 'N');

        } while (respuesta == 'S');

        System.out.println("El número menor introducido es: " + menor);

        sc.close();
    }
}
