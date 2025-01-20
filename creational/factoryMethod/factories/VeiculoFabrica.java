package creational.factoryMethod.factories;

import creational.factoryMethod.veiculos.*;

public abstract class VeiculoFabrica {

  // FACTORY METODH
 abstract InterfaceVeiculo getVeiculo(String nomeVeiculo); // as subclasses decidem qual veiculo instanciar

  public InterfaceVeiculo pegarCliente(String clienteNome , String nomeVeiculo) {
  InterfaceVeiculo carro = getVeiculo(nomeVeiculo);
  carro.pegarCliente(clienteNome);
  return carro;
  }
   
  
}
