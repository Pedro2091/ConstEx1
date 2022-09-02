package view;

import model.Ventilador;

public class Main {
    public static void main(String[] args) {
        Ventilador v1 = new Ventilador("branca");
        Ventilador v2 = new Ventilador(1l, "branca", true);

        System.out.println(v1.verVelocidade());
        System.out.println(v2.verVelocidade()+"\n\n");

        v1.ligar();
        v2.desligar();

        System.out.println(v1.verVelocidade());
        System.out.println(v2.verVelocidade());
    }
}
