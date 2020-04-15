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
        ImageIcon playerImg = new ImageIcon(/*player.getPic()*/"Froakie2.png");
        //JLabel playPic =new JLabel(playerImg);
        Image moPlayPic = playerImg.getImage();
        Image modifiedplayPic = moPlayPic.getScaledInstance(183, 218, java.awt.Image.SCALE_SMOOTH);
        playerImg = new ImageIcon(modifiedplayPic);
        JLabel playImg = new JLabel(playerImg);
        p2.add(playImg);
        JPanel enemy = new JPanel();
        enemy.setLayout(new GridLayout(2,2));
        JPanel MegaCharizardX = new JPanel();
        ImageIcon icon1 =new ImageIcon("MegaCharizardX.png");
        Image moicon1 = icon1.getImage();
        Image modifiedicon1 = moicon1.getScaledInstance(214, 185, java.awt.Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(modifiedicon1);
        JLabel Icon1 = new JLabel(icon1);
        JButton button1 = new JButton("MegaCharizardX");
        p2.add(Icon1,button1);
        container.add(p2,BorderLayout.CENTER);
        




        //pack();
        setSize(500,550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Versus();
    }

}