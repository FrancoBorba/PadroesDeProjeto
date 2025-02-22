package behavioural.mediator;

public class Principal {
  public static void main(String[] args) {

    Mediator mediator = new Mediator();

    Seller vendedor1 = new Seller();
    ProductSeller cama = new ProductSeller("00", "Cama", 1000);
    ProductSeller mesa = new ProductSeller("01", "Mesa", 500);

    vendedor1.addProducts(cama);
    vendedor1.addProducts(mesa);
   

    Seller vendedor2 = new Seller();
    ProductSeller carro = new ProductSeller("03", "Corolla", 50000);
    ProductSeller moto = new ProductSeller("04", "Fazer", 20000);
    vendedor2.addProducts(moto);
    vendedor2.addProducts(carro);

    mediator.addSeller(vendedor1,vendedor2);

    Buyer comprador = new Buyer(mediator);

    comprador.viewProducts();
    comprador.buy("03");
    comprador.viewProducts();


   
  }
}
