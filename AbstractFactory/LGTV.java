package AbstractFactory;

public class LGTV implements Electrodomestico {
    @Override
    public String operacion() {
        return "TV LG funcionando";
    }

    @Override
    public Electrodomestico clone() throws CloneNotSupportedException {
        return (LGTV) super.clone();
    }
}
