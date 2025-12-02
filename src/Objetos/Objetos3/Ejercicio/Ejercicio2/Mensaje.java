package Objetos.Objetos3.Ejercicio.Ejercicio2;

import java.time.LocalDate;

public class Mensaje {
    private String asunto;
    private String cuerpo;
    private LocalDate fechaEnvio;
    private Persona remitente;
    private Persona desninatario;

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Persona getDesninatario() {
        return desninatario;
    }

    public void setDesninatario(Persona desninatario) {
        this.desninatario = desninatario;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}
