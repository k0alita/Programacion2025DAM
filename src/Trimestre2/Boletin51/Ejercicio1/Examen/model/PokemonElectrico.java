package Trimestre2.Boletin51.Ejercicio1.Examen.model;

import Trimestre2.Boletin51.Ejercicio1.Examen.interfaces.Atacable;

public class PokemonElectrico extends Pokemon implements Atacable {

    public PokemonElectrico(String nombre, int puntosSalud, int nivelAtaque, int nivelDefensa) {
        super(nombre, puntosSalud, nivelAtaque, nivelDefensa);
    }

    @Override
    public void serAtacado() {

    }

}
