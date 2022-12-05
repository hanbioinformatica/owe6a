package HashMap;

import java.util.*;

public class DemoHashMap {


    private static Map<String, ArrayList<String>> hm;

    public static void main(String[] args) {
        hm = new HashMap<>(100);
        hm.put("Rick", new ArrayList<String>());
        hm.get("Rick").add("Life Science");
        hm.put("Matthias",new ArrayList<String>(Arrays.asList("Bio","Inf")));
        hm.put("Martijn", new ArrayList<>(hm.get("Matthias")));
        System.out.println(hm.get("Martijn"));
        hm.get("Martijn").add("Scheikunde");
        System.out.println(hm.get("Martijn"));
        System.out.println(hm.keySet());
    }
}
