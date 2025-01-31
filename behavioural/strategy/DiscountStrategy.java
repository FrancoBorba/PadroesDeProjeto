package behavioural.strategy;

public class DiscountStrategy {
  @SuppressWarnings("unused")
  private double discount ;


  double getDiscount(ECommerceShoppingCart cart){
    return cart.getTotal();
  }
  
}
