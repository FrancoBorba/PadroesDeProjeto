package creational.prototype;

import creational.prototype.shallowCopyPrototype.*;

public class Principal {
 
    public static void main(String[] args) {
        Address address1 = new Address("Av Brasil", 15);
        Pessoa person1 = new Pessoa("Luiz", 30);
        person1.addAddress(address1);

        // Clonando o objeto (Shallow Copy)
        Pessoa person2 = person1.clone();
        person2.setName("Person2");

        // Alterando o endereço do person1
        person1.getAddresses().get(0).setStreet("Bla bla bla");

        person2.setAge(10); // se mudarmo a idade da pessoa2 não ira buscar no prototype da pessoa1

        // Saídas
        System.out.println("Person 1: " + person1);
        System.out.println("Addresses (Person 1): " + person1.getAddresses());

        System.out.println();



        System.out.println("Person 2: " + person2);
        System.out.println("Addresses (Person 2): " + person2.getAddresses());



      /*
      Shallow Copy (Cópia Superficial):
      No exemplo acima, a lista addresses é compartilhada entre person1 e person2. Qualquer alteração nos objetos dentro dessa lista refletirá em ambas as instância
 */


    }
  
}
