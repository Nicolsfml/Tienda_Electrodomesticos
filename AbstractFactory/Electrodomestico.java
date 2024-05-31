package AbstractFactory;

public interface Electrodomestico extends Cloneable {
    String operacion();
    Electrodomestico clone() throws CloneNotSupportedException;
}
