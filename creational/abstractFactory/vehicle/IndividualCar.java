package creational.abstractFactory.vehicle;

import creational.abstractFactory.interfaces.Customer;
import creational.abstractFactory.interfaces.Vehicle;

public class IndividualCar implements Vehicle {


  private String nameCar;
   private Customer customer;
    
    
      public IndividualCar(String nameCar , Customer customer){
        this.customer = customer;
        this.nameCar =  nameCar;
      }
    
      @Override
      public void pickUp() {
        System.out.println("Pegou o clinete: " + this.customer.getName() + " no carro " + nameCar);
  }
  
}
