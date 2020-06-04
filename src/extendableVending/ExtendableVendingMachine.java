package extendableVending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class ExtendableVendingMachine extends Product {
    public void buy(Product product){
        Object softDrink = new SoftDrink();
        if (softDrink instanceof Product) {
            System.out.println("SoftDrink has been bought");
        }else {
            System.out.println("No softDrink has been bought");
        }

        Object saltySnack = new SaltySnack();
        if (saltySnack instanceof Product){
            System.out.println("SaltySnack has been bought");
        }else {
            System.out.println("No saltySnack has been bought");
        }

        Object chocolate = new Chocolate();
        if (chocolate instanceof Product) {
            System.out.println("Chocolate has been bought");
        }else{
            System.out.println("No chocolate has been bought");
        }

    }
}
