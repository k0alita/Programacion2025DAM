package Objetos.Objetos2.Ejer82;

import Objetos.Objetos2.Ejer82.Exceptions.LigaException;

public class Liga {
    private int jornada;
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    private char resultadoQuiniela;
    private String estadio;

    public Liga(int jornada, String equipoLocal, String equipoVisitante, String estadio) throws LigaException{
        if (jornada < 0 || jornada > 38) {
            throw new LigaException("La jornada no puede ser mayor a 38 ni menor a 1");
        } else {
            this.jornada = jornada;
        }
        if (equipoLocal.equals(equipoVisitante)) {
        } else {
            this.equipoLocal = equipoLocal;
            this.equipoVisitante = equipoVisitante;
        }

    }
}
