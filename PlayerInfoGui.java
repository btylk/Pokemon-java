import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlayerInfoGui extends JFrame{

    public PlayerInfoGui(Player player){
        super("Player Info");
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        /*ImageIcon iconlogo = new ImageIcon("Logo3.png");
        JLabel logo = new JLabel(iconlogo);
        p1.add(logo);
        container.add(p1);*/
        JPanel status = new JPanel();
        status.setLayout(new BoxLayout(status,BoxLayout.Y_AXIS));
        JLabel playerLabel = new JLabel("Name : " + player.getName());
        JLabel playerLV = new JLabel("Level : " + player.getlvl());
        JLabel playerExp = new JLabel("Exp : " + player.getexp());
        status.add(playerLabel);
        status.add(playerLV);
        status.add(playerExp);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2));
        p2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        ImageIcon iconlogo = new ImageIcon("Logo3.png");
        JLabel logo = new JLabel(iconlogo);
        p1.add(logo);
        container.add(logo,BorderLayout.NORTH);
        ImageIcon playerImg = new ImageIcon(player.getPic());
        Image moPoke = playerImg.getImage();
        Image modifiedpoke = moPoke.getScaledInstance(183, 218, java.awt.Image.SCALE_SMOOTH);
        playerImg = new ImageIcon(modifiedpoke);
        JLabel playPic =new JLabel(playerImg);
        p2.add(playPic);
        p2.add(status);
        container.add(p2,BorderLayout.CENTER);
        JButton battleArena = new JButton("Battle Arena");
        //JButton pokeball = new JButton("Pokeball");
        JButton bag = new JButton("Bag");
        JPanel select = new JPanel();
        select.setLayout(new FlowLayout());
        select.add(battleArena);
        //select.add(pokeball);
        select.add(bag);
        container.add(select,BorderLayout.SOUTH);
        bag.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                new BagGui(player,1);
                dispose();
            }
        });
        /*pokeball.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                new MyPokemonGui(new Froakie(""),1);
                dispose();
            }
        });*/



        setSize(500,550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /*public static void main(String[] args){
        new PlayerInfoGui();
    }*/


}
