package Trimestre1.pruebas.OtraPrueba;

import java.time.LocalDate;

public class Revision {
    private LocalDate fecha;
    private boolean estado;
    private int validez; // días de validez

    public Revision(LocalDate fecha, boolean estado, int validez) {
        this.fecha = fecha;
        this.estado = estado;
        this.validez = validez;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getValidez() {
        return validez;
    }

    public void setValidez(int validez) {
        this.validez = validez;
    }

    // MÉTODO NUEVO: verifica si la revisión está en fecha
    public boolean isInFecha() {
        LocalDate hoy = LocalDate.now();
        LocalDate fechaExpiracion = fecha.plusDays(validez);
        return hoy.isBefore(fechaExpiracion) || hoy.isEqual(fechaExpiracion);
    }
}
