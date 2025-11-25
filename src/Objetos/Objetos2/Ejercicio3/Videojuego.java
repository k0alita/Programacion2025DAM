package Objetos.Objetos2.Ejercicio3;

import Objetos.Objetos2.Ejercicio2.DiscoDuro;
import Objetos.Objetos2.Ejercicio2.MicroProcesador;
import Objetos.Objetos2.Ejercicio2.PlacaBase;
import Objetos.Objetos2.Ejercicio2.TarjetaGrafica;
import Objetos.Objetos2.Ejercicio3.Exceptions.VideoJuegoException;

import java.time.Year;

public class Videojuego {
    private String nombre;
    private String compañia;
    private Year creacion;

    private PlacaBase placa;
    private MicroProcesador microProcesador;
    private TarjetaGrafica grafica;
    private DiscoDuro disco;

    private int requisitoNucleos = 4;
    private int requisitoVelocidad = 3;

    public Videojuego() {
        microProcesador.setNum_nuc(6);
        microProcesador.setVelocidad_base(5);
        disco.setCapaciodad(100);
        grafica.setNum_nuc(12);
        grafica.setCant_men(12);
    }

    public void comprobacionesJuego() throws VideoJuegoException {
        if (microProcesador.getNum_nuc() < requisitoNucleos) {
            throw new VideoJuegoException("Los nucleos del procesador son menos de los necesarios");
        }
        if (microProcesador.getVelocidad_base() < requisitoVelocidad) {

        }
    }


}
