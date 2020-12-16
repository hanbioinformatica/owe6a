/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Martijn van der Bruggen
 * @version Dec 10, 2018 (c) HAN University Instituut Toegepaste Biologie en
 * Chemie Bio-informatica
 *
 */
public class DemoSetStrings {

    public static void main(String[] args) {
        Set<String> boerderij = new HashSet<String>();
        Set<String> dierentuin = new HashSet<String>();
        boerderij.add("kip");
        boerderij.add("konijn");
        boerderij.add("varken");
        dierentuin.add("beer");
        dierentuin.add("leeuw");
        dierentuin.add("konijn");
        
        System.out.println(dierentuin);
        System.out.println(boerderij);
        boerderij.retainAll(dierentuin);
        
        System.out.println(boerderij);
               
        

    }

}
