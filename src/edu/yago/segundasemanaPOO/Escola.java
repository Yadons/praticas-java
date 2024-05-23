package edu.yago.segundasemanaPOO;

public class Escola {
    public static void main (String[] args) {
        Aluno felipe = new Aluno(); // Felipe recebe o tipo aluno que contém seus atributos.

        felipe.setNome("Felipe");
        felipe.setIdade(8);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getidade() + " anos.");
    }
}
