package creational.builder.classes;
import creational.builder.interfaces.InterfaceCompositeRefeicoes;

public abstract class AbstractRefeico implements InterfaceCompositeRefeicoes {

 private double preco;
 @SuppressWarnings("unused")
private String nome;

  public AbstractRefeico(String nome , double preco){
    this.nome = nome;
    this.preco = preco;
  }

  @Override
  public double getPreco() {
   return preco;
  }
 
  public String getNome() {
        return nome;
    }

  @Override
  public String toString() {
    return "[preco=" + preco + ", nome=" + nome + "]";
  }

  

}

  
