package Objetos.Objetos2.Ejercicio4;

import Objetos.Objetos2.Ejercicio4.Exceptions.MiEntradaSalidaException;

public class Main {
    public static void main(String[] args) throws MiEntradaSalidaException {
        MiEntradaSalida.solicitarCaracter("Introduce un caracter");

        MiEntradaSalida.solicitarEntero("Introduce un numero: ");

        MiEntradaSalida.solicitarEnteroPositivo("Introduce un numero positivo: ");

        MiEntradaSalida.solicitarEnteroEnRango("Introduce un numero entre 5 y 10: ", 5, 10);

    }
}
