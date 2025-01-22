package creational.abstractFactory.factories;

import creational.abstractFactory.customer.EnterpriseCustomer;
import creational.abstractFactory.interfaces.Customer;
import creational.abstractFactory.interfaces.Vehicle;
import creational.abstractFactory.vehicle.EnterpriseCar;

public class EnterpriseCustomerVehicleFactory implements CustomerVehicleFactory {

  @Override
  public Customer createCustomer(String customerName) {
    return new EnterpriseCustomer(customerName);
  }

  @Override
  public Vehicle creatVehicle(String nameVehicle, String customerName) {
    Customer customer = createCustomer(customerName);
    return new EnterpriseCar(nameVehicle , customer );
  }
  
}
