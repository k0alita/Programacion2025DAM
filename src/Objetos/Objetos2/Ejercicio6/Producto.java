package Objetos.Objetos2.Ejercicio6;

import Objetos.Objetos2.Ejercicio6.Exceptions.ProductoException;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precioSI;
    private final double IVA = 1.20;

    public Producto(int codigo, String descripcion, double precioSI) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioSI = precioSI;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioSI() {
        return precioSI;
    }

    public void setPrecioSI(double precioSI) {
        this.precioSI = precioSI;
    }

    public void consultaMod(String tipo) throws ProductoException {
        if (tipo.equals("consultar")) {

        } else if (tipo.equals("modificar")) {

        } else {
            throw new ProductoException("Tipo no valido");
        }
    }

    public double calcularPrecio() {
        return getPrecioSI() * IVA;
    }

    @Override
    public String toString() {
        return "Producto\n" + "Codigo: " + codigo +
                "\nDescripcion: " + descripcion +
                "\nPrecioSI: " + precioSI;
    }
}
