package edu.yago.primeirasemana;

import java.util.Date;

public class operadores {
    String name = "Yago"; //Uso de operadores.
    int idade = 23;
    double peso = 75.0;
    char sexo = 'M'; // Aqui se usa aspas simples e não dupla.
    boolean doadorOrgao = false;
    Date dataNascimento = new Date();

    //Operadores aritméticos
    int num1; int num2;

    int soma = num1 + num2;
    int subtracao = num1 - num2;
    int multiplicacao = num1 * num2;
    int divisao = num1 / num2;
    int modulo = num1 % 2;
    double resultado = (10 * 7) + ((double) 20 / 4);

    // O "+" serve para concatenar textos tbm.

    // Operadores unários
    // +  - ++ -- !

    //Operadores ternários
    // <Expressão Condicional>`` ? ``<Caso condição seja true>`` : ``<Caso condição seja false>

    //Operadores relacionais
    //== Quando desejamos verificar se uma variável é IGUAL A outra.
    //!= Quando desejamos verificar se uma variável é DIFERENTE da outra.
    //> Quando desejamos verificar se uma variável é MAIOR QUE a outra.
    //>= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
    //< Quando desejamos verificar se uma variável é MENOR QUE outra.
    //<= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

    // Operadores de comparação
    // ==
    // equals - Usado para comparar objetos na linguagem.

    //Operadores lógicos
    //&& Operador Lógico "E"
    //|| Operador Lógico "OU"

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        boolean simNao = num1 == num2;
        System.out.println("O número 1 é igual a número 2? " + simNao);

        simNao = num1 != num2;

        System.out.println("O número 1 é diferente de número 2? " + simNao);

        simNao = num1 > num2;

        System.out.println("O número 1 é maior que número 2? " + simNao);
        System.out.println("Oi");
    }
}
