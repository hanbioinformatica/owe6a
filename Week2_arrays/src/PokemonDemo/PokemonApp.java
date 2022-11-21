package PokemonDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class PokemonApp {

    public static void main(String[] args) {
        ArrayList<Pokemon> arrPok = new ArrayList<>();
        arrPok.add(new Pokemon("Pikachu",100,70,1));
        arrPok.add(new Pokemon("Ditto",17,90,4));
        arrPok.add(new Pokemon("Baltasur",190,1000,2));
        arrPok.add(new Pokemon("Sandstorm",10,7,100));
//        System.out.println(arrPok);
//        Collections.sort(arrPok);
//        System.out.println(arrPok);
//        Pokemon.sort_alg = 1;
//        Collections.sort(arrPok);
//        System.out.println(arrPok);

        // een alternatieve en moderne manier om op basis van een methode te sorteren
        //               ArrayList van Pokemon, Comparator.comparing(ObjectType Pokemon:: methode die een waaarde
        //                                                                  teruggeeft waarop vergeleken wordt
        Collections.sort(arrPok, Comparator.comparing(Pokemon::getLevel));
        System.out.println(arrPok);

    }

}


class Pokemon implements Comparable <Pokemon> {
    private String naam;
    private int kracht;
    private int snelheid;
    private int level;
    static int sort_alg = 0;

    public Pokemon(String naam, int kracht, int snelheid, int level) {
        this.naam = naam;
        this.kracht = kracht;
        this.snelheid = snelheid;
        this.level = level;
    }

    public int compareTo(Pokemon p){
        //Pokemon p = (Pokemon) o; // casten van een generiek object naar Pokemon object
        if (sort_alg==0) {
            if (this.naam.length() > p.getNaam().length()) {
                return +1;
            } else if (this.naam.length() == p.getNaam().length()) {
                return 0;
            } else return -1;
        }
        else
            if (sort_alg==1){
                if (this.kracht > p.getKracht()) {
                    return +1;
                } else if (this.kracht == p.getKracht()) {
                    return 0;
                } else return -1;
        } else return 0;
    }

    public String toString(){
        return naam+" snelheid:"+snelheid+" kracht: "+kracht+" level: "+level;
    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getKracht() {
        return kracht;
    }

    public void setKracht(int kracht) {
        this.kracht = kracht;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(int snelheid) {
        this.snelheid = snelheid;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


}