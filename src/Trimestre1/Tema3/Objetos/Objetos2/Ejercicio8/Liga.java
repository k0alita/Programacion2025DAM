package Trimestre1.Objetos.Objetos2.Ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Liga {

    private List<Equipo> equipos;
    private List<Partido> partidos;

    public Liga() {
        equipos = new ArrayList<>();
        partidos = new ArrayList<>();
    }

    public void addEquipo(Equipo e) {
        equipos.add(e);
    }

    public void addPartido(Partido p) {
        partidos.add(p);
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }
}
