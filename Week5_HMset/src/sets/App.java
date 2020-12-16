package sets;

import java.util.HashSet;

public class App {

    public static void main(String[] args) {
        HashSet<Auto> h1 = new HashSet();
        HashSet<Auto> h2 = new HashSet();


        System.out.println(h1);
        System.out.println(h2);
        h1.retainAll(h2);
        System.out.println(h1);

    }
}
