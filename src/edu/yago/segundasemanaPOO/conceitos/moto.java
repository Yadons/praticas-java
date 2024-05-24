package edu.yago.segundasemanaPOO.conceitos;

public class moto extends veiculo { //Estou dizendo que carro herda de veiculos - extends

    public void ligar () {
        confereOleo();
        conferirCombustivel();
        System.out.println("LIGANDO VEÍCULO...");
    };
    private void conferirCombustivel() {
        System.out.println("Conferindo combustível... TUDO CERTO!");
    };

    private void confereOleo() {
      System.out.println("TUDO CERTO COM O ÓLEO.");
    };
}
