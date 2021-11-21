package Vervoersmiddelen;

import java.util.ArrayList;
import java.util.Collections;

public class VoertuigApp {
    static ArrayList<Object> autolijst = new ArrayList<>();

    public static void main(String[] args) {
      autolijst.add(new Auto(2349,1987,"rood"));
      autolijst.add(new Auto(94334, 2003, "blauw"));
        autolijst.add(new Auto(4334, 2000, "geel"));
        autolijst.add(new Auto(349,1999,"groen"));
        autolijst.add(new Auto(9434, 1976, "turquoise"));
        autolijst.add(new Auto(434, 2009, "lichtblauw"));

        for (Auto auto:autolijst){
            System.out.println(auto);
        }
        Collections.sort(autolijst);
        System.out.println("Na sorteren");
        for (Auto auto:autolijst){
            System.out.println(auto);
        }



    }
}
