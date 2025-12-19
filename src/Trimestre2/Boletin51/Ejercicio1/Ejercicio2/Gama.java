package Trimestre2.Boletin51.Ejercicio1.Ejercicio2;

public enum Gama {
    ALTA(50),
    MEDIA(40),
    BAJA(30);

    private final double PRECIO;

    Gama(double precio) {this.PRECIO = precio;}

    public double getPRECIO() {
        return PRECIO;
    }
}
