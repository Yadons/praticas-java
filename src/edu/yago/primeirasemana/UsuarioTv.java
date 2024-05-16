package edu.yago.primeirasemana;

public class UsuarioTv {
    public static void main (String[] args) throws Exception {
        metodos smartTv = new metodos(); // conectando a classe metodos onde fica a smartTv.

        System.out.println("Tv ligada? : " + smartTv.estadoTv);
        System.out.println("Canal atual? : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println(" Novo estado -> Tv ligada? : " + smartTv.estadoTv);

        smartTv.desligar();
        System.out.println(" Novo estado -> Tv ligada? : " + smartTv.estadoTv);

        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        System.out.println("Volume atual : " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.mudarCanal(2);
        smartTv.mudarCanal(10);
    }
}
