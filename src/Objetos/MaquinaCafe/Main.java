package Objetos.MaquinaCafe;

import Objetos.MaquinaCafe.Exceptions.MaquinaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MaquinaException {
        Maquina m = new Maquina();
        Scanner sc = new Scanner(System.in);
        boolean operando = true;

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
                    System.out.print("Cuanto dinero desea introducir: ");
                    dinero = sc.nextDouble();
                    try {
                        m.servirBebida("cafe", dinero);
                    } catch (MaquinaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Cuanto dinero desea introducir: ");
                    dinero = sc.nextDouble();
                    m.servirBebida("leche", dinero);
                    break;
                case 3:
                    System.out.print("Cuanto dinero desea introducir: ");
                    dinero = sc.nextDouble();
                    m.servirBebida("cafeleche", dinero);
                    break;
                case 4:
                    m.consultarEstado();
                    break;
                case 5:
                    System.out.println("Desea apagar la maquina: (Si/No)");
                    String respuesta = sc.next().toLowerCase();
                    if (respuesta.equals("si")) {
                        m.vaciarMonedero();
                        m.llenarDepositos();
                        operando = false;

                    } else if (respuesta.equals("no")) {
                        System.out.println("Volviendo al menu...");
                    } else {
                        System.out.println("Respuesta no valida");
                    }
                    break;
            }
        }
    }
}
