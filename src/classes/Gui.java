package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame{
    private JButton button1, button2;
    private JPanel panel1 = new JPanel(), panel2 = new JPanel(), contentPanel = new JPanel();
    private CardLayout cardLayout = new CardLayout();
    //flowlayout e borderlayout

    public Gui(){
        super("Card Layout");
        button1 = new JButton("Ir para o segundo Card");
        button2 = new JButton("Ir para o primeiro Card");

        panel1.setBackground(Color.PINK);
        panel2.setBackground(Color.yellow);

        actionListener al = new actionListener();

        button1.addActionListener(al);
        button2.addActionListener(al);

        panel1.add(button1);
        panel2.add(button2);

        contentPanel.setLayout(cardLayout);
        
        contentPanel.add(panel1, "panel1");
        contentPanel.add(panel2, "panel2");

        this.setContentPane(contentPanel);

        cardLayout.show(contentPanel, "panel1");
    }
    public class actionListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JButton src = (JButton) event.getSource();

            if(src.equals(button1))
                cardLayout.show(contentPanel, "panel2");
            if(src.equals(button2))
                cardLayout.show(contentPanel, "panel1");
        }
    }

}