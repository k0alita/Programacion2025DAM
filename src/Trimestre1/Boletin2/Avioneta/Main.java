//package Trimestre1.Boletin2.Avioneta;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Deposito deposito = new Deposito(500, 400);
//
//
//
//        Avion avion = new Avion(15.6, deposito, "Airbus", "A320");
//        System.out.println(avion.toString());
//
//        System.out.println();
//        System.out.print("Que distancia quieres recorrer con el avion: ");
//        double distancia = sc.nextDouble();
//
//        if (avion.listoParaViajar(distancia)) {
//            System.out.println("El avion esta listo para viajar");
//            System.out.println("Realizando Viaje ...");
//            System.out.println("Combustible consumido en " + distancia + " km: " +  + deposito.getCombustibleConsumido() + " L");
//            System.out.println("Combustible restante despues del vuelo: " + deposito.getCapacidadActual() + " L");
//        } else {
//            System.out.println("El avion no esta listo para viajar");
//        }
//
//    }
//}
