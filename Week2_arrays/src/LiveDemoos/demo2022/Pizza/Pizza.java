package LiveDemoos.demo2022.Pizza;

public class Pizza extends Product implements Comparable {

    private double diameter;
    private String naam;
    private static int aantal;

    public Pizza(double prijs, double diameter, String naam) {
        this.prijs = prijs;
        this.diameter = diameter;
        this.naam = naam;
        aantal++;
    }

    public static int getAantal() {
        return aantal;
    }

    public double getPrijs() {
        return prijs;
    }


    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "LiveDemoos/demo2022/Pizza " + naam + " prijs " + prijs + " diameter " + diameter;
    }

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
