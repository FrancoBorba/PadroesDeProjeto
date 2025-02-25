package behavioural.chainOfResponsability;

public class DirectorBudgetHandler extends BaseBudgetHandler {
  public CustomerBudgte handle(CustomerBudgte budgte){
      if(budgte.getPrice() <= 50000){
        System.out.println("O diretor tratou o orçamento");
        budgte.setAprove(true);
        return budgte;
      }
    return super.handle(budgte);
    }
}
