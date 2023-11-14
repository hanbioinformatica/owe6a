package Vervoersmiddelen;

public class Auto implements Comparable {
    private double prijs;
    private int jaartal;

    @Override
    public String toString() {
        return "Auto{" +
                "prijs=" + prijs +
                ", jaartal=" + jaartal +
                ", kleur='" + kleur + '\'' +
                '}';
    }

    private String kleur;

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public int getJaartal() {
        return jaartal;
    }

    public void setJaartal(int jaartal) {
        this.jaartal = jaartal;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }


    public Auto(double prijs, int jaartal, String kleur) {
        this.prijs = prijs;
        this.jaartal = jaartal;
        this.kleur = kleur;
    }


    @Override
    public int compareTo(Object o) {
        Auto a = (Auto)o;
        if (this.prijs>a.prijs){
            return 1;
        } else if (this.prijs<a.prijs){
            return -1;
        } else return 0;
    }
}
