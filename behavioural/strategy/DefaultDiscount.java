package behavioural.strategy;

public class DefaultDiscount extends DiscountStrategy {
   private double discount = 0;


  double getDiscount(ECommerceShoppingCart cart){
    double total = cart.getTotal();
   

    if (total >= 100 && total < 200) {
      
      this.discount = 10;

    } else if (total >= 200 && total < 300) {
      this.discount = 20;
    } else if (total >= 300) {
      this.discount = 30;
    }

    total = total - (total* (discount/100));
    
   
    return total ;
  }
  
}
