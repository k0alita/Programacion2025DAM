package Trimestre1.Objetos.Objetos2.Ejercicio2;

import Trimestre1.Objetos.Objetos2.Ejercicio1.Exceptions.PersonaException;

public class PlacaBase {
    private String marca;
    private String chipset;
    private String socket;

    MicroProcesador micro = new MicroProcesador();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public boolean procesadorCompatible(String socketPlaca, String socketMicro) throws PersonaException {
        if (socketPlaca.equals(socketMicro)) {
            return true;
        }
        throw new PersonaException("El socket no es compatible entre ambos componentes");
    }
}

