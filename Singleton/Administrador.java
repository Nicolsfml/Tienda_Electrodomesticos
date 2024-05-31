package Singleton;

public class Administrador {
    private static Administrador instancia;

    private Administrador() {}

    public static Administrador getInstancia() {
        if (instancia == null) {
            instancia = new Administrador();
        }
        return instancia;
    }

    @Override
    public String toString() {
        return "Usuario: Administrador";
    }
}
