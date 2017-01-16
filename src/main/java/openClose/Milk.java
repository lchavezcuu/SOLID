package openClose;

/**
 * Created by luis on 7/01/17.
 */
public class Milk extends Product {

    final static int price=3;
    final static String product="MILK";
    int quantity;

    public Milk(int quantity) {
        this.quantity = quantity;
    }

    double getTotal() {
        return quantity*price;
    }

    public String getProduct() {return product;}
}
