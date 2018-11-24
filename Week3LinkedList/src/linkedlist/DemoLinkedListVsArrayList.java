package linkedlist;

import java.util.*;
import java.lang.*;
import java.io.*;

class DemoLinkedListVsArrayList {

    static List<Integer> lijst;
    static Random rand;

    public static void addElements(List l, int a) {
        rand = new Random(1000);
        int aantal = 1000;

        for (int i = 0; i < aantal; i++) {
            lijst.add(0, rand.nextInt(100));
        }
    }

    public static void main(String[] args) {
        lijst = new ArrayList<Integer>();
        long startTime = System.nanoTime();
        addElements(lijst, 1000000000);
        long endTime = System.nanoTime();
        long tijd1 = endTime - startTime;
        System.out.println("Tijd ArrayList: " + (double) tijd1 / 1000000000 + " seconden");
        lijst = new LinkedList<Integer>();
        startTime = System.nanoTime();
        addElements(lijst, 1000000000);
        endTime = System.nanoTime();
        long tijd2 = endTime - startTime;
        System.out.println("Tijd LinkedList: " + (double) tijd2 / 1000000000 + " seconden");
        System.out.println((float)tijd1/(float)tijd2);
        

    }
}
