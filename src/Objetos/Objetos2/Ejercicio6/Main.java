package Objetos.Objetos2.Ejercicio6;

import Objetos.Objetos2.Ejercicio6.Exceptions.ProductoException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ProductoException {
        Scanner sc = new Scanner(System.in);
        Producto producto1 = new Producto(4572, "Leche Chamorro", 12.50);
        Producto producto2 = new Producto(5432, "Leche Javi", 10);

        System.out.println(producto1.toString());

        boolean operando = true;

        while (operando) {
            System.out.println("1. Consultar o modificar articulo");
            System.out.println("2. Comprobar precio total");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Que desea hacer. 1. Consular producto 2. Modificar producto");
                    int queHacer = sc.nextInt();
                    break;
                case 2:
                    producto1.calcularPrecio();
                    break;
            }
        }

    }



}
