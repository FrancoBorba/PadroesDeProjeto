package creational.factoryMethod.factories;

import creational.factoryMethod.veiculos.Carro;


public class CarroFabrica extends VeiculoFabrica{

  @Override
  public Carro getVeiculo(String nomeCarro) {
    return new Carro(nomeCarro);
    
  }

 
}
