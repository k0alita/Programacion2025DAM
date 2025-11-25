package Objetos.Objetos2.Ejercicio2;

public class TarjetaGrafica {
    private String marca;
    private String modelo;
    private int num_nuc;
    private float velocidad;
    private int cant_men;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCant_men() {
        return cant_men;
    }

    public void setCant_men(int cant_men) {
        this.cant_men = cant_men;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNum_nuc() {
        return num_nuc;
    }

    public void setNum_nuc(int num_nuc) {
        this.num_nuc = num_nuc;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
}
