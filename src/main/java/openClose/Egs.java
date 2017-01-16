package openClose;

/**
 * Created by luis on 7/01/17.
 */
public class Egs extends Product {

    final static int price=4;
    final static String product="EGS";
    int quantity;

    public Egs(int quantity) {
        this.quantity = quantity;
    }

    double getTotal() {
        return quantity*price;
    }

    public String getProduct() {return product;}
}
