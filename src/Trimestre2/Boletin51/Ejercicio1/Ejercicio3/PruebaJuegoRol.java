package Trimestre2.Boletin51.Ejercicio1.Ejercicio3;

import Trimestre2.Boletin51.Ejercicio1.Examen.exceptions.MuerteException;

public class PruebaJuegoRol {

    public static void main(String[] args) {
        try {
            Mago magoA = new Mago("Gandalf", "humano", 10, 18, 80);
            Mago magoB = new Mago("Saruman", "elfo", 12, 19, 90);
            Clerigo clerigoC = new Clerigo("Ezequiel", "enano", 18, 14, 85, "Moradin");

            System.out.println("Estado inicial:");
            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoC);


            magoA.aprendeHechizo("Bola de fuego");
            magoA.aprendeHechizo("Rayo helado");

            magoB.aprendeHechizo("Misil mágico");

            System.out.println("\nDespués de aprender hechizos:");
            System.out.println(magoA);
            System.out.println(magoB);

            magoA.lanzaHechizo(magoB, "Bola de fuego");

            magoB.lanzaHechizo(magoA, "Misil mágico");

            clerigoC.curar(magoB);

            magoA.lanzaHechizo(magoB, "Rayo helado");

            System.out.println("\nEstado final:");
            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoC);

        } catch (MuerteException e) {
            System.err.println("Error de personaje: " + e.getMessage());
        }
    }
}

