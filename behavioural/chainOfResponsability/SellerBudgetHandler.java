package behavioural.chainOfResponsability;

public class SellerBudgetHandler extends BaseBudgetHandler {
    public CustomerBudgte handle(CustomerBudgte budgte){
      if(budgte.getPrice() <= 1000){
        System.out.println("O vendedor tratou o orçamento");
        budgte.setAprove(true);
        return budgte;
      }
    return super.handle(budgte);
    }
}
