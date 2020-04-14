import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Versus extends JFrame{

    public Versus(/*Player player*/){
        super("Select Enemy");
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        ImageIcon iconlogo = new ImageIcon("Fight3.png");
        Image moFight = iconlogo.getImage();
        Image modifiedfight = moFight.getScaledInstance(333, 111, java.awt.Image.SCALE_SMOOTH);
        iconlogo = new ImageIcon(modifiedfight);
        JLabel logo = new JLabel(iconlogo);
        p1.add(logo);
        container.add(logo,BorderLayout.NORTH);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2));






        //pack();
        setSize(500,550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Versus();
    }

}