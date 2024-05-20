package edu.yago.primeirasemana;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class estruturasExcepcionais {
    public static void main (String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String name = scanner.next();
            System.out.println("Digite seu sobrenome: ");
            String sobreName = scanner.next();
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();
            //IMPRIMINDO dados obtidos dos usuários
            System.out.println("Olá me chamo " + name.toUpperCase() + " " + sobreName.toUpperCase());
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        } catch (InputMismatchException e ) {
            System.out.println("Os campos idade e altura precisam ser numéricos.");
        }
        // Quando perceber que irá ter um erro, utiliza-se um bloco de tentativas "try" e caso n seja possível tratar teremos o bloco "catch" para executar caso ocorra o erro no try.
        // try - o que se espera ocorrer
        //catch - precisa-se saber a excecao que irá tratar em caso de fluxo não previsto.
        // finally - ocorre idependente do try ou catch.


    }

}
