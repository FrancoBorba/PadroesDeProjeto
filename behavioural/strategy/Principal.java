package behavioural.strategy;

public class Principal {
  public static void main(String[] args) {
        ECommerceShoppingCart shoppingCart = new ECommerceShoppingCart();

        // Aplicando estratégias de desconto
        shoppingCart.setDiscount(new DefaultDiscount());
        shoppingCart.setDiscount(new NewDiscount());

        // Adicionando produtos ao carrinho
        shoppingCart.addProduct(new Product("Produto 1", 50));
        shoppingCart.addProduct(new Product("Produto 2", 50));
        shoppingCart.addProduct(new Product("Produto 2", 50));

        // Exibindo os valores
        System.out.println(shoppingCart.getTotal());
        System.out.println(shoppingCart.getTotalWithDiscount());
    }
}
