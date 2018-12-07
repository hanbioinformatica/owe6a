package hashmap;

/**
 *
 * @author martijn
 */
import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<String, String>(10);
        hm.put("Elco", "06-873287234");
        hm.put("Jung Ho", "06-218734");
        hm.put("Teun", "98341243");
        hm.put("Sanne", "06-432798243");

        
        Random r = new Random();
        for (int i = 0; i < 1000000; i++) {
            hm.put(Integer.toString(r.nextInt()), Integer.toString(r.nextInt()));
        }
        System.out.println(hm.size());
        
    }

}
