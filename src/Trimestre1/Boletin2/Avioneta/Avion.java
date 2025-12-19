//package Trimestre1.Boletin2.Avioneta;
//
//import Trimestre1.Boletin2.Avioneta.Exceptions.AvionException;
//
//import java.time.LocalDate;
//
//public class Avion {
//    private static final int NUM_REVISIONES = 5;
//    private String marca;
//    private String modelo;
//    private double consumo;
//    private Deposito deposito;
//    private Registro[] revisiones;
//
//    public Avion(double consumo, Deposito deposito, String marca, String modelo) {
//        this.consumo = consumo;
//        this.deposito = deposito;
//        this.marca = marca;
//        this.modelo = modelo;
//        this.revisiones = new Registro[NUM_REVISIONES];
//    }
//
//    public double getConsumo() {
//        return consumo;
//    }
//
//    public void setConsumo(double consumo) {
//        this.consumo = consumo;
//    }
//
//    public Deposito getDeposito() {
//        return deposito;
//    }
//
//    public void setDeposito(Deposito deposito) {
//        this.deposito = deposito;
//    }
//
//    public String getMarca() {
//        return marca;
//    }
//
//    public void setMarca(String marca) {
//        this.marca = marca;
//    }
//
//    public String getModelo() {
//        return modelo;
//    }
//
//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }
//
//    public Registro[] getRegistro() {
//        return revisiones;
//    }
//
//    public boolean estaListo() throws AvionException {
//        try {
//            Registro ultimaRevision = getUltimaRevision();
////            if (ultimaRevision.getEstado()) {
////                return true;
////            }
//            if (!getUltimaRevision().getEstado() || ultimaRevision.getFecha().plus(ultimaRevision.getValidez()).isBefore(LocalDate.now())){
//                return false;
//            } else return true;
//
//        } catch (AvionException e) {
//            return false;
//        }
//    }
//
//    private Registro getUltimaRevision() throws AvionException {
//        for (int i = revisiones.length - 1; i <= 0; i--) {
//            if (revisiones[i] != null) {
//                return revisiones[i];
//            }
//        }
//        throw new AvionException("El avion no tiene revisiones disponibles");
//    }
//
//    public boolean listoParaViajar(double distancia) {
//        for (int i = 0; i < revisiones.length; i++) {
//            if (revisiones[i].getEstado() && consumo * distancia <= deposito.getCapacidadActual()) {
//                deposito.setCapacidadActual(deposito.getCapacidadActual() - (consumo * distancia));
//                deposito.setCombustibleConsumido(consumo * distancia);
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//    }


//    @Override
//    public String toString() {
//        return "------------ Avion ------------" +
//                "\nConsumo = " + consumo +
//                "\nMarca = " + marca +
//                "\nModelo = " + modelo +
//                "\nCapacidad_maxima = " + deposito.getCapacidadMax() + " L"+
//                "\nCapacidad_actual = " + deposito.getCapacidadActual() + " L"+
//                "\nFecha_registro = " + registro.getFecha() +
//                "\nFecha_validez = " + registro.getValidez();
//    }
