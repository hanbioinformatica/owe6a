/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author mart1nus
 */
public class Auto implements Comparable<Auto> {

    String merk;
    String type;
    int prijs;
    int jaartal;

    public Auto(String merk, String type, int prijs, int jaartal) {
        this.merk = merk;
        this.type = type;
        this.prijs = prijs;
        this.jaartal = jaartal;
    }

    public int compareTo(Auto a) {
        if (this.jaartal < a.jaartal) {
            return 1;
        } else {
            return -1;
        }
    }
}
