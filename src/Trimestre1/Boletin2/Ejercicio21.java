package Trimestre1.Boletin2;


/*
Realizar un programa que, dado un número introducido por el usuario, calcule su
número a la inversa. Es decir, dada la entrada: 123456, el programa debe devolver
654321. Para este programa, no se deben utilizar métodos de la clase String,
Integer, o arrays; sólo deben utilizarse operaciones matemáticas. Ten en cuenta solo
valores positivos
 */

import Trimestre1.Boletin1.MiEntradaSalida;

public class Ejercicio21 {
    public static void main(String[] args) {
        int num = MiEntradaSalida.leerEnteroPositivo("Introduce un numero");
        int numCap = num;
        int invertido = 0;
        while (num > 0) {
            int resto = num % 10;
            invertido = invertido * 10 + resto;
            num /= 10;
        }

        System.out.printf("El numero invertido es %d", invertido);
    }
}
