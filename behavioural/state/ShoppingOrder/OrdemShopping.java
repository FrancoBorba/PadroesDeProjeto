package behavioural.state.ShoppingOrder;

public class OrdemShopping {
  private InterfaceShoppingOrderState state = new OrdemPendente(this); // comeca com pagamento pendente

  public InterfaceShoppingOrderState getState(){
    return this.state;
  }

  public void setState(InterfaceShoppingOrderState state){
    this.state = state;
    System.out.println("Estado alterado para: " + this.state.getName());
  }

  public String getStateName(){
    return this.state.getName();
  }

  public void pagamentoAprovado(){
    this.state.pagamentoAprovado();
  }

  public void pagamentoRejeitado(){
    this.state.pagamentoRejeitado();
  }

  public void pagamentoEmEspera(){
    this.state.pagamentoEmEspera();
  }

  public void enviarProduto(){
    this.state.pedidoDeEnvio();
  }



}
