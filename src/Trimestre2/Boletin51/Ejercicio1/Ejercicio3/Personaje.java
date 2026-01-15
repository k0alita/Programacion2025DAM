package Trimestre2.Boletin51.Ejercicio1.Ejercicio3;

import Trimestre2.Boletin51.Ejercicio1.Ejercicio3.Exceptions.PersonajeException;

public class Personaje {
    private String nombre;
    private String raza;          // "humano", "elfo", "enano", "orco"
    private int fuerza;           // 0-20
    private int inteligencia;     // 0-20
    private int puntosVidaMax;    // 0-100
    private int puntosVidaAct;    // 0 - puntosVidaMax

    public Personaje(String nombre, String raza, int fuerza,
                     int inteligencia, int puntosVidaMax) throws PersonajeException {
        setNombre(nombre);
        setRaza(raza);
        setFuerza(fuerza);
        setInteligencia(inteligencia);
        setPuntosVidaMax(puntosVidaMax);
        // al crear, los actuales = máximos
        this.puntosVidaAct = this.puntosVidaMax;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getPuntosVidaMax() {
        return puntosVidaMax;
    }

    public int getPuntosVidaAct() {
        return puntosVidaAct;
    }
    public void setNombre(String nombre) throws PersonajeException {
        if (nombre == null || nombre.isBlank()) {
            throw new PersonajeException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public void setRaza(String raza) throws PersonajeException {
        if (raza == null) {
            throw new PersonajeException("La raza no puede ser null");
        }
        String r = raza.toLowerCase();
        if (!r.equals("humano") && !r.equals("elfo") &&
                !r.equals("enano") && !r.equals("orco")) {
            throw new PersonajeException("Raza no válida: " + raza);
        }
        this.raza = r;
    }

    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza < 0 || fuerza > 20) {
            throw new PersonajeException("La fuerza debe estar entre 0 y 20");
        }
        this.fuerza = fuerza;
    }

    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < 0 || inteligencia > 20) {
            throw new PersonajeException("La inteligencia debe estar entre 0 y 20");
        }
        this.inteligencia = inteligencia;
    }

    public void setPuntosVidaMax(int puntosVidaMax) throws PersonajeException {
        if (puntosVidaMax < 0 || puntosVidaMax > 100) {
            throw new PersonajeException("Los puntos de vida máximos deben estar entre 0 y 100");
        }
        this.puntosVidaMax = puntosVidaMax;
        if (this.puntosVidaAct > puntosVidaMax) {
            this.puntosVidaAct = puntosVidaMax;
        }
    }

    public void setPuntosVidaAct(int puntosVidaAct) throws PersonajeException {
        if (puntosVidaAct < 0 || puntosVidaAct > this.puntosVidaMax) {
            throw new PersonajeException("Los puntos de vida actuales deben estar entre 0 y los máximos");
        }
        this.puntosVidaAct = puntosVidaAct;
    }

    // Método de utilidad para cambiar vida sin lanzar excepción desde fuera
    public void modificarVida(int delta) {
        int nuevaVida = this.puntosVidaAct + delta;
        if (nuevaVida < 0) {
            nuevaVida = 0;
        }
        if (nuevaVida > this.puntosVidaMax) {
            nuevaVida = this.puntosVidaMax;
        }
        this.puntosVidaAct = nuevaVida;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", fuerza=" + fuerza +
                ", inteligencia=" + inteligencia +
                ", vida=" + puntosVidaAct + "/" + puntosVidaMax +
                '}';
    }
}
