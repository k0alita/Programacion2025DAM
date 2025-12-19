package Trimestre1.Objetos.Objetos3.Ejercicio.Ejercicio2;

import java.time.LocalDateTime;

public class Mensaje {
    private String asunto;
    private String cuerpo;
    private LocalDateTime fechaEnvio;
    private Persona remitente;
    private Persona destinatario;

    public Mensaje(String asunto, String cuerpo, Persona destinatario) {
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.fechaEnvio = LocalDateTime.now();
        this.destinatario = destinatario;
    }


    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDesninatario(Persona desninatario) {
        this.destinatario = desninatario;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return "De: " + (remitente != null ? remitente.getNombre() : "N/A") +
                " | Para: " + (destinatario != null ? destinatario.getNombre() : "N/A") +
                " | Asunto: " + asunto + " | Fecha: " + fechaEnvio;
    }
}
