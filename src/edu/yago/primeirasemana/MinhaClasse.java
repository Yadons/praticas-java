package edu.yago.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        String primeiroNome = "Yago";
        String segundoNome = "Silva";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome ) {

        return primeiroNome.concat(" ").concat(segundoNome).concat(".");
    }
}
