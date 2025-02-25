package behavioural.chainOfResponsability;

public abstract class BaseBudgetHandler {
  protected BaseBudgetHandler nextHandler  = null;

  public CustomerBudgte handle(CustomerBudgte budgte){
    if(nextHandler != null){
      return this.nextHandler.handle(budgte);
    }
    return budgte;
  }

  public BaseBudgetHandler setNextHandle(BaseBudgetHandler handler){
    this.nextHandler = handler;
    return handler;
  }
}
