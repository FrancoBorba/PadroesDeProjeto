package creational.builder.classes;

import creational.builder.interfaces.InterfaceCompositeRefeicoes;

import java.util.ArrayList;
import java.util.List;

public class CompositeCaixaRefeicoes implements InterfaceCompositeRefeicoes {
   private final List<AbstractRefeico> children = new ArrayList<>();

    // Método para calcular o preço total
    @Override
    public double getPreco() {
        return children.stream()
                       .mapToDouble(AbstractRefeico::getPreco)
                       .sum();
    }

    // Método para adicionar itens à lista
    // Método para adicionar refeições (usando varargs)
    public void add(AbstractRefeico... meals) {
        for (AbstractRefeico meal : meals) {
            children.add(meal);
        }
    }

    @Override
    public String toString() {
      return "CompositeCaixaRefeicoes [children=" + children + "]";
    }

   

   
  
}
