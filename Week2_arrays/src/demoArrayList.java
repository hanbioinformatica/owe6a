import java.util.ArrayList;

public class demoArrayList {
    public static void main(String[] args) {
        ArrayList arrl = new ArrayList<String>();
        arrl.add("Hello");
        arrl.add("World");
        arrl.add("Apen");
        System.out.println(arrl);
        arrl.add(2,"Miezen");
        System.out.println(arrl);
        arrl.sort(null);
        System.out.println(arrl);

        ArrayList int_arr = new ArrayList<Integer>();
        int_arr.add(1);
        int x = (int) int_arr.get(0);



    }
}
