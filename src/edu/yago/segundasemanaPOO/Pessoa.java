package edu.yago.segundasemanaPOO;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa (String nome, String cpf) { // Usa o cpf e o nome como sendo obrigatórios da class, ou seja as informações relevantes para o uso da class.
        this.nome = nome;
        this.cpf = cpf;
    };

    public String getEndereco(){
        return endereco;
    };

    public void setEndereco(String newEndereco) {
        endereco = newEndereco; //Pode ser this.endereco
    };
}
