package structural.proxy.systemUser;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SystemUserProxy implements InterfaceSystemUser {
    private String firstName;
    private String userName;
    private AdminUser realUser = null;
    private List<SystemUserAddress> realUserAddresses = null;

    public SystemUserProxy(String firstName, String userName) {
        this.firstName = firstName;
        this.userName = userName;
    }

    private AdminUser createUser() {
        if (realUser == null) {
            realUser = new AdminUser(firstName, userName);
        }
        return realUser;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public CompletableFuture<List<SystemUserAddress>> getAddresses() {
        createUser(); // Garante que `realUser` seja inicializado

        if (realUserAddresses == null) {
            return realUser.getAddresses().thenApply(addresses -> {
                realUserAddresses = addresses; // Armazena os endereços para futuras chamadas
                return addresses;
            });
        }
        return CompletableFuture.completedFuture(realUserAddresses); // Retorna cache imediatamente
    }
}
