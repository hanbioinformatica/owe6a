package arrayBasis;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArray2 {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("Apen");
        a1.add("Noten");
        a1.add("Hello");
        a1.add("Miezen");
        a1.add(2,"Hello World!");
        a1.add("A");
        a1.add("World");
        a1.add("E");
        System.out.println(a1);
        a1.sort(null);
        System.out.println(a1);
        Collections.shuffle(a1);
        System.out.println(a1);
        a1.set(2,"45iyihrwkhrew");


    }
}
