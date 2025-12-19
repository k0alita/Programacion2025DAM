package Trimestre1.Objetos.Pruebitas;

import Trimestre1.Objetos.Pruebitas.Exceptions.PeliculaExceptions;

public class Pelicula {
    private String titulo;
    private int año_estreno;
    private String director;
    private double presupuesto;
    private double recaudacion;
    private String sinopsis;
    private String etiquetas;
    private double valoracion;

    public Pelicula() throws PeliculaExceptions{

    }

    public Pelicula(String titulo, int año_estreno, String director, double presupuesto, double recaudacion, String sinopsis, String etiquetas) throws PeliculaExceptions {
        this.titulo = titulo;
        this.año_estreno = año_estreno;
        this.director = director;
        this.presupuesto = presupuesto;
        this.recaudacion = recaudacion;
        this.sinopsis = sinopsis;
        this.etiquetas = etiquetas;
        this.valoracion = calcularValoracion(this);
    }

    public int getAño_estreno() {
        return año_estreno;
    }

    public void setAño_estreno(int año_estreno) {
        this.año_estreno = año_estreno;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }


    public static double calcularValoracion(Pelicula pelicula) {
        double presupuesto = pelicula.getPresupuesto();
        double recaudacion = pelicula.getRecaudacion();

        if (recaudacion == 0) {
            return 0.0;
        }

        if (recaudacion >= presupuesto * 2) {
            return 10.0;
        }

        double valoracion = (recaudacion / (2 * presupuesto)) * 10;

        return Math.min(valoracion, 10.0);
    }

    @Override
    public String toString() {
        return "\n--- PELÍCULA ---" +
                "\nTítulo: " + titulo +
                "\nAño: " + año_estreno +
                "\nDirector: " + director +
                "\nPresupuesto: " + presupuesto + " millones €" +
                "\nRecaudación: " + recaudacion + " millones €" +
                "\nSinopsis: " + sinopsis +
                "\nEtiquetas: " + etiquetas +
                "\nValoración: " + String.format("%.2f", valoracion) + "/10\n";
    }

}
