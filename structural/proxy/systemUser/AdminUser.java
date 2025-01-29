package structural.proxy.systemUser;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AdminUser implements InterfaceSystemUser {
    private String firstName;
    private String userName;

    public AdminUser(String firstName, String userName) {
        this.firstName = firstName;
        this.userName = userName;
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
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // Simula um atraso de 2 segundos (como setTimeout no TypeScript)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return Arrays.asList(
                new SystemUserAddress("Av. Brasil", 50),
                new SystemUserAddress("Rua A.", 40)
            );
        });
    }
}
