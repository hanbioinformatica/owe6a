package hashmap;

/**
 *
 * @author martijn
 */
import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> hm = new LinkedHashMap<String, String>(10);
        hm.put("Lex", "06-873287234");
        hm.put("Stephan", "06-218734");
        hm.put("Teun", "98341243");
        hm.put("Cas", "06-432798243");

        System.out.println(hm.get("Teun"));
        for (String element:hm.keySet()){
            System.out.println(element);
            
        }
    
        
        
        
    }

}
