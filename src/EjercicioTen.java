import java.util.Scanner;

public class EjercicioTen {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un número entero positivo o cero: ");
            num = sc.nextInt();
        } while (num < 0);

        int resultadoFac = 1;

        for (int i = 1 ; i <= num; i++) {
            resultadoFac *= i;
            System.out.println(i);
        }

        System.out.print("El resultado factorial de: " + num + " es " + resultadoFac);
    }
}
