package behavioural.state.ShoppingOrder;

public class OrdemPendente implements InterfaceShoppingOrderState {

  private String name = "Ordem pendente";
  private OrdemShopping ordem;

  public OrdemPendente(OrdemShopping ordem){
    this.ordem = ordem;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void pagamentoAprovado() {
    this.ordem.setState(new OrdemAprovada(this.ordem));
  }

  @Override
  public void pagamentoRejeitado() {
    this.ordem.setState(new OrdemRecusada(this.ordem));
  }

  @Override
  public void pagamentoEmEspera() {
    System.out.println("O pedido já está no estado pendente");
  }

  @Override
  public void pedidoDeEnvio() {
   System.out.println("Não posso enviar o pedido com pagamento pendente");
  }
  
}
