package demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Kim");
        arr.add("Dominic");
        arr.add("Luc");
        arr.add("Teun");
        arr.add("Nick");
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.reverse(arr);
        arr.add("Jasper");
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);
    }
}
