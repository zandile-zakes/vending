package vending;
import vending.machine.SoftDrink;
import vending.machine.SaltySnack;
import vending.machine.Chocolate;
import vending.machine.Product;
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
}
