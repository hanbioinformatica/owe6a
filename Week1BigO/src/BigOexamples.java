/**
 * Martijn van der Bruggen
 * 7 november 2022
 * Uitwerking voorbeelden van lineair search en binary search
 */

import java.util.ArrayList;
import java.util.Random;

public class BigOexamples {

    // arrayList met willekeurige ints
    private static ArrayList<Integer> al = new ArrayList<>();
    // Grootte van de array met willekeurige getallen
    private static int n = ((int) Math.pow(10, 8));
    // Random object om willekeurige ints te genereren
    private static Random r = new Random();

    public static void createLargeArray() {
        for (int i = 0; i < n; i++) {
            al.add(r.nextInt(n));
        }
    }

    /**
     * LineairZoeken lineair door een ArrayList zoeken naar een int
     * @param getal de int die je zoekt in de ArrayList
     * @return de positie (int) waarop het getal is gevonden
     */
    public static int lineairZoeken(int getal) {
        int index = 0;
        while (index < n) {
            if (al.get(index)==getal)
                return index;
            else
                index++;
        }
        return -1;
    }  // lineairzoeken

    /**
     * binairZoeken vereist dat de ArrayList gesorteerd is
     * @param grootte de grootte van de ArrayList
     * @param getal de int die je zoekt in de ArrayList
     * @return de positie (int) waarop het getal is gevonden
     */
    public static int binairZoeken(int grootte, int getal) {
        int links = 0, rechts = grootte , midden = 0;
        while (links <= rechts) {
            midden = (links + rechts) / 2;
            if (al.get(midden)==getal)
                return midden;
            else if (getal > al.get(midden))
                links = midden + 1;
            else
                rechts = midden - 1;
        }  
        return -1;
    }  // binairzoeken

    public static void main(String[] args) {
        long startTime, endTime;
        int willekeurigGetal = r.nextInt(n); // willekeurig getal
        // init van een array met willekeurige getallen
        System.out.println("Init van een array met "+n+" willekeurige ints");
        createLargeArray();

        System.out.println("Sorteren van de array");
        //Sorteren om een binary search mogelijk te maken
        al.sort(null);

        System.out.println("Lineair zoeken naar "+willekeurigGetal);
        // linear search
        startTime = System.nanoTime();
        lineairZoeken(willekeurigGetal);
        endTime = System.nanoTime();
        long tijdLineairZoeken = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Tijd in microseconden: "+(tijdLineairZoeken / 1000)) ;

        System.out.println("Binair zoeken naar "+willekeurigGetal);
        // binary search
        startTime = System.nanoTime();
        binairZoeken(n, willekeurigGetal);
        endTime = System.nanoTime();
        long tijdBinairZoeken = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Tijd in microseconden: "+(tijdBinairZoeken / 1000));
        System.out.println("Binair zoeken is "+(tijdLineairZoeken/tijdBinairZoeken)+" keer sneller");
    }
}
