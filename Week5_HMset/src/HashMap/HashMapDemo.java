package HashMap;

/**
 *
 * @author martijn
 */
import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<String, String>(10);
        hm.put("Bas", "06-873287234");
        hm.put("Max", "06-218734");
        hm.put("David", "98341243");
        hm.put("Gabe", "06-432798243");

        System.out.println(hm.get("Teun"));
        for (String element:hm.keySet()){
            System.out.println(element);
            
        }
    
        
        
        
    }

}
