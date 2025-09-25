package EjerciciosClase;

public class Sum10 {
    public static void main(String[] args) {

        int numeroSum = 0;

        for (int i = 1; i < 101; i++) {
            numeroSum += i++;
        }
        System.out.println("El resultado de la suma de los numeros es: " + numeroSum);
    }
}
