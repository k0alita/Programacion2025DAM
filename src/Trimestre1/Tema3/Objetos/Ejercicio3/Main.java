package Trimestre1.Objetos.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Maquina m = new Maquina();

        Scanner sc = new Scanner(System.in);

        boolean operando = true;

        while (operando) {
            System.out.println("Que desea hacer en la maquina: ");
            System.out.println("1. Servir café solo (1 euro)");
            System.out.println("2. Servir leche (0.8 euros)");
            System.out.println("3. Servir café con leche (1,5 euros)");
            System.out.println("4. Consultar estado de la maquina");
            System.out.println("5. Apagar maquina y salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    m.servirBebida("cafe");
                    break;
                case 2:
                    m.servirBebida("leche");
                    break;
                case 3:
                    m.servirBebida("cafeleche");
                    break;
                case 4:
                    m.estadoMaquina();
                    break;
                case 5:
                    System.out.println("Desea apagar la maquina: (Si/No)");
                    String respuesta = sc.next().toLowerCase();
                    if (respuesta.equals("si")) {
                        m.vaciarMonedero();
                        m.llenarMaquina();
                        operando = false;

                    } else if (respuesta.equals("no")) {
                        System.out.println("Volviendo al menu...");
                    } else {
                        System.out.println("Respuesta no valida");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }


        }
    }
}

