package Trimestre1.Objetos.Objetos2.Ejercicio52;

import Trimestre1.Objetos.Objetos2.Ejercicio52.Exceptions.ProductoException;

public class Producto {
    private static double IVA = 0.2;
    private static int contador = 1;

    private int codigo;
    private String descripcion;
    private double precioSinIva;

    public Producto(String descripcion, double precioSinIva) throws ProductoException {
        this.codigo = contador++;
        this.descripcion = descripcion;
        setPrecioSinIva(precioSinIva);
    }

    public int getCodigo() {
        return codigo;
    }

    public static double getIVA() {
        return IVA;
    }

    public static void setIVA(double IVA) {
        Producto.IVA = IVA;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Producto.contador = contador;
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

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) throws ProductoException{
        if (precioSinIva < 0) {
            throw new ProductoException("Error el precio no puede ser menor que 0");
        }
        this.precioSinIva = precioSinIva;
    }

    public double precioVenta() {
        return precioSinIva * (1+IVA);
    }




}
