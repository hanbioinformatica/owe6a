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


        autoos2 = new HashSet<Auto>();
    }
}
