package Prototype;

import AbstractFactory.Electrodomestico;

public class PrototypeFactory {
    private Electrodomestico electrodomestico;

    public PrototypeFactory(Electrodomestico electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    public Electrodomestico clonar() {
        try {
            return electrodomestico.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}