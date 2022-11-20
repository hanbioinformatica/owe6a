import java.util.*;

/**
 * @author Martijn van der Bruggen
 * @version 20 november 2022
 * (c) HAN University
 * Academie Toegepaste Biologie en Chemie
 * Bio-informatica
 */

class DemoArray {

    static List<Integer> lijst;
    static Random rand;
    static int aantalElementen = (int) Math.pow(10,8);
    static long startTime, endTime;

    public static void main(String[] args) {
        lijst = new ArrayList<>(aantalElementen);
        startTimer();
        addElements();
        System.out.println("Tijd voor het maken van een Array "+getTime());
        System.out.println("Met een lengte van "+aantalElementen);
        getElements();
    }

    public static void addElements() {
        rand = new Random(1000);
        for (int i = 0; i < aantalElementen; i++) {
            lijst.add(0,rand.nextInt(100));
        }
    }

    private static void getElements(){
        for (Integer getal : lijst) {
            int x = getal;
        }
    }

    private static void startTimer(){
        startTime = System.nanoTime();
    }

    private static double getTime(){
        endTime = System.nanoTime();
        long tijd = endTime - startTime;
        return  (double) tijd / 1000000000;
    }

}
