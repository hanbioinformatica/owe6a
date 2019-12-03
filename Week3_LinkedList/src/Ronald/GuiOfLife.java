package Ronald;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

//Fixme: NullPointerException when attempting to set graphics color in drawGrid()
//Fixme: All cells are true?
//Fixme: GameOfLife.java CheckNearby goes out of bounds (fixed? haven't tested again.)

public class GuiOfLife extends JFrame implements ActionListener {
    private int gamesize = 50;
    private GameOfLife game;
    private JPanel panel;
    private Graphics graphics;
    private JButton gobutton;
    private JTextField xcoord;
    private JTextField ycoord;
    private JButton setbutton;

    public static void main(String[] args){
        GuiOfLife frame = new GuiOfLife();
        frame.setSize(520,620);
        frame.setTitle("Game of Life");
        frame.createGUI();
        frame.setVisible(true);
        frame.setResizable(true);
    }

    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.setBackground(Color.LIGHT_GRAY);
        game = new GameOfLife(gamesize,gamesize);
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(gamesize*10, gamesize*10)); //10 pixels per cell
        panel.setBackground(Color.BLACK);

        gobutton = new JButton("Step");
        setbutton = new JButton("Change cell");
        JLabel xlab = new JLabel("x");
        xcoord =  new JTextField("");
        xcoord.setPreferredSize(new Dimension(30,30));
        JLabel ylab = new JLabel("y");
        ycoord =  new JTextField("");
        ycoord.setPreferredSize(new Dimension(30,30));
        JLabel dimensionlabel = new JLabel("Size: "+gamesize+"x"+gamesize);
        window.add(panel);
        window.add(gobutton);
        window.add(setbutton);
        window.add(xlab);
        window.add(xcoord);
        window.add(ylab);
        window.add(ycoord);
        window.add(dimensionlabel);
        gobutton.addActionListener(this);
        setbutton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        graphics = panel.getGraphics();
        drawGrid();  //Null pointer error at setcolor???
        if (actionEvent.getSource() == gobutton) {
            game.update();
        } else if (actionEvent.getSource() == setbutton) {
            game.setOpposite(Integer.parseInt(xcoord.getText()), Integer.parseInt(ycoord.getText()));
        }
        drawCells();
    }

    private void drawGrid() {
        panel.update(graphics);
        graphics.setColor(Color.GRAY);
        for (int i = 0; i < gamesize; i++) {
            graphics.drawLine(i * 10, 0, i * 10, gamesize * 10);
            graphics.drawLine(0, i * 10, gamesize * 10, i * 10);
        }
    }

    private void drawCells() {
        panel.update(graphics);
        graphics.setColor(Color.YELLOW);
        boolean[][] gamestate = game.getGamestate();
        for (int ix = 0; ix < gamesize; ix++) {
            for (int iy = 0; iy < gamesize; iy++) {
                if (gamestate[ix][iy] = true) {
                    graphics.fillRect(ix*10+1,iy*10+1,ix*10+8,iy*10+8);
                }
            }
        }
    }

}
