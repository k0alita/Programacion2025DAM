package Boletin1;

import java.util.Scanner;

public class MiEntradaSalida {
    private static Scanner sc = new Scanner(System.in);

    /**
     * Lee un entero mostrando el mensaje pasado como parametro
     *
     * @param mensaje El mensaje a mostrar
     * @return el entrero leido por teclado
     */

    /*
    Comentario de
    varias lineas
     */

    //Comentario de una sola linea

    public static int leerEntero(String mensaje) {
        System.out.println(mensaje);
        return sc.nextInt();
    }

    public static int leerEnteroPositivo(String mensaje) {
        System.out.println(mensaje);
        int a = sc.nextInt();
        while (a <= 0) {
            System.out.println("El numero tiene que ser positivo");
            a = sc.nextInt();
        }
        return a;
    }

    public static int leerEnteroEntre(String mensaje, int min, int max) {
        if (min > max) {
            System.out.println("El minimo es mayor que el maximo");
            //TODO: Cambiar esto al ver las exepciones
            return -1;
        }

        int num = leerEntero(mensaje);

        while (num < min ||num > max) {
            System.out.printf("El numero esta fuera del rango %d-%d", min, max);
            num = leerEntero(mensaje);
        }
        return num;
    }

    public static int suma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }


    public static int ecuacionSegundoGrado(double a, double b, double c, boolean resultados) {
        double raiz = (b * b) - 4 * a * c;
        if (raiz > 0) {
            double x1 = (-b + Math.sqrt(raiz)) / (2 * a);
            double x2 = (-b - Math.sqrt(raiz)) / (2 * a);
            if (resultados){
                System.out.println("x1= "+x1+ " y x2= "+x2);
            }
            return 2;
        }
        if (raiz == 0) {
            double x3 = -b / (2 * a);
            if (resultados) {
                System.out.println("x3= " + x3);
            }
            return 1;
        } else {
            if (resultados) {
                System.out.println("No tiene soluciones");
            }
            return 0;
        }
    }

    public static int generaAleatorio(int max) {
        return (int) (Math.random() * max + 1);
    }

    /**
     * Generar un número aleatorio entre un máximo y un mínimo
     * @param min Primer número del intervalo
     * @param max Segundo número del intervalo
     * @param seAceptaElMaximo ¿El máximo entra en ese intervalo?
     * @return El número genrado aleatoriamente
     */
    public static int generaAleatorioEntre(int min, int max, boolean seAceptaElMaximo) {
        int random = 0, ventana;

        if (seAceptaElMaximo) {
            ventana = max - min + 1;
        } else {
            ventana = max - min;
        }
        return (int) (Math.random() * ventana) + min;
    }

}

