package creational.builder.classes;
import creational.builder.interfaces.InterfaceBuilderRefeicoes;

public class PratoPadraoBuilder implements InterfaceBuilderRefeicoes {

  private CompositeCaixaRefeicoes caixaRefeicoes = new CompositeCaixaRefeicoes();

  public void reset(){
    this.caixaRefeicoes = new CompositeCaixaRefeicoes();
  }

  @Override
  public void fazerRefeicao() {
     Arroz arroz = new Arroz("Arroz", 10.0);
    Feijao feijao = new Feijao("Feijão", 15.0);
    Carne carne = new Carne("Picanha", 100.0);
    this.caixaRefeicoes.add(arroz,feijao,carne);
  }

  @Override
  public void fazerBebida() {
      Bebida refrigerante = new Bebida("Coca Cola", 8);
      this.caixaRefeicoes.add(refrigerante);
  }

  @Override
  public void fazerSobremesa() {
    Sobremesa brigadeiro = new Sobremesa("Brigadeiro", 3);
    this.caixaRefeicoes.add(brigadeiro);
  }

  public CompositeCaixaRefeicoes getPrato(){

    return this.caixaRefeicoes;
  }
  
}
