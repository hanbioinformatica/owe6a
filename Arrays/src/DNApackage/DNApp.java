/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DNApackage;

import java.util.*;

/**
 *
 * @author martijn
 */
public class DNApp {

    public static void main(String[] args) {
        DNA d = new DNA("a1", "atggcccgaggatatgag");
        ArrayList<DNA> alist = new ArrayList();
        alist.add(d);
        alist.add(new DNA("b2","atgaggaggagaccc"));
        alist.add(new DNA("x4","tttcttaattatgaggaggagaccc"));
        alist.add(new DNA("cd","atgagaccc"));
        alist.add(new DNA("db","atgaggaggagaccc"));
        alist.add(new DNA("b2","atgaccccccccccggaggagaccc"));
        
        
        System.out.println(alist);
        
        for (DNA dnaElement:alist){
            System.out.println(dnaElement);
            
        }
        System.out.println("Sortering");
        Collections.sort(alist);
        for (DNA dnaElement:alist){
            System.out.println(dnaElement);
            
        }
        
        
    }

}
