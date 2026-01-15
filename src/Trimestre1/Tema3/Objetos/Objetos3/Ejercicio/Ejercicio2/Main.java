//package Trimestre1.Objetos.Objetos3.Ejercicio.Ejercicio2;
//
//import Trimestre1.Objetos.Objetos2.Ejercicio1.Exceptions.PersonaException;
//
//public class Main {
//        public static void main(String[] args) throws PersonaException {
//            Persona persona = new Persona("Pepe");
//            Persona persona2 = new Persona("Javi");
//
//            try {
//                persona.enviarMensaje(new Mensaje("Pepillo", "Pepe", persona2));
//                persona2.enviarMensaje(new Mensaje("Javillllo", "Javiiii", persona));
//                persona2.enviarMensaje(new Mensaje("Javillllo", "Javiiii", persona));
//                persona2.enviarMensaje(new Mensaje("Javillllo", "Javiiii", persona));
//                persona2.enviarMensaje(new Mensaje("Javillllo", "Javiiii", persona));
//                persona2.enviarMensaje(new Mensaje("Javillllo", "Javiiii", persona));
//                persona2.enviarMensaje(new Mensaje("Javillllo", "Javiiii", persona));
//                persona2.enviarMensaje(new Mensaje("Javillllo", "Javiiii", persona));
//                persona2.enviarMensaje(new Mensaje("Javillllo", "Javiiii", persona));
//            } catch (PersonaException e) {
//                System.out.println(e.getMessage());
//            }
//
//            persona.mostrarMensajesRecibidos();
//            persona.mostrarMensajesEnviados();
//            persona2.mostrarMensajesEnviados();
//            persona2.mostrarMensajesRecibidos();
//
//            try {
//                persona.borrarMensajeEnviadoMasAntiguo();
//                persona.borrarMensajeRecibidoMasAntiguo();
//                persona2.borrarMensajeEnviadoMasAntiguo();
//                persona2.borrarMensajeRecibidoMasAntiguo();
//            } catch (PersonaException e) {
//                System.out.println(e.getMessage());
//            }
//
//            persona.mostrarMensajesRecibidos();
//            persona.mostrarMensajesEnviados();
//            persona2.mostrarMensajesEnviados();
//            persona2.mostrarMensajesRecibidos();
//        }
//}
