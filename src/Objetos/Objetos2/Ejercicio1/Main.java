package Objetos.Objetos2.Ejercicio1;

import Objetos.Objetos2.Ejercicio1.Exceptions.PersonaException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws PersonaException {
        LocalDate fechaNacimiento = LocalDate.of(2007, 10, 28);

        try {
            Persona p = new Persona("alejandro", 29623355, 'H', 50, 168, fechaNacimiento);

            System.out.println("Letra DNI: " + p.getLetraDni(p.getDNI()));
            System.out.println("DNI Completo: " + p.getDNI()+ p.getLetraDni(p.getDNI()));
            System.out.println("IMC: " + p.getIMC());

        } catch (PersonaException e) {
            System.out.println(e.getMessage());
        }


    }
}
