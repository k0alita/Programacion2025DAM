//package Trimestre1.Objetos;
//
//import Trimestre1.Objetos.Avioneta.Registro;
//
//import java.time.LocalDate;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Deposito deposito = new Deposito(500, 400);
//        Registro registro = new Registro(LocalDate.of(2026, 10, 3)
//        );
//        Avion avion = new Avion(15.6, deposito, "Airbus", "A320", registro);
//        System.out.println(avion.toString());
//
//        System.out.println();
//        System.out.print("Que distancia quieres recorrer con el avion: ");
//        double distancia = sc.nextDouble();
//
//        if (avion.listoParaViajar(distancia)) {
//            System.out.println("El avion esta listo para viajar");
//        } else {
//            System.out.println("El avion no esta listo para viajar");
//        }
//
//    }
//}
