package Trimestre1.Objetos.Avioneta3;

import Trimestre1.Objetos.Avioneta3.Exceptions.AvionException;

public class Deposito {
    public final double CAPACIDAD_MAX;
    private double capacidadActual;

    public Deposito(double capacidadMax, double capacidadActual) throws AvionException {
        if (capacidadMax <= 0) {
            throw new AvionException("Capacidad maxima invalida");
        }
        this.CAPACIDAD_MAX = capacidadMax;
        setCapacidadActual(capacidadActual);
    }

    public void setCapacidadActual(double capacidadActual) throws AvionException {
        if (capacidadActual < 0){
            throw new AvionException("La capacidad actual ...");
        }
        if (capacidadActual > CAPACIDAD_MAX){
            throw new AvionException("La capacidad actual maxima invalida");
        }
        this.capacidadActual = capacidadActual;
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "CAPACIDAD_MAX=" + CAPACIDAD_MAX +
                ", capacidadActual=" + capacidadActual +
                '}';
    }
}
