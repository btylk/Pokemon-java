import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WildPokemonGui extends JFrame{
    JLabel pokemonHp;
    WildPokemon wildPokemon;
    public WildPokemonGui(WildPokemon wildPokemon,Player player,JButton attack){
        super(wildPokemon.getName());
        this.wildPokemon = wildPokemon;
        Container container = getContentPane();
        container.setLayout(new GridLayout(1,2));
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        container.add(new JLabel("Hello"));
        container.add(panel);
        JLabel pokemonLabel = new JLabel("Name : " + wildPokemon.getName());
        JLabel pokemonLV = new JLabel("Level : " + wildPokemon.getlvl());
        pokemonHp = new JLabel("HP : " + wildPokemon.getHp() + "/" + wildPokemon.getMaxHp());
        panel.add(pokemonLabel);
        panel.add(pokemonLV);
        panel.add(pokemonHp);
        setLocationRelativeTo(null);
        attack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                wildPokemon.takingDmg(player.getDmg());
                pokemonHp.setText("HP : " + wildPokemon.getHp() + "/" + wildPokemon.getMaxHp());
            }
        });
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /*public static void main(String[] args){
        new WildPokemonGui();
    }*/
}