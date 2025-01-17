package creational.builder;

import creational.builder.classes.*;

public class Principal {
  public static void main(String[] args) {
   // Arroz arroz = new Arroz("Arroz", 10.0);
   // Feijao feijao = new Feijao("Feijão", 15.0);
    //Carne carne = new Carne("Picanha", 100.0);
   // Bebida refrigerante = new Bebida("Coca Cola", 8);

    //CompositeCaixaRefeicoes caixaRefeicoes = new CompositeCaixaRefeicoes();

   // caixaRefeicoes.add(arroz,feijao,carne,refrigerante);
    
    //System.out.println(caixaRefeicoes);
   // System.out.println(caixaRefeicoes.getPreco());

   PratoPadraoBuilder prato = new PratoPadraoBuilder();

   prato.fazerRefeicao();
   prato.fazerSobremesa();
   

   System.out.println(prato.getPrato());

   System.out.println("Preço da refeição: " + prato.getPrato().getPreco());

   prato.reset();

   prato.fazerBebida();

   System.out.println(prato.getPrato());

   


  
  }
}
