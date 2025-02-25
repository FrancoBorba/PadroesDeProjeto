package behavioural.chainOfResponsability;

public class CustomerBudgte {
  private Boolean aprove = false;
  private Double price;

  public CustomerBudgte(Double price){
    this.price = price;
  }

  public Boolean getAprove() {
    return aprove;
  }

  public void setAprove(Boolean aprove) {
    this.aprove = aprove;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "CustomerBudgte [aprove=" + aprove + ", price=" + price + "]";
  }
}
