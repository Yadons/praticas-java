package edu.yago.segundasemanaPOO;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Marcos", "045.874.698-9"); // A passagem de parâmetros se torna obrigatório devido a classe construtora.

        pessoa.setEndereco("Avenida Machado de Assis");
    }

}
