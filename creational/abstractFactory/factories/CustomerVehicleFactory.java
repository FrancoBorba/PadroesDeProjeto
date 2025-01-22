package creational.abstractFactory.factories;

import creational.abstractFactory.interfaces.Customer;
import creational.abstractFactory.interfaces.Vehicle;

public interface CustomerVehicleFactory {
  Customer createCustomer(String customerName);
  Vehicle creatVehicle(String nameVehicle , String customerName);
  
} 
