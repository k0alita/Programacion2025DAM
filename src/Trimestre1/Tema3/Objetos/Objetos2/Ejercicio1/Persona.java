package Trimestre1.Objetos.Objetos2.Ejercicio1;

import Trimestre1.Objetos.Objetos2.Ejercicio1.Exceptions.PersonaException;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fecha_nacimiento;
    private int DNI;
    private char sexo;
    private float altura;
    private float peso;

    public Persona(String nombre, int dni, char sexo, float peso, float altura, LocalDate fecha_nacimiento) throws PersonaException{
        this.DNI = dni;
        if (altura < 0) {
            throw new PersonaException("No puedes tener una altura negativa");
        }
        this.altura = altura;
        this.sexo = sexo;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;

        if (peso < 0) {
            throw new PersonaException("No puedes tener un peso negativo");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getDNI() {
        return DNI;
    }

    public float getPeso() {
        return peso;
    }

    public char getLetraDni(int dni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[dni % 23];
    }

    public double getIMC() {
        double IMC;
        double altura_metros;

        altura_metros = getAltura() / 100;
        IMC = getPeso() / (altura_metros * altura_metros);

        return IMC;
    }

}
