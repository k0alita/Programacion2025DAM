import java.util.Scanner;

public class EjercicioFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero positivo: ");
        int num = sc.nextInt();

        while (num == 0 || num < 0) {
            System.out.println("Vuelve a introducir los numeros: ");
            num = sc.nextInt();
        }

        int resultadoTotal = 0;

        for (int i = 1 ; i <= num; i++) {
            resultadoTotal += i;
            System.out.println(i);
        }
        System.out.println("La suma de los " + num + " numeros anteriores es: " + resultadoTotal);
    }
}
