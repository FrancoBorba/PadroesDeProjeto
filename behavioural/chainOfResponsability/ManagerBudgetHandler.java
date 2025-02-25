package behavioural.chainOfResponsability;

public class ManagerBudgetHandler extends BaseBudgetHandler {
  public CustomerBudgte handle(CustomerBudgte budgte){
      if(budgte.getPrice() <= 5000){
        System.out.println("O Manager tratou o orçamento");
        budgte.setAprove(true);
        return budgte;
      }
    return super.handle(budgte);
    }
}
