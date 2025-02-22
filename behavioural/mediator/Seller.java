package behavioural.mediator;

import java.util.ArrayList;


public class Seller {

  private ArrayList<ProductSeller> products = new ArrayList<>();
  @SuppressWarnings("unused")
  private Mediator mediator;

 public void showProducts(){
    for(ProductSeller produto : products ){
        System.out.println(produto);
    }
  }

  public void addProducts(ProductSeller product){
    products.add(product);
  }

  public void setMediator(Mediator mediator){
    this.mediator = mediator;
  }

  public ProductSeller sell(String id){
      int productIndex = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                productIndex = i;
                break;
            }
        }
        if (productIndex == -1) {
            return null;
        }
        return products.remove(productIndex);


  }



 
}