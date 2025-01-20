package creational.factoryMethod.veiculos;

public class Carro implements InterfaceVeiculo {

  private String nomeCarro;

  public Carro( String nomeCarro){
    this.nomeCarro = nomeCarro;
  }
  @Override
  public void pegarCliente(String clienteNome) {
    System.out.println(nomeCarro + "está buscando " + clienteNome);
 
  }

  @Override
  public void parar() {
    System.out.println("Parou");
  }
  
}
