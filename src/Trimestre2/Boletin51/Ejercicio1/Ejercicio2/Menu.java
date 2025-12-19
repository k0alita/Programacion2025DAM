package Trimestre2.Boletin51.Ejercicio1.Ejercicio2;

import Trimestre2.Boletin51.Ejercicio1.Ejercicio2.Exceptions.VehiculoException;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Empresa e1 = new Empresa();
        Scanner sc = new Scanner(System.in);
        boolean usando = true;
        while (usando) {
            System.out.println("1. Alta de vehiculo");
            System.out.println("2. Calculo de precio de alquiler");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    if (e1.vehiculos[0] == null){
                        System.out.println("No hay ningun vehiculo dado de alta\n");
                        break;
                    }
                    int numDias;
                    break;
                case 3:
                    System.out.println("Seguro que desea salir si/no");
                    String caracter = sc.next().toLowerCase().trim();
                    if (caracter.equalsIgnoreCase("si")) {
                        usando = false;
                    } else {
                        System.out.println("Volviendo al menu ...");
                        break;
                    }
                    break;
            }
        }
    }

    public static Vehiculo tipoDeVehiculo(String vehiculo) throws VehiculoException {
        return switch (vehiculo.toLowerCase()) {
            case "coche" -> crearCoche();
            case "microbus" -> crearMicobus();
            case "furgoneta" -> crearFurgoneta();
            default -> null;
        };
    }

    public
}
