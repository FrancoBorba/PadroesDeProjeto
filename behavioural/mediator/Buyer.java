package behavioural.mediator;

public class Buyer {
  private Mediator mediator;

  public Buyer(Mediator mediator){
    this.mediator = mediator;
  }

  public void viewProducts(){
    mediator.showProducts();
  }

  public void buy(String id){
    mediator.buy(id);
  }
}
