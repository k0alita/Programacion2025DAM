package Trimestre2.Boletin51.Ejercicio1.Ejercicio3;

import Trimestre2.Boletin51.Ejercicio1.Ejercicio3.Exceptions.JuegoRol;

public class Personaje {
    private String nombre;
    private String raza;
    private int fuerza;
    private int inteligencia;
    private int vida_max;
    private int vida_act;

    public Personaje(String nombre, String raza, int fuerza, int inteligencia, int vida_max) throws JuegoRol {
        this.nombre = nombre;
        this.raza = raza;
        setFuerza(fuerza);
        setInteligencia(inteligencia);
        setVida_max(vida_max);
        setVida_act(vida_max);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) throws JuegoRol {
        if (!raza.equalsIgnoreCase("humano") &&
                !raza.equalsIgnoreCase("elfo") &&
                !raza.equalsIgnoreCase("enano") &&
                !raza.equalsIgnoreCase("orco")) {
            throw new JuegoRol("Raza no válida. Debe ser humano, elfo, enano u orco");
        }
        this.raza = raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) throws JuegoRol {
        if (fuerza < 0 | fuerza > 20) {
            throw new JuegoRol("El valor no es valido. Escribe un numero entre 0 y 20");
        } else this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) throws JuegoRol {
        if (inteligencia < 0 | inteligencia > 20) {
            throw new JuegoRol("El valor no es valido. Escribe un numero entre 0 y 20");
        } else this.inteligencia = inteligencia;
    }

    public int getVida_max() {
        return vida_max;
    }

    public void setVida_max(int vida_max) throws JuegoRol {
        if (vida_max < 0 | vida_max > 100) {
            throw new JuegoRol("El valor no es valido. Escribe un numero entre 0 y 100");
        } else this.vida_max = vida_max;
    }

    public int getVida_act() {
        return vida_act;
    }

    public void setVida_act(int vida_act) throws  JuegoRol {
        if (vida_act < 0 | vida_act > getVida_max()) {
            throw new JuegoRol("El valor no es valido. Escribe un numero entre 0 y " + vida_max);
        } else this.vida_act = vida_act;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", fuerza=" + fuerza +
                ", inteligencia=" + inteligencia +
                ", vida_max=" + vida_max +
                ", vida_act=" + vida_act +
                '}';
    }
}
