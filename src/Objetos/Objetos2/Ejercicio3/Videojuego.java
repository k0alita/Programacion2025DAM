package Objetos.Objetos2.Ejercicio3;

import Objetos.Objetos2.Ejercicio2.DiscoDuro;
import Objetos.Objetos2.Ejercicio2.MicroProcesador;
import Objetos.Objetos2.Ejercicio2.PlacaBase;
import Objetos.Objetos2.Ejercicio2.TarjetaGrafica;
import Objetos.Objetos2.Ejercicio3.Exceptions.VideoJuegoException;

import java.time.Year;

public class Videojuego {

    private PlacaBase placa;
    private MicroProcesador microProcesador;
    private TarjetaGrafica grafica;
    private DiscoDuro disco;


    private String nombre;
    private String compañia;
    private Year creacion;

    private int requisitoNucleos;
    private int requisitoVelocidad;
    private int requisitoDisco;
    private int requisitoNucleosGrafica;
    private int requisitoMemoria;

    public Videojuego(String nombrre, String compañia, Year año_creacion, int requisitoVelocidad, int requisitoDisco, int requisitoMemoria, int requisitoNucleos, int requisitoNucleosGrafica) {
        this.microProcesador = new MicroProcesador();
        this.disco = new DiscoDuro();
        this.grafica = new TarjetaGrafica();
        this.placa = new PlacaBase();

        this.nombre = nombrre;
        this.compañia = compañia;
        this.creacion = año_creacion;
        this.requisitoDisco = requisitoDisco;
        this.requisitoNucleos = requisitoNucleos;
        this.requisitoMemoria = requisitoMemoria;
        this.requisitoVelocidad = requisitoVelocidad;
        this.requisitoNucleosGrafica = requisitoNucleosGrafica;
    }

    public boolean comprobacionesJuego() throws VideoJuegoException {
        if (microProcesador.getNum_nucl() < requisitoNucleos) {
            throw new VideoJuegoException("Los nucleos del procesador son menos de los necesarios");
        }
        if (microProcesador.getVelocidad_base() < requisitoVelocidad) {
            throw new VideoJuegoException("La Valocidad del procesador no es suficiente");
        }
        if (disco.getCapaciodad() < requisitoDisco) {
            throw new VideoJuegoException("Espacio insuficiente");
        }
        if (grafica.getNum_nuc() < requisitoNucleosGrafica) {
            throw new VideoJuegoException("Nucleos en la grafica insuficientes");
        }
        if (grafica.getCant_men() < requisitoMemoria) {
            throw new VideoJuegoException("Memoria de video insuficiente");
        }
        return true;
    }


}
