package Objetos.Avioneta;

public class Avion {
    private String marca;
    private String modelo;
    private double consumo;
    Deposito deposito = new Deposito();
    Registro registro = new Registro();

    public Avion(double consumo, Deposito deposito, String marca, String modelo, Registro registro) {
        this.consumo = consumo;
        this.deposito = deposito;
        this.marca = marca;
        this.modelo = modelo;
        this.registro = registro;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public boolean listoParaViajar(double distancia) {
        if (registro.getEstado() && consumo * distancia <= deposito.getCapacidad_Actual()) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "------------ Avion ------------" +
                "\nConsumo = " + consumo +
                "\nMarca = " + marca +
                "\nModelo = " + modelo +
                "\nCapacidad_maxima = " + deposito.getCapacidad_Max() +
                "\nCapacidad_actual = " + deposito.getCapacidad_Actual() +
                "\nFecha_registro = " + registro.getFecha() +
                "\nFecha_validez = " + registro.getValidez();
    }
}
