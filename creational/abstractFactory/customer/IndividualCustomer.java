package creational.abstractFactory.customer;

import creational.abstractFactory.interfaces.Customer;

public class IndividualCustomer implements Customer {

   private String name;

  public IndividualCustomer(String name){
    this.name = name;
  }

  @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

  
  
  
}
