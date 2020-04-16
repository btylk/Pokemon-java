import javax.swing.*;



import java.awt.*;
import java.awt.event.*;

public class Evolution extends JFrame{
    Player player;
    public Evolution(Player player){
        super("Evolution");
        //this.player = player;
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        JPanel evologo = new JPanel();
        ImageIcon iconlogo = new ImageIcon("Evolution.png");
        Image moicon4 = iconlogo.getImage();
        Image modifiedicon4 = moicon4.getScaledInstance(334, 112, java.awt.Image.SCALE_SMOOTH);
        iconlogo = new ImageIcon(modifiedicon4);
        JLabel logo = new JLabel(iconlogo);
        evologo.add(logo);
        container.add(logo,BorderLayout.NORTH);
        JPanel evoPanel = new JPanel();
        evoPanel.setLayout(new GridLayout(1,2));
        evoPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        ImageIcon frogadierPic = new ImageIcon("Frogadier.png");
        Image moicon3 = frogadierPic.getImage();
        Image modifiedicon3 = moicon3.getScaledInstance(267, 213, java.awt.Image.SCALE_SMOOTH);
        frogadierPic = new ImageIcon(modifiedicon3);
        JLabel frogadierLabel = new JLabel(frogadierPic);
        evoPanel.add(frogadierLabel);
        ImageIcon greninjaPic = new ImageIcon("Greninja.png");
        Image moicon5 = greninjaPic.getImage();
        Image modifiedicon5 = moicon5.getScaledInstance(267, 205, java.awt.Image.SCALE_SMOOTH);
        greninjaPic = new ImageIcon(modifiedicon5);
        JLabel greninjaLabel = new JLabel(greninjaPic);  
        evoPanel.add(greninjaLabel);
        JPanel evoButton = new JPanel();
        evoButton.setLayout(new GridLayout(1,2));
        JPanel frogadierPanel = new JPanel();
        JButton frogadierButton = new JButton("Evolution to Frogadier");
        JLabel hint = new JLabel("You are already Frogadier");
        frogadierPanel.add(frogadierButton);
        frogadierPanel.add(hint);
        JPanel greninjaPanel = new JPanel();
        JButton greninjaButton = new JButton("Evolution to Greninja");
        JLabel hint2 = new JLabel("Available For Frogadier LV 25");
        greninjaPanel.add(greninjaButton);
        greninjaPanel.add(hint2);
        evoButton.add(frogadierPanel);
        evoButton.add(greninjaPanel);
        frogadierButton.setVisible(false);
        greninjaButton.setVisible(false);
        //evoPanel.add(playPic);
        //evoPanel.add(status);
        container.add(evoPanel,BorderLayout.CENTER);
        container.add(evoButton,BorderLayout.SOUTH);
        if(player.getlvl() >= 25 && player.getEvoLevel().equals("Frogadier")){
            greninjaButton.setVisible(true);
            frogadierButton.setVisible(false);
            hint.setVisible(true);
            hint2.setVisible(false);
            
        }
        

        frogadierButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                new PlayerInfoGui(new Frogadier(player));
            }
        });

        greninjaButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                new PlayerInfoGui(new Greninja(player));
            }
        });




        setSize(700,550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    /*public static void main(String[] args){
        new Evolution();
    }*/

}