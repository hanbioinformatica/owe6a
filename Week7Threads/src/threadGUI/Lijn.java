package threadGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 * @author Martijn van der Bruggen
 * @version Dec 22, 2018 (c) HAN University Instituut Toegepaste Biologie en
 * Chemie Bio-informatica
 *
 */
public class Lijn extends Thread {

    int lijnNummer = 0;
    static int x1 = 10;
    int y1 = 0;
    static int lengte = 100;
    Graphics g;
    JLabel info;
    static final int stapgrootte = 1;
    Color kleur = Color.blue;

    public Lijn(int nummer, Graphics gg, JLabel jl) {
        g = gg;
        info = jl;
        lijnNummer = nummer; //threadnummer
        y1 = 20 + lijnNummer * 20; // Positie op y-as
    }

    private void sleep(int msec) {
        try {
            Thread.sleep(msec);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tekenHetDan() {
        x1 += stapgrootte;
        g.fillRect(x1, y1, stapgrootte, 5);
        info.setText("Thread: " + lijnNummer);
        sleep(500);
    }

    public void drawLine() {
        g.setColor(kleur);
        for (int i = 0; i < lengte; i++) {
            tekenHetDan();
        }
    }

    public void run() {
        drawLine();
    }

}
