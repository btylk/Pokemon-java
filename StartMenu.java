import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartMenu extends JFrame{

    //private Image img;
    String name;
    public StartMenu(){
        super("Main Menu");
        
        Container container = getContentPane();
        container.setLayout(new GridLayout(3,1));

        JPanel p1 = new JPanel();
        ImageIcon iconlogo = new ImageIcon("Logo3.png");
        JLabel logo = new JLabel(iconlogo);
        p1.add(logo);
        //p1.setLayout(new FlowLayout());
        container.add(p1);

        JPanel p2 = new JPanel();
        ImageIcon startlogo = new ImageIcon("startLogo2.png");
        Image startImage = startlogo.getImage();
        Image modifiedstartImage = startImage.getScaledInstance(125, 67, java.awt.Image.SCALE_SMOOTH);
        startlogo = new ImageIcon(modifiedstartImage);
        JLabel slogo = new JLabel(startlogo);
        p2.add(slogo);
        //p2.setLayout(new FlowLayout());
        container.add(p2);
        slogo.addMouseListener(new MouseListener() {
            public void mouseReleased(MouseEvent e) {
                //name = nametext.getText();
                new SetName();
                dispose();
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseClicked(MouseEvent e) {
                //name = nametext.getText();
                new SetName();
                dispose();
            }
        });
        //panel_1.add(buttonLabel);
        /*slogo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new StartMenu();
                dispose();
            }
        });*/

        JPanel p3 = new JPanel();
        ImageIcon playerIcon = new ImageIcon("pLogo.png");
        /*Image playerImage = playerIcon.getImage();
        Image modifiedplayerImage = playerImage.getScaledInstance(125, 175, java.awt.Image.SCALE_SMOOTH);
        playerIcon = new ImageIcon(modifiedplayerImage);*/
        JLabel pLogo = new JLabel(playerIcon);

        p3.add(pLogo);
        //p3.setLayout(new FlowLayout());
        container.add(p3);
        //pack();
    
    





        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /*public static void main(String[] args){
        new PlayerInfoGui();
    }*/
}