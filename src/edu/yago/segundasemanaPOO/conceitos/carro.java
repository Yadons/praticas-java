package edu.yago.segundasemanaPOO.conceitos;

public class carro extends veiculo{ //Estou dizendo que carro herda de veiculos - extends.
    public void ligar () {
        confereAgua();
        confereOleo();
        conferirCombustivel();
        System.out.println("LIGANDO VEÍCULO...");
    };
    private void conferirCombustivel() { // Aplicando encapsulamento.
      System.out.println("Conferindo combustível... TUDO CERTO!");
    };
    private void confereAgua() {
      System.out.println("TUDO CERTO COM A ÁGUA DO VEÍCULO.");
    };
    private void confereOleo() {
        System.out.println("TUDO CERTO COM O ÓLEO.");
    };
}
