package Trimestre1.Objetos.MaquinaCafe;

import Trimestre1.Objetos.MaquinaCafe.Exceptions.MaquinaException;

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
        setDepCafe(50);
        setDepLeche(50);
        setDepVasos(80);
    }

    public void vaciarMonedero() {
        setMonedero(0);
    }

    public String consultarEstado() {
        return toString();
    }

    @Override
    public String toString() {
        return "------ Estado de la maquina ------ \n " + "Cafe: " + depCafe
                + " \n Leche: " + depLeche
                + " \n Vasos: " + depVasos
                + "\n Monedero: " + monedero + "€" + "\n ---------------------------------";
    }

    public double getMonedero() {
        return monedero;
    }

    public void setMonedero(double monedero) {
        this.monedero = monedero;
    }

    public int getDepVasos() {
        return depVasos;
    }
    public int getDepCafe() {
        return depCafe;
    }
    public int getDepLeche() {
        return depLeche;
    }

    public void setDepCafe(int depCafe) {
        this.depCafe = depCafe;
    }

    public void setDepLeche(int depLeche) {
        this.depLeche = depLeche;
    }

    public void setDepVasos(int depVasos) {
        this.depVasos = depVasos;
    }

    public double servirBebida(String tipo, double dineroIntroducido) throws MaquinaException {
        double precioBebida = 0;
        switch (tipo) {
            case "cafe":
                precioBebida = CAFE;
                if (getDepCafe() <= 0  || getDepVasos() <= 0) {
                    throw new MaquinaException("No hay suficientes depositos de cafe para servir la bebida");
                }
                break;
            case "leche":
                precioBebida = LECHE;
                if (getDepLeche() <= 0  || getDepVasos() <= 0) {
                    throw new MaquinaException("No hay suficientes depositos de leche para servir la bebida");
                }
                break;
            case "cafeleche":
                precioBebida = CAFELECHE;
                if (getDepCafe() <= 0  || getDepLeche() <= 0 ||  getDepVasos() <= 0) {
                    throw new MaquinaException("No hay suficientes depositos para servir la bebida");
                }
                break;
        }

        double cambio = dineroIntroducido - precioBebida;
        if (dineroIntroducido < precioBebida) {
            throw new MaquinaException("Dinero introducido insuficiente. Faltan " + Math.abs(cambio) + "€");
        } else if (monedero < cambio) {
            throw new MaquinaException("Dinero en la maquina insuficiente para el cambio");
        } else if (dineroIntroducido >= precioBebida){
            monedero += dineroIntroducido;
            monedero -= cambio;
            switch (tipo) {
                case "cafe":
                    depCafe--;
                    depVasos--;
                    break;
                case "leche":
                    depLeche--;
                    depVasos--;
                    break;
                case "cafeleche":
                    depCafe--;
                    depLeche--;
                    depVasos--;
                    break;
            }
        }

        return cambio;
    }
}
