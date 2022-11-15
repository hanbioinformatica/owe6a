package productDemo;

public class Product implements Comparable<Product>{

    private String naam;
    private float prijs;

    private int jaartal;

    @Override
    public String toString() {
        return "Product{" +
                "naam='" + naam + '\'' +
                ", prijs=" + prijs +
                ", jaartal=" + jaartal +
                '}';
    }

    public Product(String naam, float prijs, int jaartal) {
        this.naam = naam;
        this.prijs = prijs;
        this.jaartal = jaartal;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public float getPrijs() {
        return prijs;
    }

    public void setPrijs(float prijs) {
        this.prijs = prijs;
    }

    public int getJaartal() {
        return jaartal;
    }

    public void setJaartal(int jaartal) {
        this.jaartal = jaartal;
    }


    @Override
    public int compareTo(Product o) {
        if (this.jaartal>o.jaartal){
            return +1;
        } else if (this.jaartal<o.jaartal) {
            return -1;
        }
        return 0;
    }
}
