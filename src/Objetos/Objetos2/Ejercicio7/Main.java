package Objetos.Objetos2.Ejercicio7;

import Objetos.Objetos2.Ejercicio7.Exceptions.JarraExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jarra jarraA = null;
        Jarra jarraB = null;
        boolean activo = true;
        System.out.println("Bienvenido a las jarras.\n");
        while (jarraA==null) {
            System.out.println("Introduce la capacidad de la jarraA");
            int capacidadJarraA = sc.nextInt();
            try {
                jarraA = new Jarra(capacidadJarraA);
            } catch (JarraExceptions e) {
                System.out.println(e.getMessage());
            }
        } while (jarraB == null) {
            System.out.println("Introduce la capacidad de la jarraB");
            int capacidadJarraB = sc.nextInt();
            try {
                jarraB = new Jarra(capacidadJarraB);
            } catch (JarraExceptions e) {
                System.out.println(e.getMessage());
            }
        }



    }
}