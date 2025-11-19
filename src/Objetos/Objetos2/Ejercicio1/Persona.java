package Objetos.Objetos2.Ejercicio1;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Persona {
    private String nombre;
    private LocalDate fecha_nacimiento;
    private int DNI;
    private char sexo;
    private float altura;
    private float peso;

    public Persona(){
        nombre = "Alejandro";
        fecha_nacimiento = LocalDate.ofEpochDay(2007-10-28);
        DNI = 29623355;
        sexo = 'h';
        altura = 168;
        peso = 50;
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
