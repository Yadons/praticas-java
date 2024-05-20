package edu.yago.primeirasemana;

public class repeticoes {

  public static void main(String[] args) throws Exception {


      for (int carneiros = 1; carneiros <= 5; carneiros++){
          System.out.println("Contagem de carneiros: " + carneiros);
      };
      System.out.println("Finalmente dormiu.");

      String criancas [] = {"João", "Felipe", "Melissa", "Joana"};
      for (int x = 0; x < criancas.length; x++){ // Interação de um array, o índice em array sempre começa em zero
          System.out.println("O nome é " + criancas[x]);
      };

      //Forma abreviada
      System.out.println("O 'FOR' DE FORMA ABREVIADA: ");
      for (String abreviado: criancas){
          System.out.println("Nome do aluno é " + abreviado);
      };
      for (int contador = 1; contador <= 5; contador++){ // Mudar o fluxo ou desconsiderar um processo de uma interação.
          if (contador == 3){ // O break serve para encerrar o processo naquela interação.
              continue;
          };
          System.out.println(contador);
      };
      double dinheiro = 20.0;

      while (dinheiro != 0){ // Enquanto for verdadeira irá executar, só para se for falsa a condição.

          dinheiro--;
          if((dinheiro >= 6) && (dinheiro <= 20)) {
              System.out.println("O dinheiro está acabando!");
              continue;
          } else if( (dinheiro > 1) && (dinheiro <= 5) ){
              System.out.println("Pouquíssimo dinheiro!");
              continue;
          } else {
              System.out.println("Sem nada mais! :(");
              break;
          }
      };
      do {
          dinheiro++;
          if ((dinheiro >= 23) && (dinheiro < 25)){
              System.out.println("O dinheiro está aumentando uhuhu!");
              continue;
          } else if(dinheiro == 25){
              System.out.println("Atingiu o limite!");
              break;
          };
      }while (dinheiro != 25);

  }
};
