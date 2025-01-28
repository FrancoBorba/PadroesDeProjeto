package structural.decorator.produto;

public class CamisaEstampadaDecorator extends ProdutoDecorator {

  public CamisaEstampadaDecorator(InterfaceProduto produto) {
    super(produto);
    //TODO Auto-generated constructor stub
  }
  @Override
  public double getPrice() { // camisas que utilizarem esse decorador terao 10 reais a mais

    return super.getPrice() + 10;
  }
  
}
