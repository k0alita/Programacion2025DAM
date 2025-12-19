package Trimestre1.pruebas.ExamenGG;

public class Deposito {
    private final double CAPACIDAD_MAXIMA;
    private double capacidadActual;

    public Deposito(double capacidadMaxima, double capacidadActual) {
        this.CAPACIDAD_MAXIMA = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public double getCAPACIDAD_MAXIMA() {
        return CAPACIDAD_MAXIMA;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        if (capacidadActual >= 0 && capacidadActual <= CAPACIDAD_MAXIMA) {
            this.capacidadActual = capacidadActual;
        }
    }
}
