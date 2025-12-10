package Objetos.Pruebitas;

import Objetos.MaquinaCafe.Maquina;
import Objetos.Pruebitas.Exceptions.PeliculaExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        boolean leyendo = true;
        int opcion;
        while (leyendo) {
            System.out.println("1. Añadir una pelicula nueva");
            System.out.println("2. Consultar biblioteca");
            System.out.println("3. Buscar peliculas por etiquetas");
            System.out.println("4. Buscar pelicula por titulo");
            System.out.println("5. Buscar peliculas con presupuesto maximo");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    try {
                        biblioteca.añadirPelicula(sc);
                        System.out.println("\nPelícula añadida correctamente.");
                    } catch (PeliculaExceptions e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        biblioteca.consultarBiblioteca();
                    } catch (PeliculaExceptions e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Dime la etiqueta que quieres buscar: ");
                        String etiqueta = sc.next();
                        biblioteca.buscarPorEtiquetas(etiqueta);
                    } catch (PeliculaExceptions e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Dime el titulo que quieres buscar: ");
                        String titulo = sc.next();
                        biblioteca.buscarPorTitulo(titulo);
                    } catch (PeliculaExceptions e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Dime el presupuesto maximo que quieres buscar: ");
                        double presupuesto = sc.nextDouble();
                        biblioteca.buscarPorPresupuesto(presupuesto);
                    } catch (PeliculaExceptions e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Desea apagar la maquina: (Si/No)");
                    String respuesta = sc.next().toLowerCase();
                    if (respuesta.equals("si")) {;
                        leyendo = false;
                    } else if (respuesta.equals("no")) {
                        System.out.println("Volviendo al menu...");
                    } else {
                        System.out.println("Respuesta no valida");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}


