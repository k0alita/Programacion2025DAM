package Objetos.Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean jugando = true;

        while (jugando) {
            System.out.println("1. Mover liena: A-Arriba, B-Abajo, I-Izquierda, D-Derecha");
            System.out.println("2. Mostrar linea");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Desea finalizar las operaciones: (Si/No)");
                    String respuesta = sc.next().toLowerCase();
                    if (respuesta.equals("si")) {
                        jugando = false;
                    } else if (respuesta.equals("no")) {
                        System.out.println("Volviendo al menu...");
                    } else {
                        System.out.println("Respuesta no valida");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
