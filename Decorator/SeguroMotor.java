package Decorator;

import AbstractFactory.Electrodomestico;

public class SeguroMotor implements Seguro {
    private Electrodomestico electrodomestico;

    public SeguroMotor(Electrodomestico electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    @Override
    public String operacion() {
        return electrodomestico.operacion() + " con seguro de motor";
    }

    @Override
    public Electrodomestico clone() throws CloneNotSupportedException {
        return electrodomestico.clone();
    }
}