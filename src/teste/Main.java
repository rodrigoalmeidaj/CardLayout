package teste;
import javax.swing.*;

import classes.Gui;

public class Main {
    public static void main(String[] args) {
        Gui g = new Gui();
        g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        g.setSize(800, 450);
        g.setVisible(true);
        
    }
}