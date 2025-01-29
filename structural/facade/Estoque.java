package structural.facade;

public class Estoque {
     public boolean verificarDisponibilidade(String item) {
        System.out.println("Verificando disponibilidade de " + item);
        return true; // Simula que o item está disponível
    }
}
