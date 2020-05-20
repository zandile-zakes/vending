package vending;
import product.Product;
import vending.product.SoftDrink;
import vending.product.SaltySnack;
import vending.product.Chocolate;

public class OverloadedVendingMachine {

    private int softDrink;
    private int saltySnack;
    private int chocolate;

    void buy(SoftDrink softDrink){
        System.out.println("Buy 1 softDrink");
    }
    void buy(SaltySnack saltySnack){
        System.out.println("Buy 1 saltySnack");
    }
    void buy(Chocolate chocolate){
        System.out.println("Buy 1 chocolate");
    }
    void buy(Product product){
        System.out.println("Buy 1 product");
    }
    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        softDrink = softDrinkQty;
        saltySnack = saltySnacksQty;
        chocolate = chocolatesQty;
    }
}
