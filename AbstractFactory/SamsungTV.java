package AbstractFactory;

public class SamsungTV implements Electrodomestico {
    @Override
    public String operacion() {
        return "TV Samsung funcionando";
    }

    @Override
    public Electrodomestico clone() throws CloneNotSupportedException {
        return (SamsungTV) super.clone();
    }
}
