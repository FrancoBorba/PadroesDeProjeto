package behavioural.state.ShoppingOrder;

public class OrdemRecusada implements InterfaceShoppingOrderState {

    private String name = "Ordem Recusada";
    @SuppressWarnings("unused")
    private OrdemShopping ordem;

    public OrdemRecusada(OrdemShopping ordem){
      this.ordem = ordem;
    }


  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void pagamentoAprovado() {
    System.out.println("Não posso aprovar o pagamento pois o pedido foi recusado");
  }

  @Override
  public void pagamentoRejeitado() {
    System.out.println("Não posso rejeitar pois o pepdido já está rejeitado");
  }

  @Override
  public void pagamentoEmEspera() {
    System.out.println("Não posso mover para pendente pois o pedido está recusado");
  }

  @Override
  public void pedidoDeEnvio() {
    System.out.println("Não posso enviar um pedido com pagamento recusado");
  }
  
}
