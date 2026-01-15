package Trimestre2.Boletin51.Ejercicio1.Ejercicio3;

import Trimestre2.Boletin51.Ejercicio1.Ejercicio3.Exceptions.PersonajeException;

public class Mago extends Personaje {
    private static final int TAMANO_HECHIZOS = 4;
    private String[] hechizos;

    public Mago(String nombre, String raza, int fuerza,
                int inteligencia, int puntosVidaMax) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, puntosVidaMax);

        if (inteligencia < 17) {
            throw new PersonajeException("Un Mago debe tener inteligencia >= 17");
        }
        if (fuerza > 15) {
            throw new PersonajeException("Un Mago debe tener fuerza <= 15");
        }

        hechizos = new String[TAMANO_HECHIZOS];
    }

    public void aprendeHechizo(String hechizo) throws PersonajeException {
        if (hechizo == null || hechizo.isBlank()) {
            throw new PersonajeException("El nombre del hechizo no puede estar vacío");
        }
        for (int i = 0; i < hechizos.length; i++) {
            if (hechizos[i] == null) {
                hechizos[i] = hechizo;
                return;
            }
        }
        throw new PersonajeException("El mago ya tiene memorizados 4 hechizos");
    }

    public void lanzaHechizo(Personaje objetivo, String hechizo) throws PersonajeException {
        if (objetivo == null) {
            throw new PersonajeException("El objetivo no puede ser null");
        }
        if (hechizo == null || hechizo.isBlank()) {
            throw new PersonajeException("El nombre del hechizo no puede estar vacío");
        }

        int indice = -1;
        for (int i = 0; i < hechizos.length; i++) {
            if (hechizos[i] != null && hechizos[i].equals(hechizo)) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            throw new PersonajeException("El mago no conoce el hechizo: " + hechizo);
        }

        objetivo.modificarVida(-10);

        hechizos[indice] = null;
    }

    public String[] getHechizos() {
        return hechizos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" | Hechizos: [");
        for (int i = 0; i < hechizos.length; i++) {
            if (hechizos[i] != null) {
                sb.append(hechizos[i]);
            } else {
                sb.append("-");
            }
            if (i < hechizos.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
