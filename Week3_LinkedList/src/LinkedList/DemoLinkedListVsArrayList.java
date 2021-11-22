package LinkedList;

import java.util.*;

/**
 * @author Martijn van der Bruggen
 * @version 25 november 2020
 * 20 november 2021 added getter method to measure get speed
 * (c) HAN University
 * Instituut Toegepaste Biologie en Chemie
 * Bio-informatica
 *
 */

class DemoLinkedListVsArrayList {

    static List<Integer> lijst = new ArrayList<>();
    static Random rand;

    public static void addElements(List l, int a) {
        rand = new Random(1000);
        for (int i = 0; i < a; i++) {
            lijst.add(99, rand.nextInt(100));
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

    private static void timeGetting(){
        System.out.println("Ophalen van data uit ArrayList vs. LinkedList");
        int aantalKeer = 10^10;
        lijst = new ArrayList<Integer>();
        addElements(lijst, aantalKeer);
        long startTime = System.nanoTime();
        for (Integer getal : lijst) {
                int x = getal;
        }
        long endTime = System.nanoTime();
        long tijd1 = endTime - startTime;
        System.out.println("Tijd ArrayList: " + (double) tijd1 / 1000000000 + " seconden");
        lijst = new LinkedList<Integer>();
        addElements(lijst, aantalKeer);
        startTime = System.nanoTime();
        for (Integer getal : lijst) {
            int x = getal;
        }
        endTime = System.nanoTime();
        long tijd2 = endTime - startTime;
        System.out.println("Tijd LinkedList: " + (double) tijd2 / 1000000000 + " seconden");
        System.out.println("ArrayList is "+(float)tijd2/(float)tijd1+" keer sneller");
    }


    public static void main(String[] args) {
        timeAdding();
        //timeGetting();
    }


    public static double tijdVoorToevoegen(int aantal){
        lijst = new LinkedList<Integer>();
        long startTime = System.nanoTime();
        addElements(lijst, aantal);
        long endTime = System.nanoTime();
        long tijd1 = endTime - startTime;
        System.out.println("LinkedList"+aantal+" Tijd:" + (double) tijd1 / 1000000000 + " seconden");
        return (double) tijd1 / 1000000000; //Tijd in seconden
    }
}
