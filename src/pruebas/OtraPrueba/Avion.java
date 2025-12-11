package pruebas.OtraPrueba;

public class Avion {
    private String marca;
    private String modelo;
    private double consumo;
    private Deposito deposito; // CORREGIDO: quitar inicialización aquí
    private Revision revision; // CORREGIDO: quitar inicialización aquí

    public Avion(double consumo, Deposito deposito, String marca, String modelo, Revision revision) {
        this.consumo = consumo;
        this.deposito = deposito;
        this.marca = marca;
        this.modelo = modelo;
        this.revision = revision;
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

    public Revision getRegistro() {
        return revision;
    }

    public void setRegistro(Revision registro) {
        this.revision = registro;
    }

    // CORREGIDO: validar también la fecha
    public boolean listoParaViajar(double distancia) {
        if (revision.getEstado() && revision.isInFecha() && consumo * distancia <= deposito.getCapacidad_Actual()) {
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
                "\nFecha_registro = " + revision.getFecha() +
                "\nFecha_validez = " + revision.getValidez();
    }
}
