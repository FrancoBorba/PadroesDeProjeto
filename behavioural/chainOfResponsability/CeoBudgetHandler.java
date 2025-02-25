package behavioural.chainOfResponsability;

public class CeoBudgetHandler extends BaseBudgetHandler{
  public CustomerBudgte handle(CustomerBudgte budgte){
        System.out.println("O CEO trata qualquer  orçamento");
        budgte.setAprove(true);
        return budgte;
      
    }
}
