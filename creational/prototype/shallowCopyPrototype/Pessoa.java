package creational.prototype.shallowCopyPrototype;

import java.util.ArrayList;
import java.util.List;


/*
 o java tem como nativo a interface Cloneable , mas deixei a pasta da Interface ainda 
 para fim de estudos , além disso é possivel fazer que a interface herde Cloneable
/assim ficando evidente que está utilizando um prototype

Usar Cloneable é suficiente na maioria dos casos em Java.
Criar uma interface Prototype é útil em projetos maiores ou quando você quer deixar o design mais claro e personalizado. 
*/
public class Pessoa implements Cloneable {
    private String name;
    private int age;
    private List<Address> addresses = new ArrayList<>();

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Pessoa clone() {
        Pessoa newObj = new Pessoa(this.name, this.age);
        newObj.setAddresses(this.addresses); // Shallow copy: referências compartilhadas
        return newObj;
    }

    @Override
    public String toString() {
      return "Pessoa [name=" + name + ", age=" + age + ", addresses=" + addresses + "]";
    }

  
}
