package Trimestre1.Objetos.Objetos2.Ejercicio61;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE LA CLASE PRODUCTO ===\n");

        // Crear varios productos
        Producto p1 = new Producto("Laptop HP", 800.00);
        Producto p2 = new Producto("Mouse Logitech", 25.00);
        Producto p3 = new Producto("Teclado mecánico", 120.00);

        // Mostrar productos creados
        System.out.println("--- Productos creados ---");
        System.out.println(p1);
        System.out.println("\n" + p2);
        System.out.println("\n" + p3);

        // Probar métodos getter
        System.out.println("\n--- Consulta de atributos ---");
        System.out.println("Código del primer producto: " + p1.getCodigo());
        System.out.println("Descripción: " + p1.getDescripcion());
        System.out.println("Precio sin IVA: " + p1.getPrecio() + "€");
        System.out.println("IVA actual: " + (Producto.getIva() * 100) + "%");

        // Probar métodos setter
        System.out.println("\n--- Modificación de atributos ---");
        p2.setDescripcion("Mouse Logitech MX Master 3");
        p2.setPrecio(89.99);
        System.out.println("Producto modificado:");
        System.out.println(p2);

        // Calcular precio de venta
        System.out.println("\n--- Cálculo de precio de venta ---");
        System.out.printf("Precio de venta de '%s': %.2f€\n",
                p3.getDescripcion(), p3.calcularPrecioVenta());

        // Cambiar el IVA (decisión del gobierno)
        System.out.println("\n--- Cambio de IVA ---");
        System.out.println("El gobierno decide aumentar el IVA al 21%");
        Producto.setIva(0.21);

        System.out.println("\nProductos con nuevo IVA:");
        System.out.println(p1);
        System.out.println("\n" + p2);
        System.out.println("\n" + p3);

        // Crear un nuevo producto con el IVA actualizado
        System.out.println("\n--- Nuevo producto con IVA actualizado ---");
        Producto p4 = new Producto("Monitor 27 pulgadas", 250.00);
        System.out.println(p4);

        // Demostrar que el código es único y automático
        System.out.println("\n--- Códigos únicos ---");
        System.out.println("Códigos asignados: " + p1.getCodigo() + ", " +
                p2.getCodigo() + ", " + p3.getCodigo() + ", " +
                p4.getCodigo());

        System.out.println("\n=== FIN DE LA PRUEBA ===");
    }
}