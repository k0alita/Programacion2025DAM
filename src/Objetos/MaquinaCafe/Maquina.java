package Objetos.MaquinaCafe;

import Objetos.MaquinaCafe.Exceptions.MaquinaException;

public class Maquina {
    private final double CAFE = 1.0;
    private final double LECHE = 0.8;
    private final double CAFELECHE = 1.5;
    private int depCafe;
    private int depLeche;
    private int depVasos;
    private double monedero;

    public Maquina() {
        depCafe = 50;
        depLeche = 50;
        depVasos = 80;
    }

    public void llenarDepositos() {

    }

    public void vaciarMonedero() {

    }

    public void consultarEstado() {

    }

    public void servirBebida(String tipo, double dineroIntroducido) throws MaquinaException {
        double precioBebida = 0;
        switch (tipo) {
            case "cafe":
                precioBebida = CAFE;
                break;
            case "leche":
                precioBebida = LECHE;
                break;
            case "cafeleche":
                precioBebida = CAFELECHE;
                break;
        }

        boolean sePuedeServir;

        double cambio = dineroIntroducido - precioBebida;
        if (dineroIntroducido < precioBebida) {
            throw new MaquinaException("Dinero introducido insuficiente. Faltan " + Math.abs(cambio) + "€");
        } else {
            System.out.println("Sirviendo cafe");
        }
    }
}
