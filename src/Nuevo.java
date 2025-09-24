import java.util.Scanner;

public class Nuevo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros: ");
        int cantNums = sc.nextInt();

        while (cantNums == 0 || cantNums < 0) {
            System.out.println("Vuelve a introducir los numeros: ");
            cantNums = sc.nextInt();
        }

        for (int i = 1; i < cantNums + 1; i++) {
            if (i % 2 == 0) {
                System.out.println("El numero " + i + " es par");
            } else if (i % 2 != 0){
                System.out.println("El numero "  + i + " es impar");
            }
        }
    }
}