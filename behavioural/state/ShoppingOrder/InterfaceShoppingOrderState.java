package behavioural.state.ShoppingOrder;

public interface InterfaceShoppingOrderState {

  String getName();
  void pagamentoAprovado();
  void pagamentoRejeitado();
  void pagamentoEmEspera();
  void pedidoDeEnvio();
}