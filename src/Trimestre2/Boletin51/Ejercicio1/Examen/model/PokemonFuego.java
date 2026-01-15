package Trimestre2.Boletin51.Ejercicio1.Examen.model;

import Trimestre2.Boletin51.Ejercicio1.Examen.interfaces.Atacable;

public class PokemonFuego extends Pokemon implements Atacable {

    public PokemonFuego(String nombre, int puntosSalud, int nivelAtaque, int nivelDefensa) {
        super(nombre, puntosSalud, nivelAtaque, nivelDefensa);
    }

    @Override
    public void serAtacado() {

    }

}
