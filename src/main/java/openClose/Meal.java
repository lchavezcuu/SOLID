package openClose;

/**
 * Created by luis on 7/01/17.
 */
public class Meal extends Product {

    final static int price=5;
    final static String product="MEAL";
    int quantity;

    public Meal(int quantity) {
        this.quantity = quantity;
    }

    double getTotal() {
        return quantity*price;
    }

    public String getProduct() {return product;}
}
