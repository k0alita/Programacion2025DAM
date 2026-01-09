package Trimestre2.Boletin51.Ejercicio1.Ejercicio3;

import Trimestre2.Boletin51.Ejercicio1.Ejercicio3.Exceptions.JuegoRol;

public class Mago extends Personaje{
    private String[] hechizos;

    public Mago(String nombre, String raza, int fuerza, int inteligencia, int vida_max, int vida_act, Personaje personaje, String[] hechizos) throws JuegoRol {
        super(nombre, raza, fuerza, inteligencia, vida_max);
        if (inteligencia < 17) {
            throw new JuegoRol("La inteligencia no es suficiente para ser mago (min 17)");
        }
        if (fuerza > 15) {
            throw new JuegoRol("La fuerza es demasiado alta para ser mago (max 15)");
        }

    }

    public void guardar_hechizo(String hechizo) {

    }


    public void aprendeHechizo(String hechizo) {

    }

    public void lanzaHechizo(Personaje personaje_afectado, String hechizo) {

    }
}
