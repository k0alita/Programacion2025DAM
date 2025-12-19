package Trimestre1.Objetos.MaquinaCafe;

import Trimestre1.Objetos.MaquinaCafe.Exceptions.MaquinaException;

import java.util.Scanner;

public class Main {
    static boolean operando = true;
    public static void main(String[] args) throws MaquinaException {
        Maquina m = new Maquina();
        Scanner sc = new Scanner(System.in);


        while (operando) {
            System.out.println("Elige la bebida que desea: ");
            System.out.println("1. Servir cafe solo (1 euro)");
            System.out.println("2. Servir leche (0,8 euros)");
            System.out.println("3. Servir cafe con leche (1,5 euros)");
            System.out.println("4. Colsultar estado maquina");
            System.out.println("5. Apagar maquina y salir");
            int opcion = sc.nextInt();

            double dinero;

            switch (opcion) {
                case 1:
                    servirCafe(m, sc);
                    break;
                case 2:
                    servirLeche(m, sc);
                    break;
                case 3:
                    servirCafeLeche(m, sc);
                    break;
                case 4:
                    consultarEstado(m);
                    break;
                case 5:
                    salirMaquina(m, sc);
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        }
    }

    public static void servirCafe(Maquina m, Scanner sc) {
        System.out.print("Cuanto dinero desea introducir: ");
        double dinero = sc.nextDouble();
        try {
            double cambio = m.servirBebida("cafe", dinero);
            System.out.println("Sirviendo cafe...");
            if (cambio > 0) {
                System.out.println("Recoge tu cambio de: " + cambio);
            }
        } catch (MaquinaException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void servirLeche(Maquina m, Scanner sc) {
        System.out.print("Cuanto dinero desea introducir: ");
        double dinero = sc.nextDouble();
        try {
            double cambio = m.servirBebida("cafe", dinero);
            System.out.println("Sirviendo leche...");
            if (cambio > 0) {
                System.out.println("Recoge tu cambio de: " + cambio);
            }
        } catch (MaquinaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void servirCafeLeche(Maquina m, Scanner sc) {
        System.out.print("Cuanto dinero desea introducir: ");
        double dinero = sc.nextDouble();
        try {
            double cambio = m.servirBebida("cafe", dinero);
            System.out.println("Sirviendo cafe con leche...");
            if (cambio > 0) {
                System.out.println("Recoge tu cambio de: " + cambio);
            }
        } catch (MaquinaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void consultarEstado(Maquina m) {
        String estado = m.consultarEstado();
        System.out.println(estado);
    }

    public static void salirMaquina(Maquina m, Scanner sc) {
        System.out.println("Desea apagar la maquina: (Si/No)");
        String respuesta = sc.next().toLowerCase();
        if (respuesta.equals("si")) {
            System.out.println("Se ha retirado: " + m.getMonedero() + "€" + " de la maquina.");
            m.vaciarMonedero();
            System.out.println("Se han llenado los depositos de la maquina.");
            m.llenarDepositos();
            operando = false;
        } else if (respuesta.equals("no")) {
            System.out.println("Volviendo al menu...");
        } else {
            System.out.println("Respuesta no valida");
        }
    }
}
