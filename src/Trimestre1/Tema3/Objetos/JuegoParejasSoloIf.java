package Trimestre1.Objetos;

import java.util.Scanner;

public class JuegoParejasSoloIf {

    // Tablero con las respuestas (HARDCODED para evitar lógica de shuffle compleja sin bucles)
    // En un caso real, mezclaríamos esto, pero sin bucles es muy verboso.
    static int[][] respuestas = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {1, 2, 3, 4},
            {5, 6, 7, 8}
    };

    // Tablero visible: 0 = Oculto, 1 = Descubierto
    static int[][] visible = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };

    static Scanner scanner = new Scanner(System.in);
    static int paresEncontrados = 0;
    static int totalPares = 8;

    public static void main(String[] args) {
        System.out.println("--- MEMORY GAME (SOLO IF) ---");
        System.out.println("Instrucciones: Ingresa fila (0-3) y columna (0-3).");
        juegoRecursivo();
    }

    // Bucle principal del juego
    public static void juegoRecursivo() {
        // Condición de victoria
        if (paresEncontrados == totalPares) {
            System.out.println("\n¡FELICIDADES! HAS ENCONTRADO TODOS LOS PARES.");
            System.exit(0);
        }

        // Mostrar estado actual
        System.out.println("\nTablero Actual:");
        imprimirMatriz(0, 0); // Llamada a la función de impresión recursiva

        System.out.println("--- TURNO ---");
        realizarMovimiento();

        // Volver a llamar al juego (Loop infinito simulado)
        juegoRecursivo();
    }

    public static void realizarMovimiento() {
        // --- CARTA 1 ---
        System.out.println("Selecciona PRIMERA carta:");
        int f1 = leerCoordenada("Fila (0-3): ");
        int c1 = leerCoordenada("Columna (0-3): ");

        // Validar si ya está visible
        if (visible[f1][c1] == 1) {
            System.out.println("¡Esa carta ya está visible! Intenta de nuevo.");
            realizarMovimiento(); // Reiniciar turno
            return;
        }

        // Mostrar temporalmente la carta 1
        visible[f1][c1] = 1;
        imprimirMatriz(0, 0);

        // --- CARTA 2 ---
        System.out.println("Selecciona SEGUNDA carta:");
        int f2 = leerCoordenada("Fila (0-3): ");
        int c2 = leerCoordenada("Columna (0-3): ");

        if (f1 == f2) {
            if (c1 == c2) {
                System.out.println("¡No puedes elegir la misma carta dos veces!");
                visible[f1][c1] = 0; // Ocultar la primera de nuevo
                return; // Termina turno sin éxito
            }
        }

        if (visible[f2][c2] == 1) {
            System.out.println("¡Esa carta ya está visible! Pierdes el turno.");
            visible[f1][c1] = 0; // Ocultar la primera
            return;
        }

        // Mostrar temporalmente ambas
        visible[f2][c2] = 1;
        imprimirMatriz(0, 0);

        // --- VERIFICACIÓN ---
        if (respuestas[f1][c1] == respuestas[f2][c2]) {
            System.out.println("¡PAR ENCONTRADO! (" + respuestas[f1][c1] + ")");
            paresEncontrados = paresEncontrados + 1;
            // Se quedan visible=1 permanentemente
        }

        if (respuestas[f1][c1] != respuestas[f2][c2]) {
            System.out.println("No coinciden... (" + respuestas[f1][c1] + " vs " + respuestas[f2][c2] + ")");
            // Volver a ocultar
            visible[f1][c1] = 0;
            visible[f2][c2] = 0;
        }
    }

    // Función auxiliar para leer input y validar rango (0-3)
    public static int leerCoordenada(String mensaje) {
        System.out.print(mensaje);
        if (scanner.hasNextInt()) {
            int val = scanner.nextInt();
            if (val >= 0) {
                if (val <= 3) {
                    return val;
                }
            }
        }
        // Si falla
        scanner.nextLine(); // Limpiar buffer
        System.out.println("Coordenada inválida. Usa 0, 1, 2 o 3.");
        return leerCoordenada(mensaje); // Reintentar recursivamente
    }

    // ---------------------------------------------------------
    // IMPRESIÓN DE MATRIZ SIN BUCLES (Doble Recursividad)
    // ---------------------------------------------------------
    public static void imprimirMatriz(int f, int c) {
        // Base case: Si nos pasamos de filas, terminamos
        if (f > 3) {
            return;
        }

        // Lógica de impresión de celda
        if (visible[f][c] == 1) {
            System.out.print("[" + respuestas[f][c] + "] ");
        }
        if (visible[f][c] == 0) {
            System.out.print("[?] ");
        }

        // Paso recursivo: Moverse a la derecha (columnas)
        if (c < 3) {
            imprimirMatriz(f, c + 1);
        }

        // Paso recursivo: Si llegamos al final de la columna, salto de línea y siguiente fila
        if (c == 3) {
            System.out.println(""); // Salto de linea
            imprimirMatriz(f + 1, 0); // Siguiente fila, col 0
        }
    }
}
