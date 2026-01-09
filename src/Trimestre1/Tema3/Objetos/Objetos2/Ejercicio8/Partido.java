//package Trimestre1.Objetos.Objetos2.Ejercicio8;
//
//import Trimestre1.Objetos.Objetos2.Ejercicio8.Exceptions.LaLigaExceptions;
//
//// fichero: Partido.java
//public class Partido {
//
//    private final int jornada;
//    private final Equipo local;
//    private final Equipo visitante;
//
//    private Integer golesLocal;
//    private Integer golesVisitante;
//    private char resultadoQuiniela;
//
//    public Partido(int jornada, Equipo local, Equipo visitante) throws LaLigaExceptions {
//        if (jornada < 1 || jornada > 38) {
//            throw new LaLigaExceptions("La jornada debe estar entre 1 y 38.");
//        }
//        if (local == null || visitante == null) {
//            throw new LaLigaExceptions("Los equipos no pueden estar vacios.");
//        }
//        if (local.getNombre().equalsIgnoreCase(visitante.getNombre())) {
//            throw new LaLigaExceptions("Los equipos local y visitante deben ser distintos.");
//        }
//        this.jornada = jornada;
//        this.local = local;
//        this.visitante = visitante;
//        this.golesLocal = null;
//        this.golesVisitante = null;
//        this.resultadoQuiniela = '\0';
//    }
//
//    public void ponerResultado(String resultado) throws LaLigaExceptions {
//        if (golesLocal != null || golesVisitante != null) {
//            throw new LaLigaExceptions("El partido ya tiene resultado.");
//        }
//        if (resultado == null || resultado.isBlank()) {
//            throw new LaLigaExceptions("El resultado no puede ser nulo o vacío.");
//        }
//
//        String[] partes = resultado.split("-");
//        if (partes.length != 2) {
//            throw new LaLigaExceptions("Formato de resultado incorrecto. Debe ser n-n.");
//        }
//
//        int gl;
//        int gv;
//        try {
//            gl = Integer.parseInt(partes[0].trim());
//            gv = Integer.parseInt(partes[1].trim());
//        } catch (NumberFormatException e) {
//            throw new LaLigaExceptions("Los goles deben ser números enteros.");
//        }
//
//        if (gl < 0 || gv < 0) {
//            throw new LaLigaExceptions("Los goles no pueden ser negativos.");
//        }
//
//        // Asignar goles
//        this.golesLocal = gl;
//        this.golesVisitante = gv;
//
//        // Calcular resultado de quiniela
//        if (gl > gv) {
//            resultadoQuiniela = '1';
//            local.incrementarGanados();
//        } else if (gl < gv) {
//            resultadoQuiniela = '2';
//            visitante.incrementarGanados();
//        } else {
//            resultadoQuiniela = 'X';
//            // En empate no se incrementan partidos ganados
//        }
//    }
//
//    @Override
//    public String toString() {
//        if (golesLocal == null || golesVisitante == null) {
//            return "Partido entre equipo local " + local.getNombre() +
//                    " y equipo visitante " + visitante.getNombre() +
//                    " todavía no se ha jugado";
//        } else {
//            return "Partido entre equipo local " + local.getNombre() +
//                    " y el equipo visitante " + visitante.getNombre() +
//                    " jugado en el estadio " + local.getEstadio() +
//                    " de la ciudad " + local.getCiudad() +
//                    " ha finalizado con " + golesLocal +
//                    " goles de equipo local y " + golesVisitante +
//                    " goles de equipo visitante. Resultado quiniela= " +
//                    resultadoQuiniela;
//        }
//    }
//
//    // Getters útiles para la clase Liga o para el main
//    public int getJornada() {
//        return jornada;
//    }
//
//    public Equipo getLocal() {
//        return local;
//    }
//
//    public Equipo getVisitante() {
//        return visitante;
//    }
//}
//
