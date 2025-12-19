package Trimestre1.Objetos.Objetos3.Ejercicio.Ejercicio2;

import Trimestre1.Objetos.Objetos2.Ejercicio1.Exceptions.PersonaException;

import java.time.LocalDateTime;

public class Persona {
    private String nombre;
    private Mensaje[] mensajesRecibidos;
    private Mensaje[] mensajesEnviados;
    private int contadorRecibidos;
    private int contadorEnviados;
    private static final int CAPACIDAD_BUZON = 5;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.mensajesRecibidos = new Mensaje[CAPACIDAD_BUZON];
        this.mensajesEnviados = new Mensaje[CAPACIDAD_BUZON];
        this.contadorRecibidos = 0;
        this.contadorEnviados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void enviarMensaje(Mensaje mensaje) throws PersonaException {
        if (mensaje.getAsunto() == null || mensaje.getAsunto().isEmpty()) {
            throw new PersonaException("Error: El mensaje debe tener asunto");
        }
        if (mensaje.getCuerpo() == null || mensaje.getCuerpo().isEmpty()) {
            throw new PersonaException("Error: El mensaje debe tener cuerpo");
        }
        if (mensaje.getDestinatario() == null) {
            throw new PersonaException("Error: El mensaje debe tener destinatario");
        }

        if (contadorEnviados >= CAPACIDAD_BUZON) {
            throw new PersonaException("Error: El buzón de enviados de " + nombre + " está lleno");
        }
        if (mensaje.getDestinatario().contadorRecibidos >= CAPACIDAD_BUZON) {
            throw new PersonaException("Error: El buzón de recibidos de " + mensaje.getDestinatario().getNombre() + " está lleno");
        }

        mensaje.setRemitente(this);
        mensaje.setFechaEnvio(LocalDateTime.now());

        mensajesEnviados[contadorEnviados] = mensaje;
        contadorEnviados++;

        mensaje.getDestinatario().mensajesRecibidos[mensaje.getDestinatario().contadorRecibidos] = mensaje;
        mensaje.getDestinatario().contadorRecibidos++;

        System.out.println("Mensaje enviado correctamente de " + nombre + " a " + mensaje.getDestinatario().getNombre());
    }

    public void borrarMensajeEnviadoMasAntiguo() throws PersonaException {
        if (contadorEnviados == 0) {
            throw new PersonaException("Error: El buzón de enviados está vacío");
        }

        for (int i = 0; i < contadorEnviados - 1; i++) {
            mensajesEnviados[i] = mensajesEnviados[i + 1];
        }
        mensajesEnviados[contadorEnviados - 1] = null;
        contadorEnviados--;

        System.out.println("Mensaje enviado más antiguo borrado del buzón de " + nombre);
    }

    public void borrarMensajeRecibidoMasAntiguo() throws PersonaException {
        if (contadorRecibidos == 0) {
            throw new PersonaException("Error: El buzón de recibidos está vacío");
        }

        for (int i = 0; i < contadorRecibidos - 1; i++) {
            mensajesRecibidos[i] = mensajesRecibidos[i + 1];
        }
        mensajesRecibidos[contadorRecibidos - 1] = null;
        contadorRecibidos--;

        System.out.println("Mensaje recibido más antiguo borrado del buzón de " + nombre);
    }

    public void mostrarMensajesEnviados() {
        System.out.println("Mensajes Enviados de " + nombre + " (" + contadorEnviados + "/" + CAPACIDAD_BUZON + ")");
        for (int i = 0; i < contadorEnviados; i++) {
            System.out.println("[" + i + "] " + mensajesEnviados[i]);
        }
    }

    public void mostrarMensajesRecibidos() {
        System.out.println("Mensajes Recibidos de " + nombre + " (" + contadorRecibidos + "/" + CAPACIDAD_BUZON + ")");
        for (int i = 0; i < contadorRecibidos; i++) {
            System.out.println("[" + i + "] " + mensajesRecibidos[i]);
        }
    }
}
