package demo;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemo {




    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Wouter");
        al.add("Peter");
        //al.add(new Auto("Rutger"));
        al.add("Harm");
        al.add("Ruben");
        //al.add(new Auto("Han"));
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println("Reverse");
        System.out.println(al);
        Collections.shuffle(al);
        System.out.println("Shuffle");
        System.out.println(al);
        System.out.println(Collections.max(al));
        System.out.println(al);
        
    }

}
