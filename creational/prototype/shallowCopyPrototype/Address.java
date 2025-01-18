package creational.prototype.shallowCopyPrototype;

import creational.prototype.interfaces.PrototypeInterface;

public class Address implements PrototypeInterface {
    private String street;
    private int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public Address clone() {
        return new Address(this.street, this.number);
    }

    @Override
    public String toString() {
        return "Address{street='" + street + "', number=" + number + '}';
    }
}