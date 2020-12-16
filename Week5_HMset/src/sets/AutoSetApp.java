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
        autoos1.add(new Auto("Martijn","groen","Fiat", 1970 ));
        Auto a2 = new Auto("Dominic","blauw","Opel",2011);
        Auto a3 = new Auto("Dominic", "Geel","Fiat", 2020);
        Auto a4 = new Auto("Dominic", "blauw", "Opel", 1980);
        System.out.println("Auto 2: "+ a2.hashCode());
        System.out.println("Auto 3: "+ a3.hashCode());
        System.out.println("Auto 4: "+ a4.hashCode());
        System.out.println(a2.equals(a4));
        System.out.println(a2==a4);


        autoos2 = new HashSet<Auto>();

//
//
//        System.out.println(autoos1);
//        System.out.println(autoos2);
//
//        HashSet verschil1 = new HashSet<Auto>(autoos1);
//        verschil1.removeAll(autoos2);
//
//        System.out.println(verschil1);
//
//        HashSet overeenkomst = new HashSet<Auto>(autoos1);
//        overeenkomst.addAll(autoos2);
//        System.out.println("Add");
//        System.out.println(overeenkomst);
    }
}
