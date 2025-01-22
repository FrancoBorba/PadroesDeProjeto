package creational.abstractFactory.customer;

import creational.abstractFactory.interfaces.Customer;

public class EnterpriseCustomer implements Customer {

  private String name;

  public EnterpriseCustomer(String name){
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
