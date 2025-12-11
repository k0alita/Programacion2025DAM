package pruebas.ExamenGG;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Crear un depósito con capacidad máxima de 1000 litros y 800 actuales
        Deposito deposito = new Deposito(1000, 800);

        // 2. Crear un avión (consumo: 2 litros/km, capacidad para 5 revisiones)
        Avion avion = new Avion(2.0, deposito, "Boeing 737", "Boeing", 5);

        // 3. Crear y agregar revisiones
        Revision revision1 = new Revision(LocalDate.of(2025, 10, 15), true, 60);
        Revision revision2 = new Revision(LocalDate.of(2025, 12, 1), true, 30);

        avion.agregarRevision(revision1);
        avion.agregarRevision(revision2);

        // 4. Mostrar datos del avión
        System.out.println("=== DATOS DEL AVIÓN ===");
        System.out.println(avion.toString());

        // 5. Probar si puede realizar diferentes recorridos
        System.out.println("\n=== PRUEBAS DE RECORRIDO ===");

        double distancia1 = 300; // Necesita 600 litros (tiene 800) ✓
        System.out.println("¿Puede viajar " + distancia1 + " km? " +
                (avion.puedeRealizarRecorrido(distancia1) ? "SÍ" : "NO"));

        double distancia2 = 500; // Necesita 1000 litros (solo tiene 800) ✗
        System.out.println("¿Puede viajar " + distancia2 + " km? " +
                (avion.puedeRealizarRecorrido(distancia2) ? "SÍ" : "NO"));

        // 6. Probar con revisión incorrecta
        System.out.println("\n=== AGREGAR REVISIÓN INCORRECTA ===");
        Revision revisionMala = new Revision(LocalDate.of(2025, 12, 10), false, 30);
        avion.agregarRevision(revisionMala);

        System.out.println("Después de revisión incorrecta:");
        System.out.println(avion.toString());

        System.out.println("\n¿Puede viajar 300 km ahora? " +
                (avion.puedeRealizarRecorrido(300) ? "SÍ" : "NO"));

        // 7. Probar con revisión expirada
        System.out.println("\n=== AGREGAR REVISIÓN EXPIRADA ===");
        Revision revisionVieja = new Revision(LocalDate.of(2025, 1, 1), true, 30);
        Avion avion2 = new Avion(2.0, new Deposito(1000, 800), "Airbus A320", "Airbus", 3);
        avion2.agregarRevision(revisionVieja);

        System.out.println("Avión con revisión expirada:");
        System.out.println(avion.toString());
    }
}
