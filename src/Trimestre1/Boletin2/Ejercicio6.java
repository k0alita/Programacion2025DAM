package Trimestre1.Boletin2;

import Trimestre1.Boletin1.MiEntradaSalida;

public class Ejercicio6 {
    public static void main(String[] args) {
        int cantAlumnos = MiEntradaSalida.leerEnteroPositivo("Introduce el numero de alumnos: ");

        int aprobados = 0;
        int suspensos = 0;

        for (int i = 1; i < cantAlumnos + 1; i++) {
            int num = MiEntradaSalida.leerEnteroEntre("Introduce la nota del alumno " + i, 0, 10);
            if (num < 5) {
                suspensos++;
            } else aprobados++;
        }

        double porcentajeAprobs = 0;
        double porcentajeSuspen = 0;

        porcentajeAprobs = (double) aprobados / cantAlumnos * 100;
        porcentajeSuspen = (double) suspensos / cantAlumnos * 100;


        System.out.println("Hay un total de: " + aprobados + " alumnos aprobados " + porcentajeAprobs + "%");
        System.out.println("Hay un total de: " + suspensos + " alumnos suspensos " + porcentajeSuspen + "%");
    }
}
