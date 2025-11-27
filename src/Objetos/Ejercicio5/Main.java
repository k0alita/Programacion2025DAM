package Objetos.Ejercicio5;

import Objetos.Ejercicio5.Exceptions.LineaException;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Punto punto1 = new Punto(1,1);
        Punto punto2 = new Punto(2, 2);
        Punto punto3 = new Punto(0, 1);
        Punto punto4 = new Punto(1, 2);

        Linea linea1 = new Linea(punto1, punto2);
        Linea linea2 = new Linea(punto3, punto4);

        if (linea1.equals(linea2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        try {
            linea2.moverArriba(1);
        } catch (LineaException e) {
            System.out.println(e.getMessage());
        }
        if (linea1.equals(linea2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }


        boolean jugando = true;

        while (jugando) {
            System.out.println("1. Mover linea: A-Arriba, B-Abajo, I-Izquierda, D-Derecha");
            System.out.println("2. Mostrar linea");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("A-Arriba, B-Abajo, I-Izquierda, D-Derecha");
                    String movimineto = sc.next().toLowerCase();
                    System.out.println("Que distancia te deseas mover: ");
                    int distancia = sc.nextInt();
                    switch (movimineto) {
                        case "a":
                            try {
                                linea2.moverArriba(distancia);
                            } catch (LineaException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                    }
                    break;
                case 2:
                    break;
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
