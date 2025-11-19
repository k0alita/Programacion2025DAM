package Objetos.Objetos2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();


        p.setDNI(29623355);

        System.out.println("Letra DNI: " + p.getLetraDni(p.getDNI()));
        System.out.println("DNI Completo: " + p.getDNI()+ p.getLetraDni(p.getDNI()));
        System.out.println("IMC: " + p.getIMC());
    }
}
