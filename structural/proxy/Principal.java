package structural.proxy;

import structural.proxy.systemUser.InterfaceSystemUser;
import structural.proxy.systemUser.SystemUserProxy;

public class Principal {
  public static void main(String[] args) {
    InterfaceSystemUser user = new SystemUserProxy("Carlos", "carlos_proxy");

        System.out.println("Primeira chamada: buscando endereços...");
        user.getAddresses().thenAccept(addresses -> addresses.forEach(System.out::println));

        // Aguarda um tempo para a execução assíncrona
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nSegunda chamada: usando cache...");
        user.getAddresses().thenAccept(addresses -> addresses.forEach(System.out::println));
  }
}
