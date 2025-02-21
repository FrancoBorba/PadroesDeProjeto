package behavioural.state;

import behavioural.state.ShoppingOrder.OrdemShopping;

public class Principal {
  public static void main(String[] args) {
    OrdemShopping ordem = new OrdemShopping();

    ordem.pagamentoAprovado();
    ordem.pagamentoEmEspera();
    ordem.enviarProduto();
    ordem.pagamentoRejeitado(); // a partir daqui nao altera o estado
    ordem.pagamentoAprovado();
    ordem.pagamentoEmEspera();
  }
}
