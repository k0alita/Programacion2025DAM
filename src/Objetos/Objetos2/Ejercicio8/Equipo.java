package Objetos.Objetos2.Ejercicio8;

public class Equipo {

    private final String nombre;
    private final String estadio;
    private final String ciudad;
    private int partidosGanados;

    public Equipo(String nombre, String estadio, String ciudad) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.ciudad = ciudad;
        this.partidosGanados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void incrementarGanados() {
        partidosGanados++;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre +
                "\nEstadio: " + estadio +
                "\nCiudad: " + ciudad +
                "\nartidos ganados: " + partidosGanados;
    }
}
