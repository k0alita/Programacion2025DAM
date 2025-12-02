package Objetos.Objetos3.Ejercicio.Ejercicio2;

public class Persona {
    private String nombre;
    private int mensajesRecibidos;
    private int mensajesEnviados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public void setMensajesRecibidos(int mensajesRecibidos) {
        this.mensajesRecibidos = mensajesRecibidos;
    }

    public int getMensajesEnviados() {
        return mensajesEnviados;
    }

    public void setMensajesEnviados(int mensajesEnviados) {
        this.mensajesEnviados = mensajesEnviados;
    }

    public void enviarMensaje(String asusto, String cuerpo, Persona destinatario) {

    }
}
