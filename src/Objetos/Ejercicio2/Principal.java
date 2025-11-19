package Objetos.Ejercicio2;

import Objetos.Exceptions.CuentaException;
import Objetos.Exceptions.IngresoException;
import Objetos.Exceptions.RetiroException;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws CuentaException {
        Cuenta c = new Cuenta();

        Scanner sc = new Scanner(System.in);

        boolean operando = true;

        while (operando) {
            System.out.println("Que desea hacer en su cuenta: ");
            System.out.println("1. Hacer un reintegro, se pedirá la cantidad a retirar.");
            System.out.println("2. Hacer un ingreso, se pedirá la cantidad a ingresar.");
            System.out.println("3. Consultar el saldo y el número de reintegros e ingresos realizados.");
            System.out.println("4. Finalizar operaciones");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Que cantidad quieres retirar: ");
                    double retiro = sc.nextDouble();
                    try {
                        c.retirarDinero(retiro);
                    } catch (RetiroException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Tienes " + c.getDinero() + "€ despues del retiro de " + retiro + "€");
                    break;
                case 2:
                    System.out.print("Que cantidad quieres ingresar: ");
                    double ingreso = sc.nextDouble();
                    try {
                        c.ingresoDinero(ingreso);
                    } catch (IngresoException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Tienes " + c.getDinero() + "€ despues del ingreso de " + ingreso + "€");
                    break;
                case 3:
                    System.out.println("Saldo Total: " + c.getDinero());
                    System.out.println("Ingresos Totales: " + c.getIngresosTotales());
                    System.out.println("Retiros Totales: " + c.getRetirosTotales());
                    break;
                case 4:
                    System.out.println("Desea finalizar las operaciones: (Si/No)");
                    String respuesta = sc.next().toLowerCase();
                    if (respuesta.equals("si")) {
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
