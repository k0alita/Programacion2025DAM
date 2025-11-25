package Objetos.Objetos2.Ejercicio2;

import Objetos.Objetos2.Ejercicio2.Exceptions.CompatibilidadException;

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

    public boolean procesadorCompatible(String socketPlaca, String socketMicro) throws CompatibilidadException {
        if (socketPlaca.equals(socketMicro)) {
            return true;
        }
        throw new CompatibilidadException("El socket no es compatible entre ambos componentes");
    }
}

