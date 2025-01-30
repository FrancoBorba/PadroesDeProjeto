package structural.flyweight;

import structural.flyweight.delivery.DeliveryContext;
import structural.flyweight.delivery.DeliveryFactory;

public class Principal {
  public static void main(String[] args) {
        DeliveryFactory factory = new DeliveryFactory();

        DeliveryContext.deliverPackage(factory, "Luiz", "20A", "Av Brasil", "SP");
        DeliveryContext.deliverPackage(factory, "Helena", "20A", "Av Brasil", "SP");
        DeliveryContext.deliverPackage(factory, "Joana", "502", "Av Brasil", "SP");
        DeliveryContext.deliverPackage(factory, "Eliana", "2", "Rua A", "BH");
        DeliveryContext.deliverPackage(factory, "João", "501", "Rua B", "RJ");

        System.out.println();
        System.out.println(factory.getLocations());
    }
}
