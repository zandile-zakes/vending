package vending;
import vending.product.SoftDrink;
import vending.product.SaltySnack;
import vending.product.Chocolate;
import vending.product.Product;
public class OverloadedVendingMachine {
    void buy(SoftDrink softdrink){
        System.out.println("Buy softdrink");
    }
    void buy(SaltySnack saltySnack){
        System.out.println("Buy saltySnack");
    }
    void buy(Chocolate chocolate){
        System.out.println("Buy chocolate");
    }
    void buy(Product product){
        System.out.println("Buy product");
    }
    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){

    }
}
