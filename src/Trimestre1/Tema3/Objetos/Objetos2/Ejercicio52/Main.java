package Trimestre1.Objetos.Objetos2.Ejercicio52;

import Trimestre1.Objetos.Objetos2.Ejercicio52.Exceptions.ProductoException;

public class Main {
    static void main(String[] args) throws ProductoException {
        Producto producto = null;
        try {
            producto = new Producto("Jamon", 2000);
            System.out.println("Producto 1: " + producto.getDescripcion() + "\nCodigo: " + producto.getCodigo());
            System.out.printf("Precio sin IVA: %.2f€%n", producto.getPrecioSinIva());
            System.out.printf("Precio con IVA: %.2f€%n", producto.precioVenta());
        } catch (ProductoException e) {
            System.out.println(e.getMessage());
        }



    }
}
