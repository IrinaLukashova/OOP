import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new HotDrinks("tea", 170, 150, 90));
        productList.add(new HotDrinks("tea", 250, 300, 90));
        productList.add(new HotDrinks("coffee", 200, 150,80));
        productList.add(new HotDrinks("coffee", 320, 300,80));
        productList.add(new HotDrinks("gleantwein", 250, 200, 90));
        productList.add(new HotDrinks("cappucino", 250, 150, 75));


        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("tea", 150,90));
    }
}
