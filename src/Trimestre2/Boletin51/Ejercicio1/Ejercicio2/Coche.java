package Trimestre2.Boletin51.Ejercicio1.Ejercicio2;

public class Coche extends Vehiculo{

    public Coche(String gama, String matricula, )

    @Override
    public double calcularAlquilerVehiculo(int dias) {
        double precioFinal = 0;
        precioFinal += getGama().getPRECIO()*dias;
        precioFinal += getTIPO_DE_COMBUSTIBLE().getPrecio()*dias;
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Coche{" +
                super.toString()+"}";
    }
}
