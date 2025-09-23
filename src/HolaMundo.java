import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Introduce tu nombre: ");

        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine(); // Introducir un texto

        System.out.println("Hola " + nombre); //Imprimir saludo + nombre

    }
}


//Prueba (Hola Mundo)