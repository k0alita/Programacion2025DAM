package Objetos.Avioneta;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Registro {
    private LocalDate fecha;
    private boolean estado;
    private LocalDate validez;

    public Registro( ) {

    }

    public Registro(LocalDate validez) {
        this.fecha = LocalDate.now();
        this.validez = validez;
        this.estado = estaBueno();
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getValidez() {
        return validez;
    }

    public void setValidez(LocalDate validez) {
        this.validez = validez;
    }

    public boolean estaBueno() {
        if (fecha.isBefore(validez)) {
            return true;
        } else if (fecha.isAfter(validez)) {
            return false;
        } else if (fecha.isEqual(validez)) {
            return true;
        }
        return false;
    }
}
