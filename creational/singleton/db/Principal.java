package creational.singleton.db;

public class Principal {
  public static void main(String[] args) {
    myDataBaseClassic dataBase1 = myDataBaseClassic.getInstance();
    User usuario1 = new UserImpl("Franco", 21);
    User usuario2 = new UserImpl("Greco", 14);

    dataBase1.add(usuario1);

    dataBase1.show();


        // Obtém a mesma instância do banco de dados
    myDataBaseClassic dataBase2 = myDataBaseClassic.getInstance();

    // adiciona mais um usuario

    dataBase2.add(usuario2);

      // Mostra novamente, refletindo os usuários de ambas as referências
      System.out.println("-----------------------------------------------"); // linha para dividir
      dataBase1.show();

           // Verifica se as instâncias são iguais
        System.out.println("database1 == database2: " + (dataBase1 == dataBase2));
    }


  }

