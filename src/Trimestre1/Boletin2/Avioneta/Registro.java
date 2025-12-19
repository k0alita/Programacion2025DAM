package Trimestre1.Boletin2.Avioneta;

import java.time.LocalDate;
import java.time.Period;

public class Registro {
    private LocalDate fecha;
    private boolean estado;
    private Period validez;

    public Registro(boolean estado, Period validez) {
        this.fecha = LocalDate.now();
        this.validez = validez;
        this.estado = estado;
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

    public Period getValidez() {
        return validez;
    }

    public void setValidez(Period validez) {
        this.validez = validez;
    }
}
