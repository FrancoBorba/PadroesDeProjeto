package creational.factoryMethod;

import creational.factoryMethod.factories.BicicletaFabrica;
import creational.factoryMethod.factories.CarroFabrica;
import creational.factoryMethod.util.NumerosRandons;
import creational.factoryMethod.veiculos.InterfaceVeiculo;

public class Principal {
  public static void main(String[] args) {
    /* 
    Carro fusca = new Carro("Fusca");
    fusca.pegarCliente("Franco");
    fusca.parar();
    Sem factory , cada new se fica "preso" no código
    */

     CarroFabrica carFactory = new CarroFabrica();
        String[] customerNames = {"Ana", "Joana", "Helena", "João"};

        for (int i = 0; i < 10; i++) {
            InterfaceVeiculo vehicle = getRandomVehicle();
            String customerName = customerNames[NumerosRandons.getRandomNumber(customerNames.length)];

            vehicle.pegarCliente(customerName);
            vehicle.parar();

            InterfaceVeiculo newCar = carFactory.pegarCliente(customerName, "NOVO CARRO - " + NumerosRandons.getRandomNumber(100));

            newCar.parar();

            System.out.println("---");

  }
  }

     public static InterfaceVeiculo getRandomVehicle() {
        CarroFabrica carFactory = new CarroFabrica();
        BicicletaFabrica bicycleFactory = new BicicletaFabrica();

        InterfaceVeiculo car1 = carFactory.getVeiculo("Fusca");
        InterfaceVeiculo car2 = carFactory.getVeiculo("Celta Preto");
        InterfaceVeiculo bicycle = bicycleFactory.getVeiculo("Bicycle");

        InterfaceVeiculo[] vehicles = {car1, car2, bicycle};

        return vehicles[NumerosRandons.getRandomNumber(vehicles.length)];
    }
  }

