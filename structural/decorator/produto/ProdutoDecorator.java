package structural.decorator.produto;

public class ProdutoDecorator implements InterfaceProduto {

  private InterfaceProduto produto;

  public ProdutoDecorator(InterfaceProduto produto){
    this.produto = produto;
  }

  @Override
  public double getPrice() {
    return this.produto.getPrice();
  }

  @Override
  public String getName() {
  return this.produto.getName(); 
  }
  
}
