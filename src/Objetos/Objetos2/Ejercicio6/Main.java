package Objetos.Objetos2.Ejercicio6;

import Objetos.Objetos2.Ejercicio6.Exceptions.ProductoException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ProductoException {
        Scanner sc = new Scanner(System.in);
        Producto producto1 = new Producto(4572, "Leche Chamorro", 12.50);
        Producto producto2 = new Producto(5432, "Leche Javi", 10);

        boolean operando = true;

        while (operando) {
            System.out.println("1. Consultar articulo");
            System.out.println("2. Modificar articulo");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(producto1.toString());
                    break;
                case 2:
                    System.out.println("Nuevo codigo del producto: ");
                    int codigo = sc.nextInt();
                    System.out.println("Nueva descripcion del producto: ");
                    String descripcion = sc.next();
                    System.out.println("Precio nuevo del producto: ");
                    double precio = sc.nextDouble();
                    producto1.modificarProducto(codigo, descripcion, precio);
                    System.out.println(producto1.toString());
                    break;
                case 3:
                    System.out.println("¿Seguro que desea salir? (Si/No)");
                    String respuesta = sc.next().toLowerCase();
                    if (respuesta.equals("si")) {
                        operando = false;
                    } else if (respuesta.equals("no")) {
                        System.out.println("Volviendo al menu...");
                    } else {
                        System.out.println("Respuesta no valida");
                    }
                default:
                    System.out.println("Respuesta no valida. Intentalo de nuevo");
            }
        }

    }



}
