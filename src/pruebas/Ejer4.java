package pruebas;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero positivo: ");
        int num = sc.nextInt();

        while (num <= 0){
            System.out.println("Dije un numero positivo :/ ");
            num = sc.nextInt();
        }

        int suma = 0;
        for (int i = 0; i <= num; i++) {
            suma += i;
        }
        System.out.println("La suma total es: " + suma);
    }
}
