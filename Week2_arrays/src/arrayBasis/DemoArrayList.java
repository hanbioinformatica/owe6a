package arrayBasis;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList {

    public static void main(String[] args) {
        ArrayList<String> a_list = new ArrayList<String>();
        a_list.add("Hello");
        a_list.add("World");
        a_list.add("Apen");
        a_list.add("Noten");
        a_list.add("Miezen");
        a_list.add("LiveDemoos/demo2022/Pizza");

        System.out.println(a_list);

        Collections.sort(a_list);
        System.out.println(a_list);
        Collections.shuffle(a_list);
        System.out.println(a_list);
        Collections.shuffle(a_list);
        System.out.println(a_list);
        Collections.shuffle(a_list);
        System.out.println(a_list);
        System.out.println(Collections.max(a_list));





    }

}
