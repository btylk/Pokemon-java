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
        JLabel playerEvo = new JLabel("Evo : " + player.getEvoLevel());
        JLabel playerLV = new JLabel("Level : " + player.getlvl());
        JLabel playerExp = new JLabel("Exp : " + player.getexp());
        JLabel playerHP = new JLabel("HP : " + player.getHp() + " / " + player.getmaxHp());
        JLabel playerMp = new JLabel("MP : " + player.getMp() + " / " + player.getmaxMp());
        JLabel winCount = new JLabel("Win : " + player.getWinCount());
        status.add(playerLabel);
        status.add(playerEvo);
        status.add(playerLV);
        status.add(playerExp);
        status.add(playerHP);
        status.add(playerMp);
        status.add(winCount);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2));
        p2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        ImageIcon iconlogo = new ImageIcon("Logo3.png");
        JLabel logo = new JLabel(iconlogo);
        p1.add(logo);
        container.add(logo,BorderLayout.NORTH);
        ImageIcon playerImg = new ImageIcon(player.getPic());
        /*Image moPoke = playerImg.getImage();
        Image modifiedpoke = moPoke.getScaledInstance(183, 218, java.awt.Image.SCALE_SMOOTH);
        playerImg = new ImageIcon(modifiedpoke);*/
        JLabel playPic =new JLabel(playerImg);
        p2.add(playPic);
        p2.add(status);
        container.add(p2,BorderLayout.CENTER);
        JButton battleArena = new JButton("Battle Arena");
        //JButton pokeball = new JButton("Pokeball");
        JButton bag = new JButton("Bag");
        JButton Evolution = new JButton("Evolution");
        JPanel select = new JPanel();
        select.setLayout(new FlowLayout());
        select.add(battleArena);
        select.add(Evolution);
        //select.add(pokeball);
        select.add(bag);
        Evolution.setVisible(false);
        container.add(select,BorderLayout.SOUTH);
        if(player.getlvl() >= 10 && player.getEvoLevel().equals("Froakie")){
            Evolution.setVisible(true);
        }
        else if(player.getlvl() >= 25 && player.getEvoLevel().equals("Frogadier")){
            Evolution.setVisible(true);
        }
        bag.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                new BagGui(player,1);
                dispose();
            }
        });
        battleArena.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                new VersusGui(player);
                dispose();
            }
        });
        Evolution.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new Evolution(player);
                dispose();
            }
        });



        setSize(500,550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /*public static void main(String[] args){
        new PlayerInfoGui();
    }*/


}
