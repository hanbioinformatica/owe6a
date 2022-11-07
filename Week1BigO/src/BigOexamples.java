import java.util.ArrayList;
import java.util.Random;

public class BigOexamples {

    private static ArrayList<Integer> al = new ArrayList<>();

    public static void createLargeArray(){
        Random r = new Random();
        for (int i=0;i<((int)Math.pow(10,9));i++) {
            al.add(r.nextInt(1000));
        }
    }



    public static void main(String[] args) {


    }
}
