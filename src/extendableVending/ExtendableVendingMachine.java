package extendableVending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class ExtendableVendingMachine extends Product {
    private int softDink;
    private int saltSnack;
    private int chocolate;
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
    public ExtendableVendingMachine(int softDrinkLvl, int saltySnackLvl, int chocolateLvl){
        softDink = softDrinkLvl;
        saltSnack = saltySnackLvl;
        chocolate = chocolateLvl;
    }
    public void addStock(Product product){
        softDink += 3;
        saltSnack += 3;
        chocolate += 3;
    }
    public int getStock(Product product){
        return softDink + saltSnack + chocolate;
    }

    public static void main(String[] args) {
        ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(3,3,3);
        vendingMachine.addStock(new SoftDrink());
        vendingMachine.addStock(new SoftDrink());
        vendingMachine.addStock(new SoftDrink());
        vendingMachine.addStock(new Product());
        int totalStockLevel = vendingMachine.getStock(new Product());
        System.out.println(vendingMachine.getStock(new SoftDrink()));
        System.out.println(vendingMachine.getStock(new SaltySnack()));
        System.out.println(vendingMachine.getStock(new Chocolate()));
    }
}
