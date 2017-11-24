/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;

/**
 *
 * @author martijn
 */
public class DemoHashCode extends Object {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
    
}
