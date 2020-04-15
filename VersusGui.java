import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VersusGui extends JFrame{

    public VersusGui(Player player){
        super("Select Enemy");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JPanel MegaCharizardX = new JPanel();
        JPanel MegaEmpoleon = new JPanel();
        JPanel MegaLucario = new JPanel();
        JPanel MegaMewtwoX = new JPanel();
        MegaCharizardX.setLayout(new GridLayout(2,1));
        MegaEmpoleon.setLayout(new GridLayout(2,1));
        MegaLucario.setLayout(new GridLayout(2,1));
        MegaMewtwoX.setLayout(new GridLayout(2,1));
        container.add(MegaCharizardX);
        container.add(MegaEmpoleon);
        container.add(MegaLucario);
        container.add(MegaMewtwoX);
        MegaCharizardX.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        MegaEmpoleon.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        MegaLucario.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        MegaMewtwoX.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        ImageIcon icon1 =new ImageIcon("MegaCharizardX.png");
        Image moicon1 = icon1.getImage();
        Image modifiedicon1 = moicon1.getScaledInstance(270, 210, java.awt.Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(modifiedicon1);
        ImageIcon icon2 =new ImageIcon("MegaEmpoleon.png");
        Image moicon2 = icon2.getImage();
        Image modifiedicon2 = moicon2.getScaledInstance(214, 250, java.awt.Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(modifiedicon2);
        ImageIcon icon3 =new ImageIcon("MegaLucario2.png");
        Image moicon3 = icon3.getImage();
        Image modifiedicon3 = moicon3.getScaledInstance(186, 251, java.awt.Image.SCALE_SMOOTH);
        icon3 = new ImageIcon(modifiedicon3);
        ImageIcon icon4 =new ImageIcon("MegaMewtwoX.png");
        Image moicon4 = icon4.getImage();
        Image modifiedicon4 = moicon4.getScaledInstance(180, 225, java.awt.Image.SCALE_SMOOTH);
        icon4 = new ImageIcon(modifiedicon4);
        JLabel label1 =new JLabel(icon1);
        JLabel label2 =new JLabel(icon2);
        JLabel label3 =new JLabel(icon3);
        JLabel label4 =new JLabel(icon4);
        MegaCharizardX.add(label1);
        MegaEmpoleon.add(label2);
        MegaLucario.add(label3);
        MegaMewtwoX.add(label4);
        JButton button1 =new JButton("MegaCharizardX");
        JButton button2 =new JButton("MegaEmpoleon");
        JButton button3 =new JButton("MegaLucario");
        JButton button4 =new JButton("MegaMewtwoX");
        JPanel set1 =new JPanel();
        JPanel set2 =new JPanel();
        JPanel set3 =new JPanel();
        JPanel set4 =new JPanel();
        set1.add(button1);
        set2.add(button2);
        set3.add(button3);
        set4.add(button4);
        MegaCharizardX.add(set1);
        MegaEmpoleon.add(set2);
        MegaLucario.add(set3);
        MegaMewtwoX.add(set4);
        /*button1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BattleArena(player, new GreenSlime());
                dispose();
            }
        });
        button2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BattleArena(player, new BlueSlime());
                dispose();
            }
        });
        button3.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BattleArena(player, new RedSlime());
                dispose();
            }
        });
        button4.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BattleArena(player, new GoldenSlime());
                dispose();
            }
        });
        button5.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BattleArena(player, new BlackBowSlime());
                dispose();
            }
        });
        button6.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BattleArena(player, new NekoSlime());
                dispose();
            }
        });*/
        
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /*public static void main(String[] args){
        new VersusGui();
    }*/
}