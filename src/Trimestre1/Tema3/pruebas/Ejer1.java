package Trimestre1.pruebas;

public class Ejer1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println("El numero: " + i + " es multiplo de 7");
            } else if (i % 13 == 0) {
                System.out.println("El numero: " + i + " es multiplo de 13");
            }
            if (i % 7 == 0 && i % 13 == 0){
                System.out.println("El numero: " + i + " es multiplo de 13 y de 7");
            }

        }
    }
}
