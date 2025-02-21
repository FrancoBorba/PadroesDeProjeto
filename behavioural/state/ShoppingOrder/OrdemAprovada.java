package behavioural.state.ShoppingOrder;

public class OrdemAprovada implements InterfaceShoppingOrderState {

  private String name = "Ordem Aprovada";
  private OrdemShopping ordem;

  public OrdemAprovada(OrdemShopping ordem){
    this.ordem = ordem;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void pagamentoAprovado() {
    System.out.println("O pedido já está no estado de aprovado");
  }

  @Override
  public void pagamentoRejeitado() {
   this.ordem.setState(new OrdemRecusada(this.ordem));
  }

  @Override
  public void pagamentoEmEspera() {
    this.ordem.setState(new OrdemPendente(this.ordem));
  }

  @Override
  public void pedidoDeEnvio() {
    System.out.println("Enviando pedido para cliente");
  }
  
}
