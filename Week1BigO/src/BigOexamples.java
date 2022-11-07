/**
 * Martijn van der Bruggen
 * 7 november 2022
 * Uitwerking voorbeelden van linear search en binary search
 */

import java.util.ArrayList;
import java.util.Random;

public class BigOexamples {

    // arrayList met willekeurige ints
    private static ArrayList<Integer> al = new ArrayList<>();
    // Grootte van de array met willekeurige getallen
    private static int n = ((int) Math.pow(10, 7));
    // Random object om willekeurige ints te genereren
    private static Random r = new Random();

    public static void createLargeArray() {
        for (int i = 0; i < n; i++) {
            al.add(r.nextInt(n));
        }
    }

    public static int lineairzoeken(int getal) {
        int index = 0;
        boolean gevonden = false;
        while (!gevonden && index < n) {
            if (al.get(index)==getal)
                return index;
            else
                index++;
        }
        return -1;
    }  // lineairzoeken

    public static int binairzoeken(int rechts, int getal) {
        int links = 0, midden = 0;
        boolean gevonden = false;
        while (!gevonden && links <= rechts) {
            midden = (links + rechts) / 2;
            if (getal == al.get(midden))
                return midden;
            else if (getal > al.get(midden))
                links = midden + 1;
            else
                rechts = midden - 1;
        }  // while
        return -1;
    }  // binairzoeken

    public static void main(String[] args) {
        long startTime, endTime, duration;
        int willekeurigGetal = r.nextInt(n); // willekeurig getal
        // init van een array met willekeurige getallen
        System.out.println("Init van een array met "+n+" willekeurige ints");
        createLargeArray();

        System.out.println("Sorteren van de array");
        //Sorteren om een binary search mogelijk te maken
        al.sort(null);

        System.out.println("Lineair zoeken naar een willekeurig getal "+willekeurigGetal);
        // linear search
        startTime = System.nanoTime();
        lineairzoeken(willekeurigGetal);
        endTime = System.nanoTime();
        duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println(duration / 1000);

        System.out.println("Binair zoeken naar een willekeurig getal "+willekeurigGetal);
        // binary search
        startTime = System.nanoTime();
        binairzoeken(n, willekeurigGetal);
        endTime = System.nanoTime();
        duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println(duration / 1000);

    }
}
