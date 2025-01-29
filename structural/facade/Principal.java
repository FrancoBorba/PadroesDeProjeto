package structural.facade;
/*Cenário: Um sistema de pedidos de comida online envolve várias etapas internas, como processamento de pagamento, estoque e entrega. Em vez de expor todas essas complexidades, criamos uma fachada (PedidoFacade) que simplifica o processo para o cliente. */
public class Principal {
  public static void main(String[] args) {
       FacadePedido pedido = new FacadePedido();

        // Fazendo um pedido de forma simplificada
        pedido.fazerPedido("Pizza", "Cartão de Crédito", "Rua ABC, 123");
    }
  }

