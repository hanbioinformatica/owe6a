package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo2 {

    static LinkedHashMap<String, Object> hm = new LinkedHashMap<>();

    public static void main(String[] args) {
        hm.put("Bart", "06-8432873");
        hm.put("Johannes", new Auto());
        System.out.println(hm.get("Bart"));
        System.out.println(hm.get("Johannes"));
    }
}

class Auto {
    public String toString() {
        return "Dit is een auto";
    }
}
