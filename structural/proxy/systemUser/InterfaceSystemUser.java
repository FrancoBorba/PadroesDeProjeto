package structural.proxy.systemUser;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface InterfaceSystemUser {
   String getFirstName();
    String getUserName();
    
    CompletableFuture<List<SystemUserAddress>> getAddresses();
}
