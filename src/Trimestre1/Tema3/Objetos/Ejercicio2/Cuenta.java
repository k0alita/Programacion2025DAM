package Trimestre1.Objetos.Ejercicio2;

import Trimestre1.Objetos.Exceptions.CuentaException;
import Trimestre1.Objetos.Exceptions.IngresoException;
import Trimestre1.Objetos.Exceptions.RetiroException;

public class Cuenta {
    private double dinero;
    private int ingresosTotales;
    private int retirosTotales;

    public Cuenta() throws CuentaException {
        setDinero(300);
        ingresosTotales = 0;
        retirosTotales = 0;
    }

    private void setDinero(double dinero) throws CuentaException {
        if (dinero < 0) {
            throw new CuentaException("El saldo no puede ser negativo");
        }
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

    public double retirarDinero(double retiro) throws RetiroException, CuentaException {
        double dineroResultante;

        if (getDinero() < retiro) {
            throw new RetiroException("El saldo es menor al retiro solicitado");
        }
        if (retiro <= 0) {
            throw new RetiroException("No puedes retirar dinero negativo");
        }
        dineroResultante = getDinero() - retiro;

        setDinero(dineroResultante);
        retirosTotales++;

        return dineroResultante;
    }
    public double ingresoDinero(double ingreso) throws IngresoException, CuentaException {
        double dineroResultante;

        if (ingreso <= 0) {
            throw new IngresoException("No puedes ingresar dinero negativo");
        }
        dineroResultante = getDinero() + ingreso;

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
