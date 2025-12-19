package Trimestre1.Objetos.Ejercicio3;

import java.util.Scanner;

public class Maquina {
    private int depCafe;
    private int depLeche;
    private int depVasos;
    private double monedero;
    private double cafe;
    private double leche;
    private double cafeleche;


    public Maquina() {
        depCafe = 50;
        depLeche = 50;
        depVasos = 80;
        monedero = 0;
        cafe = 1;
        leche = 0.8;
        cafeleche = 1.5;
    }

    public int getDepLeche() {
        return depLeche;
    }

    public int getDepCafe() {
        return depCafe;
    }

    public int getDepVasos() {
        return depVasos;
    }

    public double getMonedero() {
        return monedero;
    }

    public void setDepVasos(int depVasos) {
        this.depVasos = depVasos;
    }

    public void setCafe(double cafe) {
        this.cafe = cafe;
    }

    public void setDepLeche(int depLeche) {
        this.depLeche = depLeche;
    }

    public void setMonedero(double monedero) {
        this.monedero = monedero;
    }

    public void estadoMaquina() {
        System.out.println("Capacidad Cafe: " + getDepCafe());
        System.out.println("Capacidad Leche: " + getDepLeche());
        System.out.println("Capacidad Vasos: " + getDepVasos());
        System.out.println("Monedero: " + getMonedero() + "€");
    }

    public void llenarMaquina(){
        System.out.println("Se ha rellenado la maquina");
        setDepVasos(80);
        setCafe(50);
        setDepLeche(50);
    }

    public void vaciarMonedero() {
        System.out.println("Vaciando monedero...");
        System.out.println("Se han retirado: " + monedero + "€");
        setMonedero(0);

    }

    public void servirBebida(String tipo) {
        Scanner sc = new Scanner(System.in);
        switch (tipo) {
            case "cafe":
                if (depCafe > 0 && depVasos > 0) {
                    System.out.println("Que cantidad de dinero va a introducir");
                    double dinero = sc.nextDouble();
                    double cambio = dinero - cafe;
                    if (dinero < cafe) {
                        System.out.println("Dinero insuficiente");
                    } else if (dinero > cafe) {
                        if (monedero < cambio) {
                            System.out.println("No hay cambio en la maquina");
                            System.out.println("Devolviendo dinero...");
                        } else if (monedero > cambio) {
                            monedero+= dinero;
                            monedero-= cambio;
                            System.out.println("Sirviendo cafe...");
                            depCafe--;
                            depVasos--;
                            System.out.println("Recoge tu cambio de: " + cambio + " euros");
                        }
                    } else if (dinero == cafe) {
                        System.out.println("Sirviendo cafe...");
                        monedero+= dinero;
                        depCafe--;
                        depVasos--;
                    }
                } else {
                    if (depCafe <= 0) {
                        System.out.println("No quedan existencias de cafe");
                    } else if (depVasos <= 0) {
                        System.out.println("No quedan existencias de vasos");
                    }
                }
                break;
            case "leche":
                if (depLeche > 0 && depVasos > 0) {
                    System.out.println("Que cantidad de dinero va a introducir");
                    double dinero = sc.nextDouble();
                    double cambio = dinero - leche;
                    if (dinero < leche) {
                        System.out.println("Dinero insuficiente");
                    } else if (dinero > leche) {
                        if (monedero < cambio) {
                            System.out.println("No hay cambio en la maquina");
                            System.out.println("Devolviendo dinero...");
                        } else if (monedero > cambio) {
                            monedero+= dinero;
                            monedero-= cambio;
                            System.out.println("Sirviendo leche...");
                            depLeche--;
                            depVasos--;
                            System.out.println("Recoge tu cambio de: " + cambio + " euros");
                        }
                    } else if (dinero == leche) {
                        System.out.println("Sirviendo leche...");
                        monedero+= dinero;
                        depLeche--;
                        depVasos--;
                    }
                } else {
                    if (depLeche <= 0) {
                        System.out.println("No quedan existencias de leche");
                    } else if (depVasos <= 0) {
                        System.out.println("No quedan existencias de vasos");
                    }
                }
                break;
            case "cafeleche":
                if (depLeche > 0 && depVasos > 0 && depCafe > 0) {
                    System.out.println("Que cantidad de dinero va a introducir");
                    double dinero = sc.nextDouble();
                    double cambio = dinero - cafeleche;
                    if (dinero < cafeleche) {
                        System.out.println("Dinero insuficiente");
                    } else if (dinero > cafeleche) {
                        if (monedero < cambio) {
                            System.out.println("No hay cambio en la maquina");
                            System.out.println("Devolviendo dinero...");
                        } else if (monedero > cambio) {
                            monedero+= dinero;
                            monedero-= cambio;
                            System.out.println("Sirviendo cafe con leche...");
                            depLeche--;
                            depVasos--;
                            depCafe--;
                            System.out.println("Recoge tu cambio de: " + cambio + " euros");
                        }
                    } else if (dinero == cafeleche) {
                        System.out.println("Sirviendo cafe con leche...");
                        monedero+= dinero;
                        depLeche--;
                        depCafe--;
                        depVasos--;
                    }
                } else {
                    if (depLeche <= 0) {
                        System.out.println("No quedan existencias de leche");
                    } else if (depVasos <= 0) {
                        System.out.println("No quedan existencias de vasos");
                    } else if (depCafe <= 0) {
                        System.out.println("No quedan existencias de cafe");
                    }
                }
                break;
        }
    }
}
