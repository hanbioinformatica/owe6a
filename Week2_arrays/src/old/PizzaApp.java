package old;

import java.util.*;

public class PizzaApp {

    private static List<Product> aProduct;

    public static void main(String[] args) {
        aProduct = new ArrayList<>();
        Product p1 = new Pizza(9.80, 25, "Funghi");
        Pizza p2 = new Pizza(6.80, 12, "Tonno");
        aProduct.add(p1);
        aProduct.add(p2);
        aProduct.add(new Schotel(8.77,"Shoarma schotel"));
        aProduct.add(new Pizza(7.99,8,"Mozarella"));
        aProduct.add(new Pizza(15.99,20,"Calzone"));
        System.out.println(aProduct);
        Collections.sort(aProduct);
        System.out.println(aProduct);
        System.out.println(Collections.max(aProduct));
            }


}


