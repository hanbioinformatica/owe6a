import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashDemo {

    private static HashMap<String, ArrayList<String>> hm;

    public static void main(String[] args) {
        hm = new HashMap<>(10);
        hm.put("Rick",new ArrayList<String>());
        hm.get("Rick").add("Life Science");
        hm.get("Rick").add("Chemie");
        System.out.println(hm.get("Rick"));

        hm.put("Matthias",new ArrayList<String>(Arrays.asList("Life Science","Informatica Praktijk","Tutor")));
        System.out.println(hm.get("Matthias"));


    }

}
