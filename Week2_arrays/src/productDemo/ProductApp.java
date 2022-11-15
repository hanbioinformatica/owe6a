package productDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ProductApp {

    public static void main(String[] args) {
        ArrayList<Product> pr_list = new ArrayList<>();
        pr_list.add(new Product("Pizza",9.95f,2022));
        pr_list.add(new Product("Auto",9095.99f,2020));
        pr_list.add(new Product("Konijn",20.20f,2019));
        pr_list.add(new Product("Laptop",199.95f,2017));
        pr_list.add(new Product("Stoel",29.95f,2023));

        System.out.println(pr_list);
        Collections.sort(pr_list);
        System.out.println(pr_list);
        Collections.shuffle(pr_list);
        System.out.println(pr_list);



    }

}
