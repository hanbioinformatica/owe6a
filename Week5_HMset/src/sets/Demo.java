package sets;

public class Demo {

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.hashCode());
        Object o2 = new Object();
        System.out.print(o2.hashCode());
        System.out.println(o==o2);
    }

}
