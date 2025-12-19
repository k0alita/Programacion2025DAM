package Trimestre2.Boletin51.Ejercicio1.Ejercicio2;

import Trimestre2.Boletin51.Ejercicio1.Ejercicio2.Exceptions.VehiculoException;

public abstract class Vehiculo {
    private Gama gama;
    private final String MATRICULA;
    private final Combustible TIPO_DE_COMBUSTIBLE;
    public static final double PLUS_POR_PLAZA_MINIBUS = 5;
    public static final double PLUS_POR_PMA_FURGONETA = 0.5;

    public Vehiculo(String gama, String matrucula, String combustible) throws VehiculoException{
        setGama(gama);
        this.MATRICULA = matrucula;
        try {
            this.TIPO_DE_COMBUSTIBLE = Combustible.valueOf(combustible.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new VehiculoException("Ese combustible no es valido");
        }
    }

    public void setGama(String gama) throws VehiculoException {
        try {
            this.gama = Gama.valueOf(gama.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new VehiculoException("Esa gama no es valida");
        }
    }

    public Gama getGama() {return gama; }

    @Override
    public String toString()  {
        return " "+
                "gama=" + gama +
                ", matricula='" + MATRICULA + '\'' +
                ", tipoDeCombustible=" + TIPO_DE_COMBUSTIBLE;
    }
    public abstract double calcularAlquilerVehiculo(int dias);
}
