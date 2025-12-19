package Trimestre1.Objetos.Objetos2.Ejercicio3;

import Trimestre1.Objetos.Objetos2.Ejercicio3.Exceptions.VideoJuegoException;

import java.time.Year;

public class Main {
    public static void main(String[] args) throws VideoJuegoException {
        Year año_creacion = Year.of(2020);
        Videojuego juego = new Videojuego("Valorant", "Riot", año_creacion, 5, 256, 12, 6, 12);



        try {
            if (juego.comprobacionesJuego()) {
                System.out.println("No hay ningun problema");
            }
        } catch (VideoJuegoException e) {
            System.out.println(e.getMessage());
        }
    }
}
