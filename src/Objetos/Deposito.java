package Objetos;

public class Deposito {
    private double capacidad_Max;
    private double capacidad_Actual;


    public Deposito() {

    }

    public Deposito(double capacidadMax, double capacidadActual) {
        capacidad_Max = capacidadMax;
        capacidad_Actual = capacidadActual;
    }

    public double getCapacidad_Actual() {
        return capacidad_Actual;
    }

    public void setCapacidad_Actual(double capacidad_Actual) {
        this.capacidad_Actual = capacidad_Actual;
    }

    public double getCapacidad_Max() {
        return capacidad_Max;
    }

    public void setCapacidad_Max(double capacidad_Max) {
        this.capacidad_Max = capacidad_Max;
    }
}
