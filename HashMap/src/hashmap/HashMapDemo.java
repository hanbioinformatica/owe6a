/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

/**
 *
 * @author martijn
 */
import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>(10);
        hm.put("Milo", "06-873287234");
        hm.put("Mark", "06-218734");
        hm.put("Tijs", "98341243");
        hm.put("David", "06-432798243");

        //System.out.println(hm.get("Tijs"));
        Random r = new Random();
        for (int i = 0; i < 1000000; i++) {
            hm.put(Integer.toString(r.nextInt()), Integer.toString(r.nextInt()));
        }
        System.out.println(hm.size());
        
    }

}
