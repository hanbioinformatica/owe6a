package linkedlist;

import java.util.*;

/**
 * @author Martijn van der Bruggen
 * @version 25 november 2018
 * (c) HAN University 
 * Instituut Toegepaste Biologie en Chemie
 * Bio-informatica
 * 
 */

class DemoLinkedListVsArrayList {

    static List<Integer> lijst;
    static Random rand;

    public static void addElements(List l, int a) {
        rand = new Random(1000);
        for (int i = 0; i < a; i++) {
            lijst.add(0, rand.nextInt(100));
        }
      }

    
    private static void timeAdding(){
        int aantalKeer = 10^10;
        lijst = new ArrayList<Integer>();
        long startTime = System.nanoTime();
        addElements(lijst, aantalKeer);
        long endTime = System.nanoTime();
        long tijd1 = endTime - startTime;
        System.out.println("Tijd ArrayList: " + (double) tijd1 / 1000000000 + " seconden");
        lijst = new LinkedList<Integer>();
        startTime = System.nanoTime();
        addElements(lijst, aantalKeer);
        endTime = System.nanoTime();
        long tijd2 = endTime - startTime;
        System.out.println("Tijd LinkedList: " + (double) tijd2 / 1000000000 + " seconden");
        System.out.println("LinkedList is "+(float)tijd1/(float)tijd2+" keer sneller");
    }
    
    
    
    public static void main(String[] args) {
        timeAdding();  
    }
}
