package sets;

import java.util.HashSet;

public class App {

    public static void main(String[] args) {
        HashSet<Auto> h1 = new HashSet();
        HashSet<Auto> h2 = new HashSet();
        h1.add(new Auto("Tosca","Paars","Peugeot",2014));
        h1.add(new Auto("Jara","Blauw","Volvo",2016));
        h1.add(new Auto("Eva","Rood","Ferrari",2019));
        h2.add(new Auto("Dariush","Paars","Peugeot",2014));
        h2.add(new Auto("Stef","Grijs", "Opel",2003));


        System.out.println(h2);
        h1.retainAll(h2);
        System.out.println(h1);

    }
}
