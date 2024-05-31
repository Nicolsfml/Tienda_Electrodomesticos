package AbstractFactory;

public class LGFactory implements ILG {
    @Override
    public Electrodomestico crearLicuadora() {
        return new LGLicuadora();
    }

    @Override
    public Electrodomestico crearTV() {
        return new LGTV();
    }
}
