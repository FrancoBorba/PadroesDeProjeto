package creational.factoryMethod.factories;

import creational.factoryMethod.veiculos.Bicicleta;


public class BicicletaFabrica extends VeiculoFabrica {

  @Override
  public Bicicleta getVeiculo(String nomeVeiculo) {
    return new Bicicleta(nomeVeiculo);
  }

  
}