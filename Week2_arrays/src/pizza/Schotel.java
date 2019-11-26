package pizza;

public class Schotel extends Product implements Comparable{

    private String naam;

    public Schotel(double prijs, String naam) {
        this.prijs = prijs;
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam +" prijs "+prijs;
    }

    private static int aantal;

    @Override
    public int compareTo(Object o) {
        Product p = (Product) o;
        if (this.prijs > p.prijs) {
            return 1;
        } else if (this.prijs < p.prijs) {
            return -1;
        } else
            return 0;
    }
}
