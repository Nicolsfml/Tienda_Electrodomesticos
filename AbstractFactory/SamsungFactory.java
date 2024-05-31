package AbstractFactory;

public class SamsungFactory implements ISamsung {
    @Override
    public Electrodomestico crearLicuadora() {
        return new SamsungLicuadora();
    }

    @Override
    public Electrodomestico crearTV() {
        return new SamsungTV();
    }
}
