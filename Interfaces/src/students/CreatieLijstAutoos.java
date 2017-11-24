/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author mart1nus
 */
import java.util.*;

public class CreatieLijstAutoos {

    public static List<Auto> getAutoos() {

        List<Auto> lijst = new ArrayList<Auto>();

        lijst.add(new Auto("Honda", "Civic", 2600, 1990));
        lijst.add(new Auto("Opel", "Astra", 5000, 2001));
        lijst.add(new Auto("Citroen", "C4", 2000, 2001));
        lijst.add(new Auto("Peugot", "305", 8000, 1980));
        return lijst;
    }
}

