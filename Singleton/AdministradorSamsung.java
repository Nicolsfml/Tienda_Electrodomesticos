package Singleton;

public class AdministradorSamsung {
    private static AdministradorSamsung instancia;

    private AdministradorSamsung() {}

    public static AdministradorSamsung getInstancia() {
        if (instancia == null) {
            instancia = new AdministradorSamsung();
        }
        return instancia;
    }

    @Override
    public String toString() {
        return "Usuario: Administrador de Samsung";
    }
}
