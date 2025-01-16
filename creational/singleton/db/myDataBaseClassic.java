package creational.singleton.db;

import java.util.ArrayList;
import java.util.List;

public class myDataBaseClassic {

  private static myDataBaseClassic instance = null;
    private final List<User> users;

    // Construtor privado para evitar instanciação
    private myDataBaseClassic() {
        users = new ArrayList<>();
    }

    // Método para obter a única instância (Singleton)
    public static myDataBaseClassic getInstance() {
        if (instance == null) {
            instance = new myDataBaseClassic();
        }
        return instance;
    }

    // Adicionar usuário
    public void add(User user) {
        users.add(user);
    }

    // Remover usuário por índice
    public void remove(int index) {
        if (index >= 0 && index < users.size()) {
            users.remove(index);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Mostrar usuários
    public void show() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}

// Implementação da interface User
class UserImpl implements User {
    private final String name;
    private final int age;

    public UserImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}