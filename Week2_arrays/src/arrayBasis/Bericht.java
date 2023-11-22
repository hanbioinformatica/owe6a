package arrayBasis;

import java.util.ArrayList;
import java.util.Collections;

public class Bericht {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<BerichtO>();
        al.add(new BerichtO(7,8));
        al.add(new BerichtO(17,18));
        al.add(new BerichtO(2,3));
        al.add(new BerichtO(5,2));
        al.add(new BerichtO(55,35));
        al.add(new BerichtO(117,118));
        al.add(new BerichtO(700,800));
        al.add(new BerichtO(1,3));
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

    }

}

class BerichtO implements Comparable {
    int nummer;
    int lengte;

    public BerichtO(int nummer, int lengte) {
        this.nummer = nummer;
        this.lengte = lengte;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    @Override
    public int compareTo(Object o) {
        BerichtO x = (BerichtO)o;
        if (this.lengte>x.lengte) return 1; else if (this.lengte<x.lengte) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "BerichtO{" +
                "nummer=" + nummer +
                ", lengte=" + lengte +
                '}';
    }
}
