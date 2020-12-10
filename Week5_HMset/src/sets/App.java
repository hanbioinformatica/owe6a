package sets;

import java.util.HashSet;

public class App {

    public static void main(String[] args) {
        HashSet<Auto> h1 = new HashSet();
        HashSet<Auto> h2 = new HashSet();

        h1.add(new Auto("Robert","blauw","BMW",1970));
        h1.add(new Auto("Han","geel","Chiquita",1970));
        h1.add(new Auto("Harm","kastanje bruin","Ferari",1980));

        h2.add(new Auto("Han","geel","Chiquita",1980));
        h2.add(new Auto("Yaris","blauw","Toyota",2000));

        System.out.println(h1);
        System.out.println(h2);
        h1.retainAll(h2);
        System.out.println(h1);

    }
}
