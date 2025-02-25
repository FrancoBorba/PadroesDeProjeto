package behavioural.chainOfResponsability;

public class Principal {  public static void main(String[] args) {
    CustomerBudgte customerBudgte = new CustomerBudgte(5001.0); // altere o preco para ver quem tratou do orcamento
    SellerBudgetHandler seller = new SellerBudgetHandler();
    

  seller.setNextHandle(new ManagerBudgetHandler()).setNextHandle(new DirectorBudgetHandler()).setNextHandle(new CeoBudgetHandler());

    seller.handle(customerBudgte);

    System.out.println(customerBudgte);

  }
}
