package Objetos.Objetos3.Ejercicio;

public class Juego {
    private Carta[] baraja;
    private int cartasActuales;

    public Juego() {
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] numeros = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        baraja = new Carta[52];
        cartasActuales = 52;
    }
}

