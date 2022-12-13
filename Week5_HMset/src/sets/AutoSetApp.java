/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;

import java.util.HashSet;

/**
 *
 * @author bgnmh
 */
public class AutoSetApp {

    static HashSet<Auto> autoos1, autoos2, doorsnede, verschil;

    public static void main(String[] args) {
        autoos1 = new HashSet<Auto>();
        autoos1.add(new Auto("Ruben","geel","Fiat", 1970 ));
        autoos1.add(new Auto("Rick","rood","Opel", 2010 ));
        autoos1.add(new Auto("Martijn","groen","Fiat", 2012 ));

        autoos2 = new HashSet<Auto>();
        autoos2.add(new Auto("Matthias","groen","Fiat", 2010 ));

        verschil = new HashSet<Auto>(autoos1);
        verschil.removeAll(autoos2);
        System.out.println("verschil "+verschil);

        doorsnede = new HashSet<Auto>(autoos1);
        doorsnede.retainAll(autoos2);
        System.out.println("overlap "+doorsnede);
    }
}
