package behavioural.strategy;

public class NewDiscount extends DiscountStrategy {
  private double discount = 0;


  double getDiscount(ECommerceShoppingCart cart){
    double total = cart.getTotal();

   if (total >= 150) {
      this.discount = 5;
    }

    return total - total * (this.discount / 100);
  }
  
}
