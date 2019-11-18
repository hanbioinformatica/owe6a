package dna;


/**
 * @author Martijn van der Bruggen
 * @version 22 november 2018
 * (c) HAN University 
 * Instituut Toegepaste Biologie en Chemie
 * Bio-informatica
 * 
 */

public class DNA implements Comparable {

    private String sequentie = "";
    private String naam = "";

    public DNA(String n, String s) {
        setNaam(n);
        setSequentie(s);
    }

    /**
     * @return the sequentie
     */
    public String getSequentie() {
        return sequentie;
    }

    public int getLengte() {
        return sequentie.length();
    }

    public double gcPerc() {
        double gc = 0;
        for (int i = 0; i < sequentie.length(); i++) {
            if (sequentie.charAt(i) == 'g' || sequentie.charAt(i) == 'c') {
                gc++;
            }
        }
        return (gc / sequentie.length()) * 100;

    }

    /**
     * @param sequentie the sequentie to set
     */
    public void setSequentie(String sequentie) {
        this.sequentie = sequentie;
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @param naam the naam to set
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "DNA : " + getNaam() + " Lengte " + getLengte() + " GC_perc " + gcPerc();
    }

    @Override
    public int compareTo(Object o) {
        if (gcPerc() > ((DNA) o).gcPerc()) {
            return 1;
        } else if (gcPerc() < ((DNA) o).gcPerc()) {
            return -1;
        } else {
            return 0;
        }
    }

}
