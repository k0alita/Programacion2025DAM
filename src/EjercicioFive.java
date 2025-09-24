import java.util.Scanner;

public class EjercicioFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numeros: ");
        int positivosTotal = 0;

        System.out.println("Introduce un numero (negativo para acabar): ");
        int num = sc.nextInt();
        while (num >= 0) {
            positivosTotal++;
            System.out.println("Introduce un numero (negativo para acabar): ");
            num = sc.nextInt();
        }


        System.out.println("Has introducido: " + positivosTotal + " numeros positivos");
    }
}
