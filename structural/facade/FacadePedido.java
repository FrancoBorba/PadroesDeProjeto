package structural.facade;

public class FacadePedido {
  private Pagamento pagamento;
    private Estoque estoque;
    private Entrega entrega;

    public FacadePedido() {
        this.pagamento = new Pagamento();
        this.estoque = new Estoque();
        this.entrega = new Entrega();
    }

    public void fazerPedido(String item, String metodoPagamento, String endereco) {
        if (estoque.verificarDisponibilidade(item)) {
            pagamento.processarPagamento(metodoPagamento);
            entrega.agendarEntrega(endereco);
            System.out.println("Pedido concluído com sucesso!\n");
        } else {
            System.out.println("Desculpe, item fora de estoque.");
        }
    }
}
