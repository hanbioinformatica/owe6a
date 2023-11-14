package LiveDemoos.demo2022.Pizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PizzaAppModernSort {

    private static List<Pizza> aProduct;

    public static void main(String[] args) {
        aProduct = new ArrayList<Pizza>();
        Pizza p1 = new Pizza(9.80, 25, "Funghi");
        Pizza p2 = new Pizza(6.80, 12, "Tonno");
        aProduct.add(p1);
        aProduct.add(p2);
        aProduct.add(new Pizza(7.99, 8, "Mozarella"));
        aProduct.add(new Pizza(15.99, 20, "Calzone"));
        aProduct.add(new Pizza(5.99, 17, "Quatro"));
        System.out.println(aProduct);

        Collections.sort(aProduct,Comparator.comparing(Pizza::getPrijs));

        System.out.println(aProduct);


    }


}


