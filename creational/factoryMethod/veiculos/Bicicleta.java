package creational.factoryMethod.veiculos;

public class Bicicleta implements InterfaceVeiculo {

   private String nomeBicicleta;

   public Bicicleta(String nomeBicicleta){
    this.nomeBicicleta = nomeBicicleta;
   }

   @Override
  public void pegarCliente(String clienteNome) {
    System.out.println(nomeBicicleta + "está buscando " + clienteNome);
 
  }

  @Override
  public void parar() {
    System.out.println("Parou");
  }
  
}
