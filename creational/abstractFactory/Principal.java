package creational.abstractFactory;

import creational.abstractFactory.factories.EnterpriseCustomerVehicleFactory;
import creational.abstractFactory.factories.IndividualCustomerVehicleFactory;
import creational.abstractFactory.interfaces.Vehicle;

public class Principal {
  public static void main(String[] args) {
    EnterpriseCustomerVehicleFactory enterpriseFactory = new EnterpriseCustomerVehicleFactory();
    IndividualCustomerVehicleFactory individualFactory = new IndividualCustomerVehicleFactory();

    Vehicle carro1 = enterpriseFactory.creatVehicle("Ferrari", "Franco"); // ja cria o customer Franco

    Vehicle carro2 = individualFactory.creatVehicle("Fusca", "Greco"); // ja cria o customer Greco

    carro1.pickUp();
    carro2.pickUp();

    // as ações no metodo pickUp são iguais para fins de estudo e praticidade
    // porem classes diferentes fariam coisas diferentes já que se fazem a mesma coisa
    // não é necessário duas classes
  }
}
