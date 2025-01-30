package structural.flyweight.delivery;

public class DeliveryContext {
    public static void deliverPackage(DeliveryFactory factory, String name, String number, String street, String city) {
        InterfaceDeliveryFlyweight location = factory.makeLocation(new DeliveryLocationData(street, city));
        location.deliver(name, number);
    }
}
