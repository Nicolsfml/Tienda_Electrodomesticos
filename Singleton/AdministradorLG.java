package Singleton;

public class AdministradorLG {
    private static AdministradorLG instancia;

    private AdministradorLG() {}

    public static AdministradorLG getInstancia() {
        if (instancia == null) {
            instancia = new AdministradorLG();
        }
        return instancia;
    }

    @Override
    public String toString() {
        return "Usuario: Administrador de LG";
    }
}
