package arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author martijn
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList();
        alist.add("hello");
        alist.add("zee");
        alist.add("apen");
        alist.add("world!");
        alist.add("noten");
        alist.add("miezen");

        System.out.println(alist);
        Collections.sort(alist);
        System.out.println(alist);
        Collections.shuffle(alist);
        System.out.println(alist);
        Collections.shuffle(alist);
        System.out.println(alist);
        Collections.reverse(alist);
        System.out.println(alist);

    }

}
