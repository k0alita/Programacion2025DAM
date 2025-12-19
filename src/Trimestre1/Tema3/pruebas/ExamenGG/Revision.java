package Trimestre1.pruebas.ExamenGG;

import java.time.LocalDate;

public class Revision {
    private LocalDate fecha;
    private boolean estado;
    private int periodoValidez;

    public Revision(LocalDate fecha, boolean estado, int periodoValidez) {
        this.fecha = fecha;
        this.estado = estado;
        this.periodoValidez = periodoValidez;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPeriodoValidez() {
        return periodoValidez;
    }

    public void setPeriodoValidez(int periodoValidez) {
        this.periodoValidez = periodoValidez;
    }

    public boolean isInFecha() {
        return !LocalDate.now().isAfter(fecha.plusDays(periodoValidez));
    }
}
