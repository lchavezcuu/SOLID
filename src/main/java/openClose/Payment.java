package openClose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis on 7/01/17.
 */
public class Payment {

    /*We could have some if statements to determinate which is the product,this is against the OCP
    due each time that we need to create a new product it should be added as a new condition.
    Instead we use an Abstract class/ Interface as a param to be able to add n products without
    touch the code of this class.*/
    public static void CalculatePayment(List<Product> myProducts){
        for (Product product:myProducts) {
            System.out.println("The total for your "+ product.getProduct() + " is: " + product.getTotal());
        }
    }

    public static void main(String [] args){
        List <Product> someProducts=new ArrayList<Product>();
        someProducts.add(new Milk(3));
        someProducts.add(new Egs(5));
        someProducts.add(new Meal(7));

        CalculatePayment(someProducts);
    }
}
