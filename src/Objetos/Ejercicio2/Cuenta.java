package Objetos.Ejercicio2;

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


    public double retirarDinero(double retiro) {
        double dineroResultante;

        System.out.println("Tienes " + dinero + "€ y se ha retirado un total de " + retiro + "€");

        dineroResultante = getDinero() - retiro;
        setDinero(dineroResultante);

        retirosTotales++;

        System.out.println("Saldo resultante: " + dineroResultante + "€");
        return dineroResultante;
    }
    public double ingresoDinero(double ingreso) {
        double dineroResultante;

        System.out.println("Tienes " + dinero + "€ y se ha ingresado un total de " + ingreso + "€");

        dineroResultante = getDinero() + ingreso;
        setDinero(dineroResultante);

        ingresosTotales++;

        System.out.println("Saldo resultante: " + dineroResultante + "€");
        return dineroResultante;
    }

    public int ingresosTotales(){
        return ingresosTotales;
    }
    public int retirosTotales(){
        return retirosTotales;
    }


}
