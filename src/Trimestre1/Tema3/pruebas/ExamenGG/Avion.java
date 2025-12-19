package Trimestre1.pruebas.ExamenGG;

public class Avion {
    private String marca;
    private String modelo;
    private double consumo;
    private Deposito deposito;
    private Revision[] revisiones;

    public Avion(double consumo, Deposito deposito, String modelo, String marca, int numRevisiones) {
        this.consumo = consumo;
        this.deposito = deposito;
        this.modelo = modelo;
        this.marca = marca;
        this.revisiones = new Revision[numRevisiones];
    }

    public void agregarRevision(Revision revision) {
        for (int i = 0; i < revisiones.length; i++) {
            if (revisiones[i] == null) {
                revisiones[i] = revision;
            }
        }
    }

    public Revision getUltimaRevision() {
        for (int i = revisiones.length - 1; i >= 0; i--) {
            if (revisiones[i] != null) {
                return revisiones[i];
            }
        }
        return null;
    }

    public boolean estaListoParaViajar() {
        Revision ultima = getUltimaRevision();
        if (ultima == null){
            return false;
        }
        return ultima.isEstado() && ultima.isInFecha();
    }

    public boolean puedeRealizarRecorrido(double distanciaKm) {
        double combustibleNecesario = consumo * distanciaKm;
        boolean tieneCombustible = deposito.getCapacidadActual() >= combustibleNecesario;

        return tieneCombustible && estaListoParaViajar();
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Combustible actual: " + deposito.getCapacidadActual() + " litros\n" +
                "Listo para viajar: " + (estaListoParaViajar() ? "Sí" : "No");
    }
}
