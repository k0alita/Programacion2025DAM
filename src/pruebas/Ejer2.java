package pruebas;

import java.util.Scanner;

public class Ejer2 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para mostrar la tabla de multiplicar: ");
        int num = sc.nextInt();

        while (num < 0 || num > 10) {
            System.out.println("Introduce un numero entre 0 y 10");
            num = sc.nextInt();
        }

        int resultadoTotal = 1;

        for (int i = 1; i < 11; i++) {
            resultadoTotal = num * i;
            System.out.println(num + " x " + i + " = " + resultadoTotal);
        }
    }
}
