/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author martijn
 */
public class DNAapp {
    
    

    public static void main(String[] args) {
        DNA d1 = new DNA("ATGGAGACCACCACA");
        DNA d2 = new DNA("AGGAGAGGAGGA");
        DNA d3 = new DNA("GAGCACCACCACACCCCCCC");
        DNA d4 = new DNA("ATTA");
        DNA d5 = new DNA("GCCCACACCACCCCACACACACACACA");
        DNA d6 = new DNA("GCCC");
        System.out.println(d2);
        
        ArrayList<DNA> dnalist = new ArrayList();
        dnalist.add(d1);
        dnalist.add(d2);
        dnalist.add(d3);
        dnalist.add(d4);
        dnalist.add(d5);
        dnalist.add(d6);
        dnalist.add(new DNA("XTGGAGGACACCACAC"));
        System.out.println(dnalist);
        dnalist.sort(null);
        System.out.println(dnalist);
        
        Collections.reverse(dnalist);
        System.out.println(dnalist);
        

    }

}
