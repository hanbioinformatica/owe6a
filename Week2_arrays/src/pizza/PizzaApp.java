package pizza;

import java.util.ArrayList;
import java.util.Collections;

public class PizzaApp {

    private static ArrayList<Product> aProduct;

    public static void main(String[] args) {
        aProduct = new ArrayList<>();
        Pizza p1 = new Pizza(9.80, 25, "Funghi");
        Pizza p2 = new Pizza(6.80, 12, "Tonno");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Aantal Pizza's "+Pizza.getAantal());
        aProduct.add(p1);
        aProduct.add(p2);
        System.out.println(aProduct);
        aProduct.add(new Schotel(8.77,"Shoarma schotel"));
        aProduct.add(new Pizza(7.99,8,"Mozarella"));
        aProduct.add(new Pizza(15.99,20,"Calzone"));
        System.out.println(aProduct);
        Collections.sort(aProduct);
        System.out.println(aProduct);
//        System.out.println(Collections.max(aPizza));








    }


}


