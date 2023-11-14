
package LiveDemoos.demo2022.dna;

import java.util.*;

/**
 * @author Martijn van der Bruggen
 * @version 22 november 2018
 * (c) HAN University 
 * Instituut Toegepaste Biologie en Chemie
 * Bio-informatica
 * 
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
