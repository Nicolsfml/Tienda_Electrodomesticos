package Decorator;

import AbstractFactory.Electrodomestico;

public class SeguroTodoRiesgo implements Seguro {
    private Electrodomestico electrodomestico;

    public SeguroTodoRiesgo(Electrodomestico electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    @Override
    public String operacion() {
        return electrodomestico.operacion() + " con seguro todo riesgo";
    }

    @Override
    public Electrodomestico clone() throws CloneNotSupportedException {
        return electrodomestico.clone();
    }
}