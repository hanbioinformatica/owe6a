package HashMap;

import java.util.HashMap;
import java.util.*;

public class DemoHashMap {

    static Map<String, String> hm;

    public static void main(String[] args) {
        hm = new TreeMap();
        hm.put("Eva","BIN2c");
        hm.put("Tosca","BIN2a");
        hm.put("Eva", "BIN-2d");

        Object o = new Object();
        //System.out.println(o.hashCode());
        for (String element:hm.keySet()){
            System.out.println(element);
        }




    }

}
