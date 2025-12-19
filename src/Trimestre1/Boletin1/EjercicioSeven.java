package Trimestre1.Boletin1;

import java.util.Scanner;

public class EjercicioSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;

        System.out.println("Que cantidad de numeros quieres introducir: ");
        cantidad = sc.nextInt();

        while (cantidad <= 0) {
            System.out.println("Introduce una cantidad mayor que 0");
            cantidad = sc.nextInt();
        }
        System.out.println("Introduce " + cantidad + " numeros");

        double suma = 0;

        for (int i = 1; i <= cantidad ; i++) {
            System.out.print("Introduce el número " + i + ": ");
            double num = sc.nextDouble();
            suma += num;
        }

        double media = suma / cantidad;
        System.out.println("La media de los " + cantidad + " numeros es " + media);
    }
}
