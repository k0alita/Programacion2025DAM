package Objetos.Ejercicio2;

import Objetos.Exceptions.IngresoException;
import Objetos.Exceptions.RetiroException;

public class Cuenta {
    private double dinero;
    private int ingresosTotales;
    private int retirosTotales;

    public Cuenta() {
        dinero = 300;
        ingresosTotales = 0;
        retirosTotales = 0;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public int getIngresosTotales() {
        return ingresosTotales;
    }

    public int getRetirosTotales() {
        return retirosTotales;
    }


    public double retirarDinero(double retiro) throws RetiroException {
        double dineroResultante;

        if (getDinero() < retiro) {
            throw new RetiroException("El saldo es menor al retiro solicitado");
        } else if (retiro < 0) {
            throw new RetiroException("No puedes retirar dinero negativo");
        } else {
            dineroResultante = getDinero() - retiro;
        }
        setDinero(dineroResultante);
        retirosTotales++;

        return dineroResultante;
    }
    public double ingresoDinero(double ingreso) throws IngresoException {
        double dineroResultante;

        if (ingreso < 0) {
            throw new IngresoException("No puedes retirar dinero negativo");
        } else {
            dineroResultante = getDinero() + ingreso;
        }
        setDinero(dineroResultante);
        ingresosTotales++;

        return dineroResultante;
    }

    public int ingresosTotales(){
        return ingresosTotales;
    }
    public int retirosTotales(){
        return retirosTotales;
    }


}
