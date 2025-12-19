package Trimestre2.Boletin51.Ejercicio1.Ejercicio2;

public class Empresa {
    private final static int NUM_VEHICULOS = 200;
    Vehiculo[] vehiculos;

    public Empresa() {
        vehiculos = new Vehiculo[NUM_VEHICULOS];
    }

    public void addVehiculo(Vehiculo v) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] == null) {
                vehiculos[i] = v;
                return;
            }
        }
    }
}
