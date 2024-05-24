package edu.yago.segundasemanaPOO.conceitos;

public class Autodromo {
     public static void main(String[] args) {
        carro argo = new carro();
        moto honda160 = new moto();
         // Aplicando polimorfismo, ligar veiculo serve para moto ou carro. Mesma ação para dois objetos.
         argo.ligar();
         honda160.ligar();
         argo.setchassi("875942");
         honda160.setchassi("985742");

    };
}
