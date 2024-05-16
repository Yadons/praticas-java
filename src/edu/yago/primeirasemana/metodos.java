package edu.yago.primeirasemana;

public class metodos {
    //Sistema smart Tv
    boolean estadoTv = true;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        estadoTv = true;

    };
    public void desligar() {
        estadoTv = false;
    };
    public void aumentarVolume() {
        System.out.println("Aumentando volume...");
        volume++;
    };
    public void abaixarVolume() {
        volume--;
    };
    public void mudarCanal(int numeroCanal) {
        canal = numeroCanal;
        System.out.println("O novo canal é " + canal);
    };
}
