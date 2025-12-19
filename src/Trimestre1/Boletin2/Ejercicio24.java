package Trimestre1.Boletin2;

import Trimestre1.Boletin1.MiEntradaSalida;

import java.util.Scanner;

public class Ejercicio24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hora = MiEntradaSalida.leerEntero("Introduce la hora base: ");
        int minutos = MiEntradaSalida.leerEntero("Introduce los minutos base: ");
        int segundos = MiEntradaSalida.leerEntero("Introduce los segundos base: ");

        int sumaHoras = MiEntradaSalida.leerEntero("¿Cuántas horas quieres sumar?: ");
        int sumaMinutos = MiEntradaSalida.leerEntero("¿Cuántos minutos quieres sumar?: ");
        int sumaSegundos = MiEntradaSalida.leerEntero("¿Cuántos segundos quieres sumar?: ");

        segundos += sumaSegundos;
        minutos += segundos / 60;
        segundos = segundos % 60;


        minutos += sumaMinutos;
        hora += minutos / 60;
        minutos = minutos % 60;


        hora += sumaHoras;
        int dias = 0;
        boolean cambioDia = false;
        if (hora >= 24) {
            dias = hora / 24;
            hora = hora % 24;
            cambioDia = true;
        }


        System.out.printf("La hora resultante es: %02d:%02d:%02d", hora, minutos, segundos); //Formatear la fehca para que aparezcan los 0 si no llegamo a los 2 digitos
        if (cambioDia) {
            System.out.printf("Han pasado %d Dias", dias);
        }
        System.out.println();
    }
}