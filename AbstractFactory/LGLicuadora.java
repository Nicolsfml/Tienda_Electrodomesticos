package AbstractFactory;

public class LGLicuadora implements Electrodomestico {
    @Override
    public String operacion() {
        return "Licuadora LG funcionando";
    }

    @Override
    public Electrodomestico clone() throws CloneNotSupportedException {
        return (LGLicuadora) super.clone();
    }
}
