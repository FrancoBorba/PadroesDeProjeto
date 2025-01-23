package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductComposite extends ProductComponent {

   private List<ProductComponent> children = new ArrayList<>();

  @Override
  void add(ProductComponent ... products) {
      for (ProductComponent product : products) {
            children.add(product);
        }
  }

  @Override
  void remove(ProductComponent productComposite) {
    children.remove(productComposite);
  }

  @Override
  double getPrice() {
         return children.stream().mapToDouble(ProductComponent::getPrice).sum();
  }

    public String toString() {
        return "ProductComposite{" + "children=" + children + '}';
    }
  
}
