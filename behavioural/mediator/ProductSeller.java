package behavioural.mediator;

public class ProductSeller {
  private String id;
  private String name;
  private float preco;


  
  public ProductSeller(String id, String name, float preco) {
    this.id = id;
    this.name = name;
    this.preco = preco;
  }
  
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public float getPreco() {
    return preco;
  }
  public void setPreco(float preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Product [id=" + id + ", name=" + name + ", preco=" + preco + "]";
  }

  
  
}
