package AbstractFactory;

public class SamsungLicuadora implements Electrodomestico {
    @Override
    public String operacion() {
        return "Licuadora Samsung funcionando";
    }

    @Override
    public Electrodomestico clone() throws CloneNotSupportedException {
        return (SamsungLicuadora) super.clone();
    }
}
