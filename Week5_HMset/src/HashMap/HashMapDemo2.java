package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo2 {

    static HashMap<String, Object> hm = new HashMap<>();

    public static void main(String[] args) {
        hm.put("Pieter", "06-8432873");
        hm.put("Dominic", new Auto());
        System.out.println(hm.get("Pieter"));
        System.out.println(hm.get("Dominic"));
    }
}

class Auto {
    public String toString() {
        return "Dit is een auto";
    }
}
