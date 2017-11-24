package sorting;


import sorting.Auto;
import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayMain {
    
    public static void main(String[] args) {
        
        ArrayList<Auto> arr = new ArrayList<Auto>();
 
        
        
        
        Collections.sort(arr);
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);
        System.out.println("Dit is de krachtigste auto");
        System.out.println(Collections.max(arr));
        for (Object z:arr){
            System.out.println(((Auto)z).getEigenaar());
        }
        
       
    }
    
}
