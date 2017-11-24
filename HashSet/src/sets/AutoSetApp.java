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

    static HashSet<Auto> autoos1, autoos2, autoos3, autoos4;

    public static void main(String[] args) {
        autoos1 = new HashSet<Auto>();
        autoos1.add(new Auto("Julian", "blauw", 5000));
        autoos1.add(new Auto("Valerie", "blauw", 5));
        autoos1.add(new Auto("Sjors", "groen", 420));
        autoos1.add(new Auto("Merijn", "geel", 5));

        autoos2 = new HashSet<Auto>();
        autoos2.add(new Auto("Anne", "Turquoise", 350));
        autoos2.add(new Auto("Ruben", "zwart", 100));
        autoos2.add(new Auto("Sjors", "groen", 420));
        autoos2.add(new Auto("Merijn", "geel", 5));

        System.out.println(autoos1);
        System.out.println(autoos2);

        HashSet verschil1 = new HashSet<Auto>(autoos1);
        verschil1.removeAll(autoos2);

        System.out.println(verschil1);

        HashSet overeenkomst = new HashSet<Auto>(autoos1);
        overeenkomst.retainAll(autoos2);
        System.out.println("Overeenkomst");
        System.out.println(overeenkomst);
    }
}
