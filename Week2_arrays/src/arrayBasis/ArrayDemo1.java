package arrayBasis;

import java.util.ArrayList;

public class ArrayDemo1 {

    static int[][] s_array = new int[10][10];
    static String[] s = new String[10];
    static String[] x = {"Apen","Noten","Miezen"};

    public static void main(String[] args) {
        s_array[7][7]=9;
        System.out.println(s_array[0][0]);
        System.out.println(s_array[7][7]);
        s[0] = "Hello";
        System.out.println(x[2]);

        ArrayList<String> a;
        a = new ArrayList<>();
        a.add(new String("Hello"));
        a.add("Hellao");
        a.add("zeven");
        for (String x:a){
            System.out.println(x);
        }




    }


}
