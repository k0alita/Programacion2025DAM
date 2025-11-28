package Objetos.Objetos2.Ejercicio61;

/**
 * Clase que representa un producto con código único, descripción y precio.
 * Todos los productos comparten el mismo IVA.
 */
class Producto {
    // Atributos de clase (estáticos - compartidos por todas las instancias)
    private static int contadorCodigo = 0;
    private static double iva = 0.20; // IVA del 20%

    // Atributos de instancia
    private int codigo;
    private String descripcion;
    private double precio; // Precio sin IVA

    /**
     * Constructor de la clase Producto.
     * Genera automáticamente un código único.
     *
     * @param descripcion Descripción del producto
     * @param precio Precio sin IVA del producto
     */
    public Producto(String descripcion, double precio) {
        contadorCodigo++;
        this.codigo = contadorCodigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // MÉTODOS GETTER (Consulta)

    /**
     * Obtiene el código único del producto.
     * @return código del producto
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Obtiene la descripción del producto.
     * @return descripción del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene el precio sin IVA del producto.
     * @return precio sin IVA
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene el IVA actual (método estático).
     * @return IVA en formato decimal (ej: 0.20 para 20%)
     */
    public static double getIva() {
        return iva;
    }

    // MÉTODOS SETTER (Modificación)

    /**
     * Modifica la descripción del producto.
     * @param descripcion nueva descripción
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Modifica el precio sin IVA del producto.
     * @param precio nuevo precio sin IVA
     */
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo");
        }
    }

    /**
     * Modifica el IVA para todos los productos (método estático).
     * @param nuevoIva nuevo porcentaje de IVA en formato decimal
     */
    public static void setIva(double nuevoIva) {
        if (nuevoIva >= 0 && nuevoIva <= 1) {
            iva = nuevoIva;
        } else {
            System.out.println("Error: El IVA debe estar entre 0 y 1");
        }
    }

    // MÉTODOS DE CÁLCULO

    /**
     * Calcula el precio de venta del producto (precio + IVA).
     * @return precio de venta con IVA incluido
     */
    public double calcularPrecioVenta() {
        return precio + (precio * iva);
    }

    /**
     * Calcula el importe del IVA aplicado al producto.
     * @return importe del IVA
     */
    public double calcularImporteIva() {
        return precio * iva;
    }

    /**
     * Representación en String del producto.
     * @return información del producto
     */
    @Override
    public String toString() {
        return String.format("Producto #%d: %s\n" +
                        "  Precio sin IVA: %.2f€\n" +
                        "  IVA (%.0f%%): %.2f€\n" +
                        "  Precio de venta: %.2f€",
                codigo, descripcion, precio,
                iva * 100, calcularImporteIva(),
                calcularPrecioVenta());
    }
}

/**
 * Programa principal para probar la clase Producto.
 */
