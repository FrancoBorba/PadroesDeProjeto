package creational.abstractFactory.vehicle;


import creational.abstractFactory.interfaces.Customer;
import creational.abstractFactory.interfaces.Vehicle;

public class EnterpriseCar implements Vehicle {

  private String nameCar;
   private Customer customer;
    
    
      public EnterpriseCar(String nameCar , Customer customer){
        this.customer = customer;
        this.nameCar =  nameCar;
      }
    
      @Override
      public void pickUp() {
        System.out.println("Pegou o clinete: " + this.customer.getName() + " no carro " + nameCar);
  }
  
}
