package Trimestre2.Boletin51.Ejercicio1.Ejercicio3;

import Trimestre2.Boletin51.Ejercicio1.Examen.exceptions.MuerteException;

public class Clerigo extends Personaje {

    private String dios;

    public Clerigo(String nombre, String raza, int fuerza,
                   int inteligencia, int puntosVidaMax,
                   String dios) throws MuerteException {
        super(nombre, raza, fuerza, inteligencia, puntosVidaMax);

        if (fuerza < 18) {
            throw new MuerteException("Un Clérigo debe tener fuerza >= 18");
        }
        if (inteligencia < 12 || inteligencia > 16) {
            throw new MuerteException("Un Clérigo debe tener inteligencia entre 12 y 16");
        }
        if (dios == null || dios.isBlank()) {
            throw new MuerteException("El nombre del dios no puede estar vacío");
        }
        this.dios = dios;
    }

    public String getDios() {
        return dios;
    }

    public void setDios(String dios) throws MuerteException {
        if (dios == null || dios.isBlank()) {
            throw new MuerteException("El nombre del dios no puede estar vacío");
        }
        this.dios = dios;
    }

    public void curar(Personaje objetivo) throws MuerteException {
        if (objetivo == null) {
            throw new MuerteException("El objetivo no puede ser null");
        }
        objetivo.modificarVida(+10);
    }

    @Override
    public String toString() {
        return super.toString() + " | Dios='" + dios + "'";
    }
}

