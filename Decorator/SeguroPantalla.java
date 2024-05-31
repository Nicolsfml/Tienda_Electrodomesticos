package Decorator;

import AbstractFactory.Electrodomestico;

public class SeguroPantalla implements Seguro {
    private Electrodomestico electrodomestico;

    public SeguroPantalla(Electrodomestico electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    @Override
    public String operacion() {
        return electrodomestico.operacion() + " con seguro de pantalla";
    }

    @Override
    public Electrodomestico clone() throws CloneNotSupportedException {
        return electrodomestico.clone();
    }
}