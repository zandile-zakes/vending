package extendableVending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class ExtendableVendingMachine extends Product {
    private int softDinkQty;
    private int saltSnackQty;
    private int chocolateQty;
    public void buy(Product product){
        if (product instanceof SoftDrink){
            if (softDinkQty > 0){
                System.out.println("SoftDrink is available");
                softDinkQty--;
            }else {
                System.out.println("SoftDrink is not available");
            }
        }else if (product instanceof SaltySnack){
            if(saltSnackQty > 0){
                System.out.println("SaltySnack is available");
                saltSnackQty--;
            }else {
                System.out.println("SaltySnack is not available");
            }
        }else if (product instanceof  Chocolate){
            if (chocolateQty > 0){
                System.out.println("Chocolate is available");
            }else {
                System.out.println("Chocolate is no available");
            }
        }

    }
    public ExtendableVendingMachine(int softDrinkLvl, int saltySnackLvl, int chocolateLvl){
        softDinkQty = softDrinkLvl;
        saltSnackQty = saltySnackLvl;
        chocolateQty = chocolateLvl;
        System.out.println("This is my constructor");
    }
    public void addStock(Product product){
        if (softDinkQty < 0){
            System.out.println("Add softDrink");
            softDinkQty += 3;
        }else if (saltSnackQty < 0){
            System.out.println("Add saltySnack");
            saltSnackQty += 3;
        }else if (chocolateQty < 0){
            System.out.println("Add chocolate");
            chocolateQty += 3;
        }
    }
    public int getStock(Product product){
        return softDinkQty + saltSnackQty + chocolateQty;
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
