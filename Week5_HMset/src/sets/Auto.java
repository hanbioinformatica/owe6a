package sets;

/**
 *
 * @author Martijn van der Bruggen (c) Hogeschool van Arnhem en Nijmegen d.d. 10
 * december aanpassing aan hashCode
 *
 */
public final class Auto {

    protected String eigenaar;
    protected String kleur;
    private String merk;
    private int bouwjaar;

    Auto(String e, String k, String merk, int b) {
        setEigenaar(e);
        setKleur(k);
        setMerk(merk);
        setBouwjaar(b);

    }

    @Override
    public int hashCode() {
        int hash = 3;
        //hash = 83 * hash + (this.eigenaar != null ? this.eigenaar.hashCode() : 0);
        hash = 83 * hash + this.bouwjaar+this.merk.hashCode();

        //hash = 83 * hash + this.pk;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    @Override
    public String toString() {
        return eigenaar + " " + kleur + " bouwjaar: "+bouwjaar;
    }

    public String getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(String eigenaar) {
        this.eigenaar = eigenaar;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    /**
     * @return the merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the merk to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     * @return the bouwjaar
     */
    public int getBouwjaar() {
        return bouwjaar;
    }

    /**
     * @param bouwjaar the bouwjaar to set
     */
    public void setBouwjaar(int bouwjaar) {
        this.bouwjaar = bouwjaar;
    }
}
