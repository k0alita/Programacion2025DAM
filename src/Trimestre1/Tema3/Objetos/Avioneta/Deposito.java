package Trimestre1.Objetos.Avioneta;

public class Deposito {
    private double capacidadMax;
    private double capacidadActual;
    private double combustibleConsumido;

    public Deposito(double capacidadMax, double capacidadActual) {
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(double capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getCombustibleConsumido() {
        return combustibleConsumido;
    }

    public void setCombustibleConsumido(double combustibleConsumido) {
        this.combustibleConsumido = combustibleConsumido;
    }
}
