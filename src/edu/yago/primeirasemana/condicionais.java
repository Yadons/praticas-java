package edu.yago.primeirasemana;

public class condicionais {

    public static void main(String[] args) {
       //Condicionais simples!
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("O restante do seu saldo é de " + saldo);
        }
        int nota = 8;
        if(nota >= 6) {
            System.out.println("Aprovado!");
        } else if (nota >= 5) {
            System.out.println("Pode melhorar!");
        } else  {
            System.out.println("Reprovado!");
        }

    }
}
