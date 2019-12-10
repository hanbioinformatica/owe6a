package HashMap;

import java.util.*;

public class MaandenMetDagen {

    public static void main(String args[]) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        // Vul de map
        map.put("januari", 31);
        map.put("februari", 28);
        map.put("maart", 31);
        map.put("april", 30);
        map.put("mei", 31);
        map.put("juni", 30);
        map.put("juli", 31);
        map.put("augustus", 31);
        map.put("september", 30);
        map.put("oktober", 31);
        map.put("november", 30);
        map.put("december", 31);

        System.out.print("feb heeft ");
        int value = map.get("februari");
        System.out.println(value + " dagen\n");
        map.put("februari", 29);

        System.out.print("feb heeft ");
        value = map.get("februari");

        System.out.println(value + " dagen\n");

        // Itereren over KeySet bij een HashMap    
        for (String element : map.keySet()) {
            System.out.println(element);
        }
        
        // Itereren over Key en Values bij een HashMap    
        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" met waarde "+entry.getValue());
        }

    }
}
