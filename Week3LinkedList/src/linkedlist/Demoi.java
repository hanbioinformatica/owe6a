package linkedlist;
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Demoi {

    static List<Integer> lijst;
    static Random rand;

    public static void main(String[] args) {
        
        //lijst = new LinkedList<Integer>();
        lijst = new ArrayList<Integer>();

        rand = new Random(1000);
        int aantal = 10000000;
        
        long startTime = System.nanoTime();
        for (int i = 0; i < aantal; i++) {
            lijst.add(0,rand.nextInt(100));
        }
        long endTime = System.nanoTime();
        final long tijd1 = endTime - startTime;
        System.out.println("Tijd: " + (float)tijd1/1000000000+" seconden");


    }
}
