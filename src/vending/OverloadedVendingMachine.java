package vending;
import vending.product.Product;
import vending.product.SoftDrink;
import vending.product.SaltySnack;
import vending.product.Chocolate;

public class OverloadedVendingMachine {
    private int softDrinkCount;
    private int saltySnackCount;
    private int chocolateCount;

    void buy(SoftDrink softDrink){
        System.out.println("Buy 1 softDrink");
        if (softDrinkCount > 0){
            softDrinkCount--;
        }else{
            System.out.println("Out of stock");
        }
    }
    void buy(SaltySnack saltySnack){
        System.out.println("Buy 1 saltySnack");
        if (saltySnackCount > 0){
            saltySnackCount--;
        }else {
            System.out.println("Out of stock");
        }
    }
    void buy(Chocolate chocolate){
        System.out.println("Buy 1 chocolate");
        if (chocolateCount > 0){
            chocolateCount--;
        }else {
            System.out.println("Out of stock");
        }
    }
    void buy(Product product){
        System.out.println("Buy 1 product");
        if (softDrinkCount < 0 && saltySnackCount < 0 && chocolateCount < 0){
            softDrinkCount = -1;
            saltySnackCount = -1;
            chocolateCount = -1;
        }
    }

    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        softDrinkCount= softDrinkQty;
        saltySnackCount = saltySnacksQty;
        chocolateCount = chocolatesQty;

    }
    public void addStock(SoftDrink softDrink){
        softDrinkCount += 1;
    }
    public void addStock(SaltySnack saltySnack){
        saltySnackCount += 1;
    }
    public void addStock(Chocolate chocolate){
        chocolateCount += 1;
    }
    public void addStock(Product product){
        softDrinkCount += 1;
        saltySnackCount += 1;
        chocolateCount += 1;
    }

    public int getStock(SoftDrink softDrink){
        return softDrinkCount;
    }
    public int getStock(SaltySnack saltySnack){
        return saltySnackCount;
    }
    public int getStock(Chocolate chocolate){
        return chocolateCount;
    }
    public int getStock(){
        return  softDrinkCount + saltySnackCount + chocolateCount;
    }

    public static void main(String[] args) {
        OverloadedVendingMachine vendingM = new OverloadedVendingMachine(4, 6,10);
        vendingM.addStock(new SaltySnack());
        vendingM.getStock(new SaltySnack());
        vendingM.buy(new SaltySnack());
        vendingM.buy(new SaltySnack());
        vendingM.buy(new SaltySnack());
        vendingM.buy(new Chocolate());
        System.out.println(vendingM.getStock(new SaltySnack()));
        System.out.println(vendingM.getStock(new Chocolate()));


    }
}
