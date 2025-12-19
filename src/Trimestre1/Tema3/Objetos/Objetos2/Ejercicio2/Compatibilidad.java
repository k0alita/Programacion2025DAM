package Trimestre1.Objetos.Objetos2.Ejercicio2;

import Trimestre1.Objetos.Objetos2.Ejercicio1.Exceptions.PersonaException;

import java.util.Scanner;

public class Compatibilidad {

    public static void main(String[] args) throws PersonaException {
        Scanner sc = new Scanner(System.in);
        //Componentes
        PlacaBase placa = new PlacaBase();
        MicroProcesador micro = new MicroProcesador();
        DiscoDuro disco = new DiscoDuro();
        TarjetaGrafica grafica = new TarjetaGrafica();
        System.out.println("Vamos a montar un ordenador, escribe empezar: ");
        datosPlaca(placa, sc);
        datosMicro(micro, sc);
        datosdGrafica(grafica, sc);
        datosDisco(disco, sc);

        mostrarDatosOrdenador(placa, micro, grafica, disco);
        comprobarCompatibilidad(placa, micro, sc);

    }

    public static void datosPlaca(PlacaBase placa, Scanner sc) {
        String opcion;
        System.out.println("Indica los datos de la placa base");
        System.out.print("Introduce la marca: ");
        opcion = sc.next();
        placa.setMarca(opcion);
        System.out.print("Introduce el socket: ");
        opcion = sc.next();
        placa.setSocket(opcion);
        System.out.print("Introduce el chipset: ");
        opcion = sc.next();
        placa.setChipset(opcion);
    }

    public static void datosMicro(MicroProcesador micro, Scanner sc) {
        String opcion;
        int opcionnums;
        System.out.println("Indica los datos del procesador");
        System.out.print("Introduce la marca: ");
        opcion = sc.next();
        micro.setMarca(opcion);
        System.out.print("Introduce el socket: ");
        opcion = sc.next();
        micro.setSocket(opcion);
        System.out.print("Introduce el modelo: ");
        opcion = sc.next();
        micro.setModelo(opcion);
        System.out.print("Introduce el numero de nucleos: ");
        opcionnums = sc.nextInt();
        micro.setNum_nucl(opcionnums);
        System.out.print("Introduce la velocidad base: ");
        opcionnums = sc.nextInt();
        micro.setVelocidad_base(opcionnums);
    }
    public static void datosdGrafica(TarjetaGrafica grafica, Scanner sc) {
        String opcion;
        int opcionnums;
        System.out.println("Indica los datos de la tarjeta grafica");
        System.out.print("Introduce la marca: ");
        opcion = sc.next();
        grafica.setMarca(opcion);
        System.out.print("Introduce el modelo: ");
        opcion = sc.next();
        grafica.setModelo(opcion);
        System.out.print("Introduce la cantidad de nucleos: ");
        opcionnums = sc.nextInt();
        grafica.setNum_nuc(opcionnums);
        System.out.print("Introduce la memoria: ");
        opcionnums = sc.nextInt();
        grafica.setCant_men(opcionnums);
        System.out.print("Introduce velocidad base: ");
        opcionnums = sc.nextInt();
        grafica.setVelocidad(opcionnums);
    }
    public static void datosDisco(DiscoDuro disco, Scanner sc) {
        String opcion;
        int opcionnums;
        System.out.println("Indica los datos del disco duro");
        System.out.print("Introduce la marca: ");
        opcion = sc.next();
        disco.setMarca(opcion);
        System.out.print("Introduce el modelo: ");
        opcionnums = sc.nextInt();
        disco.setCapaciodad(opcionnums);
        System.out.print("Introduce la cantidad de nucleos: ");
        opcion = sc.next();
        disco.setTipo(opcion);
    }

    public static void mostrarDatosOrdenador(PlacaBase placa, MicroProcesador micro, TarjetaGrafica grafica, DiscoDuro disco) {
        System.out.println("--------- Resumen ordenador --------- ");
        System.out.println("Datos Placa Base: ");
        System.out.println("Marca: " + placa.getMarca());
        System.out.println("Socket: " + placa.getSocket());
        System.out.println("Chipset: " + placa.getChipset());
        System.out.println("Datos Procesador: ");
        System.out.println("Marca: " + micro.getMarca());
        System.out.println("Socket: " + micro.getSocket());
        System.out.println("Modelo: " + micro.getModelo());
        System.out.println("Nº nucleos: " + micro.getNum_nucl());
        System.out.println("Vel Base: " + micro.getVelocidad_base());
        System.out.println("Datos Grafica: ");
        System.out.println("Marca: " + grafica.getMarca());
        System.out.println("Modelo: " + grafica.getModelo());
        System.out.println("Memoria: " + grafica.getCant_men());
        System.out.println("Nucleos" + grafica.getNum_nuc());
        System.out.println("Velocidad" + grafica.getVelocidad());
        System.out.println("Datos Disco: ");
        System.out.println("Marca: " + disco.getMarca());
        System.out.println("Tipo: " + disco.getTipo());
        System.out.println("Capacidad: " + disco.getCapaciodad());
    }

    public static void comprobarCompatibilidad(PlacaBase placa, MicroProcesador micro, Scanner sc) throws PersonaException {
        System.out.println("Compatibilidad del ordenador:");
        try {
            if (placa.procesadorCompatible(placa.getSocket(), micro.getSocket())) {
                System.out.println("Modelo de placa y procesador compatibles.");
            }
        } catch (PersonaException e) {
            System.out.println(e.getMessage());
        }
    }
}
