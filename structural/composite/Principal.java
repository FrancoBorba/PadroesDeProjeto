package structural.composite;

public class Principal {
  public static void main(String[] args) {
    ProductLeaf pen = new ProductLeaf("Caneta", 1);
        ProductLeaf smartphone = new ProductLeaf("Smartphone", 1000);
        ProductLeaf tShirt = new ProductLeaf("Camiseta", 40);

        ProductComposite productBox = new ProductComposite();
        productBox.add(pen, smartphone, tShirt);

        ProductLeaf tablet = new ProductLeaf("Tablet", 2000);
        ProductLeaf kindle = new ProductLeaf("Kindle", 300);

        ProductComposite anotherProductBox = new ProductComposite();
        anotherProductBox.add(tablet, kindle);

        productBox.add(anotherProductBox);

        System.out.println(productBox);
        System.out.println("Total price: $" + productBox.getPrice());
    }
  }

