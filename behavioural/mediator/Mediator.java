package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;


public class Mediator {
    private List<Seller> sellers = new ArrayList<>();

    public void addSeller(Seller... sellers) {
        for (Seller seller : sellers) {
            this.sellers.add(seller);
            seller.setMediator(this);
        }
    }

    public ProductSeller buy(String id) {
        for (Seller seller : sellers) {
            ProductSeller product = seller.sell(id);
            if (product != null) {
                System.out.println("Aqui está " + product.getId() + " " + product.getName() + " " + product.getPreco());
                return product;
            }
        }
        System.out.println("Não encontrei nenhum produto com id " + id);
        return null;
    }

    public void showProducts() {
        for (Seller seller : sellers) {
            seller.showProducts();
        }
    }
}

