package vlinders;

import Vervoersmiddelen.Auto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class VlinderSortering {

    public static void main(String[] args) {
        LinkedList<Vlinder> v_arr = new LinkedList<>();
        v_arr.add(new Vlinder("rood",20,0.40f));
        v_arr.add(new Vlinder("blauw",10,0.22f));
        v_arr.add(new Vlinder("rood-zwart",30,0.22f));
        v_arr.add(new Vlinder("rood-zwart-groen",5,0.33f));
        v_arr.add(new Vlinder("oranje",7,0.60f));
        System.out.println("Ongesorteerde array");
        System.out.println(v_arr);
        Collections.sort(v_arr);
        System.out.println("Gesorteerde array");
        System.out.print(v_arr);

        Collections.sort(v_arr, Comparator.comparing(Vlinder::getGewicht));
        System.out.println(v_arr);

    }

}


class Vlinder implements Comparable {

    String kleur;

    @Override
    public String toString() {
        return "Vlinder{" +
                "kleur='" + kleur + '\'' +
                ", vleugelGrootte=" + vleugelGrootte +
                ", gewicht=" + gewicht +
                '}';
    }

    public String getKleur() {
        return kleur;
    }

    public Vlinder(String kleur, int vleugelGrootte, float gewicht) {
        this.kleur = kleur;
        this.vleugelGrootte = vleugelGrootte;
        this.gewicht = gewicht;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public int getVleugelGrootte() {
        return vleugelGrootte;
    }

    public void setVleugelGrootte(int vleugelGrootte) {
        this.vleugelGrootte = vleugelGrootte;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }

    int vleugelGrootte;
    float gewicht;


    @Override
    public int compareTo(Object o) {
        Vlinder v= (Vlinder)o;
        if (this.gewicht<v.gewicht) return -1;
        if (this.gewicht>v.gewicht) return +1;
        return 0;
    }
}