package Objetos.Pruebitas;
import Objetos.Pruebitas.Exceptions.PeliculaExceptions;

import java.util.Scanner;

public class Biblioteca {
    private Pelicula[] peliculas;
    private int contador;
    private final int TAM_MAXIMO = 20;
    Scanner sc = new Scanner(System.in);

    public Biblioteca() {
        peliculas = new Pelicula[TAM_MAXIMO];
        contador = 0;
    }

    public void añadirPelicula(Scanner sc) throws PeliculaExceptions {
        if (contador >= TAM_MAXIMO) {
            throw new PeliculaExceptions("Error: No se ha podido añadir la pelicula");
        }
        System.out.println("--------Añadir Pelicula--------");
        sc.nextLine();

        System.out.println("Título: ");
        String titulo = sc.next();

        System.out.println("Año de estreno: ");
        int año_estreno = sc.nextInt();

        System.out.println("Director: ");
        String director = sc.next();

        System.out.println("Presupuesto: ");
        double presupuesto = sc.nextDouble();

        System.out.println("Recaudación: ");
        double recaudacion = sc.nextDouble();

        System.out.println("Sinopsis: ");
        String sinopsis = sc.next();

        System.out.println("Etiquetas (separadas por comas): ");
        String etiquetas = sc.next();

        peliculas[contador] = new Pelicula(titulo, año_estreno, director, presupuesto, recaudacion, sinopsis, etiquetas);
        contador++;

        System.out.println("\nPelícula añadida correctamente.");
    }

    public void consultarBiblioteca() throws PeliculaExceptions{
        if (contador == 0) {
            throw new PeliculaExceptions("La biblioteca esta vacia");
        }

        System.out.println("------- BIBLIOTECA -------");
        System.out.println("Total de películas: " + contador + "/" + TAM_MAXIMO);

        for (int i = 0; i < contador; i++) {
            System.out.println(peliculas[i]);
        }
    }

    public void buscarPorEtiquetas(String etiqueta) throws PeliculaExceptions {
        for (int i = 0; i < contador; i++) {
            if (peliculas[i].getEtiquetas().toLowerCase().contains(etiqueta.toLowerCase())) {
                System.out.println(peliculas[i]);
            } else {
                throw new PeliculaExceptions("No se han encontrado peliculas con esa etiqueta");
            }
        }
    }

    public void buscarPorTitulo(String titulo) throws PeliculaExceptions{
        for (int i = 0; i < contador; i++) {
            if (peliculas[i].getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(peliculas[i]);
            } else {
                throw new PeliculaExceptions("No se han encontrado peliculas con ese titulo");
            }
        }
    }

    public void buscarPorPresupuesto(double presupuesto) throws PeliculaExceptions {
            for (int i = 0; i < contador; i++) {
                if (peliculas[i].getPresupuesto() >= presupuesto) {
                    System.out.println("• " + peliculas[i].getTitulo() + " (Presupuesto: " + peliculas[i].getPresupuesto() + ")");
            } else {
                throw new PeliculaExceptions("No se han encontrado peliculas con este presupuesto");
            }
        }
    }
}
