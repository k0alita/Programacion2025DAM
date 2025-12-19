//import java.util.Scanner;
//
//public class Principal {
//    public static void main(String[] args) {
//        Cuenta c = null;
//        while (c == null) {
//            try {
//                double saldoInicial = MiEntradaSalida.solicitarEnteroPositivo("Introduce el saldo inicial");
//                c = new Cuenta(saldoInicial);
//            } catch (MiException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        int opcion;
//
//        do {
//            mostarMenu();
//
//            opcion = MiEntradaSalida.solicitarEnteroEnRango("Escribe una opción: ", 0, 1);
//
//            switch (opcion) {
//                case 1:
//                    int dineroARetirar = MiEntradaSalida.solicitarEnteroPositivo("¿Cuánto dinero desea retirar");
//                    try {
//                        c.reintegro(dineroARetirar);
//                        System.out.printf("Su saldo actual es de %.2f%n", c.getSaldo());
//                    } catch (MiException e) {
//                        System.out.println(e.getMessage());
//                    }
//                    break;
//                case 0:
//                    System.out.println("Gracias por utilizar este cajero. Adiós.");
//
//
//            }
//        } while (opcion != 0);
//    }
//
//    public static void mostarMenu() {
//        System.out.println("¿Qué desea hacer?");
//        System.out.println("0. Salir");
//        System.out.println("1. Retirar");
//    }
//}