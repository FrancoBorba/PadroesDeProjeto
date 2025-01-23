package structural.composite;

public abstract class ProductComponent {
  abstract double getPrice();

  void add(ProductComponent  ... products){}

  void remove(ProductComponent productComposite){}
}
