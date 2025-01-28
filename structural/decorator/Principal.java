package structural.decorator;

import structural.decorator.produto.Camisa;
import structural.decorator.produto.CamisaEstampadaDecorator;
import structural.decorator.produto.ProdutoDecorator;

public class Principal {
  public static void main(String[] args) {
    Camisa camisa = new Camisa("Polo", 100);

    System.out.println(camisa.getPrice());


    ProdutoDecorator decoratorCamisa = new ProdutoDecorator(camisa);

    System.out.println(decoratorCamisa.getPrice());

    CamisaEstampadaDecorator camisaEstampada = new CamisaEstampadaDecorator(camisa);

    CamisaEstampadaDecorator camisaComDuasEstampas = new CamisaEstampadaDecorator(camisaEstampada);

    System.out.println(camisaEstampada.getPrice());

    System.out.println(camisaComDuasEstampas.getPrice());
    

   
  }
}
