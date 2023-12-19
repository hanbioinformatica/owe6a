package LinkedList;

import java.util.*;

/**
 * @author Martijn van der Bruggen
 * @version 22 november 2023
 * (c) HAN University
 * Academie Toegepaste Biowetenschappen en Chemie
 * Bio-informatica
 */

class DemoArray {

    // Generieke lijst, kan zowel ArrayList als LinkedList worden
    private static List<Integer> lijst;
    // Random om willekeurige getallen te genereren
    private static Random rand;
    // Aantal elementen voor de lijst die wordt gemaakt
    private static int aantalElementen = (int) Math.pow(10,6);
    private static long startTime, endTime;

    public static void main(String[] args) {
        lijst = new LinkedList<>();

        System.out.println("Maken en lezen van een array met een lengte van "+aantalElementen+" Integers");

        // Toevoegen van elementen aan een lijst
        startTimer();
        addElements();
        System.out.println("Tijd voor het maken van een Array "+getTime()+" seconden");


        // Uitlezen van alle elementen in volgorde
        startTimer();
        getElements();
        System.out.println("Tijd voor het lezen van een Array "+getTime()+" seconden");


    }

    /**
     * Toevoegen van elementen aan de Array, achteraan of vooraan
     */
    public static void addElements() {
        rand = new Random(1000);
        for (int i = 0; i < aantalElementen; i++) {
            lijst.add(rand.nextInt(100));
        }
    }

    /**
     * Ophalen van elementen in volgorde of omgekeerde volgorde
     */
    private static void getElements(){
        for (int i=lijst.size()-1;i>0;i--) {
            int x = lijst.get(i);
        }
    }

    /**
     * Methode om starttijd vast te leggen
     */
    private static void startTimer(){
        startTime = System.nanoTime();
    }

    /**
     * Methode die op basis van de starttijd de tijdsduur in seconden teruggeeft
     * @return double Tijd in seconden
     */
    private static double getTime(){
        endTime = System.nanoTime();
        long tijd = endTime - startTime;
        return  (double) tijd / 1e9;
    }

}
