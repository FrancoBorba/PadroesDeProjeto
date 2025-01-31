package behavioural.strategy;
import java.util.ArrayList;
import java.util.List;

public class ECommerceShoppingCart {
    private final List<InterfaceEcommerce> products = new ArrayList<>();
    private DiscountStrategy discountStrategy = new DiscountStrategy();

    public void addProduct(InterfaceEcommerce... products) {
        for (InterfaceEcommerce product : products) {
            this.products.add(product);
        }
    }

    public List<InterfaceEcommerce> getProducts() {
        return new ArrayList<>(products);
    }

    public double getTotal() {
        return products.stream().mapToDouble(InterfaceEcommerce::getPrice).sum();
    }

    public double getTotalWithDiscount() {
        return discountStrategy.getDiscount(this);
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discountStrategy = discount;
    }
}
