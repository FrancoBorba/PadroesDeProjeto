package structural.decorator.produto;

public class Camisa implements InterfaceProduto{

  private String nameProduto;
  private double valorProduto;

  
  public Camisa(String nameProduto, double valorProduto) {
    this.nameProduto = nameProduto;
    this.valorProduto = valorProduto;
  }

  @Override
  public double getPrice() {
    return this.valorProduto;
  }

  @Override
  public String getName() {
    return this.nameProduto;
  }
  
}
