import AbstractFactory.*;
import Decorator.*;
import Singleton.*;
import Prototype.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n ***Factory***");
        LGFactory lgFactory = new LGFactory();
        SamsungFactory samsungFactory = new SamsungFactory();

        Electrodomestico licuadora = lgFactory.crearLicuadora();
        Electrodomestico tv = samsungFactory.crearTV();
        System.out.println(licuadora.operacion());
        System.out.println(tv.operacion());
        
        System.out.println("\n ***Decorator***");
        Electrodomestico licuadoraConSeguro = new SeguroMotor(licuadora);
        Electrodomestico tvConSeguro = new SeguroPantalla(tv);
        System.out.println(licuadoraConSeguro.operacion());
        System.out.println(tvConSeguro.operacion());

        System.out.println("\n ***Singleton***");
        AdministradorLG adminLG = AdministradorLG.getInstancia();
        System.out.println(adminLG.toString());
        AdministradorSamsung adminSamsung = AdministradorSamsung.getInstancia();
        System.out.println(adminSamsung.toString());

        System.out.println("\n ***Prototype***");
        PrototypeFactory licuadoraFactory = new PrototypeFactory(licuadora);
        PrototypeFactory tvFactory = new PrototypeFactory(tv);
        
        Electrodomestico licuadora2 = licuadoraFactory.clonar();
        Electrodomestico licuadora3 = licuadoraFactory.clonar();
        Electrodomestico licuadora4 = licuadoraFactory.clonar();
        Electrodomestico tv2 = tvFactory.clonar();
        Electrodomestico tv3 = tvFactory.clonar();

        System.out.println("Copia 1 de " + licuadora2.operacion());
        System.out.println("Copia 2 de " + licuadora3.operacion());
        System.out.println("Copia 3 de " + licuadora4.operacion());
        System.out.println("Copia 1 de " + tv2.operacion());
        System.out.println("Copia 2 de " + tv3.operacion());
    }
}
