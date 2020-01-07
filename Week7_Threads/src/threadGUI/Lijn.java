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
    static int xPositie = 10;
    int y1 = 0;
    static int lengte = 100;
    Graphics graphicsPanelObject;
    JLabel info;
    static final int STAPGROOTTE = 1;
    Color kleur = Color.blue;

    public Lijn(int nummer, Graphics gg, JLabel jl) {
        graphicsPanelObject = gg;
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
        xPositie += STAPGROOTTE;
        graphicsPanelObject.fillRect(xPositie, y1, STAPGROOTTE, 5);
        info.setForeground(kleur);
        info.setText("Thread: " + lijnNummer);
        sleep(50);
    }

    public void drawLine() {
        graphicsPanelObject.setColor(kleur);
        for (int i = 0; i < lengte; i++) {
            tekenHetDan();
        }
    }

    public void run() {
        drawLine();
    }

}
