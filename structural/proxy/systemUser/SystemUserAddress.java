package structural.proxy.systemUser;

import java.util.Objects;

public class SystemUserAddress {
 private String street;
    private int number;

    public SystemUserAddress(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "SystemUserAddress{street='" + street + "', number=" + number + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemUserAddress that = (SystemUserAddress) o;
        return number == that.number && Objects.equals(street, that.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number);
    }
}
