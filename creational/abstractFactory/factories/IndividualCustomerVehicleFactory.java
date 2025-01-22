package creational.abstractFactory.factories;


import creational.abstractFactory.customer.IndividualCustomer;
import creational.abstractFactory.interfaces.Customer;
import creational.abstractFactory.interfaces.Vehicle;
import creational.abstractFactory.vehicle.IndividualCar;

public class IndividualCustomerVehicleFactory implements CustomerVehicleFactory {

  @Override
  public Customer createCustomer(String customerName) {
      return new IndividualCustomer(customerName);
  }

  @Override
  public Vehicle creatVehicle(String nameVehicle, String customerName) {
     Customer customer = createCustomer(customerName);
    return new IndividualCar(nameVehicle , customer );
  }
  
}
