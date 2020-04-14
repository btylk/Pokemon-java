import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartMenu extends JFrame{
    JTextField nametext;
    String name;
    public StartMenu(){
        super("Quarantine Pokemon");
        Container container = getContentPane();
        container.setLayout(new GridLayout(2,1));
        
        JPanel p1 = new JPanel();
        ImageIcon iconlogo = new ImageIcon("Logo3.png");
        JLabel logo = new JLabel(iconlogo);
        p1.add(logo);
        p1.setLayout(new FlowLayout());
        container.add(p1);
        JPanel p2 = new JPanel(); 
        JLabel nameLabel = new JLabel("Enter Your Name");
        p2.add(nameLabel);
        JTextField nametext = new JTextField(30);
        p2.add(nametext);
        JButton loginButton = new JButton("Log in");
        p2.add(loginButton);
        p2.setLayout(new FlowLayout());
        container.add(p1);
        container.add(p2);
        loginButton.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                name = nametext.getText();

                new PlayerGui(name);
                dispose();
            }
        });
        nametext.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                name = nametext.getText();
                
                new PlayerGui(name);
                dispose();
            }
        });
        pack();
        setSize(640,320);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    


    public static void main(String[] args){
        new StartMenu();
    }

}