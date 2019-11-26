package demo;


public class Auto {
    private int snelheid = 0;
    private String eigenaar;

    public int getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(int snelheid) {
        this.snelheid = snelheid;
    }



    public String getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(String eigenaar) {
        this.eigenaar = eigenaar;
    }

    public Auto(String eigenaar) {
        this.eigenaar = eigenaar;
    }

    public String toString (){
        return "Dit is de auto van "+eigenaar;
    }


}
