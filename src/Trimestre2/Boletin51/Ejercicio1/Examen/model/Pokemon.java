package Trimestre2.Boletin51.Ejercicio1.Examen.model;

import Trimestre2.Boletin51.Ejercicio1.Examen.enums.WeatherCondition;
import Trimestre2.Boletin51.Ejercicio1.Examen.exceptions.MuerteException;
import Trimestre2.Boletin51.Ejercicio1.Examen.exceptions.RoundStartException;
import Trimestre2.Boletin51.Ejercicio1.Examen.exceptions.ValorNoValidoException;
import Trimestre2.Boletin51.Ejercicio1.Examen.interfaces.Atacable;
import Trimestre2.Boletin51.Ejercicio1.Examen.interfaces.Atacador;

public abstract class Pokemon implements Atacador {
    private String nombre;
    private int puntosSalud;
    private int nivelAtaque;
    private int nivelDefensa;

    public Pokemon(String nombre, int puntosSalud, int nivelAtaque, int nivelDefensa) {
        this.nombre = nombre;
        this.puntosSalud = puntosSalud;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        nivelAtaque = nivelAtaque;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        nivelDefensa = nivelDefensa;
    }

    public boolean estaVivo() {
        return false;
    }

    public void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException {
    }

    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {

    }

    @Override
    public void atacar() {

    }

}
