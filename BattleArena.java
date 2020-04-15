import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BattleArena extends JFrame{
    JPanel panel;
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    JLabel playerHP;
    JLabel playerMP;
    JLabel wildPokemonHP;
    JPanel skillPanel;
    Container container;
    public BattleArena(Player player,WildPokemon wildPokemon){
        super("Battle Arena");
        container = getContentPane();
        container.setLayout(new GridLayout(3,1));
        JPanel status = new JPanel();
        JPanel pic = new JPanel();
        JPanel select = new JPanel();
        status.setLayout(new GridLayout(1,2));
        pic.setLayout(new GridLayout(1,2));
        select.setLayout(new FlowLayout());
        JPanel playerstatus = new JPanel();
        playerstatus.setLayout(new BoxLayout(playerstatus, BoxLayout.Y_AXIS));
        JLabel playerStatLabel = new JLabel("Player Status");
        JLabel playerLabel = new JLabel("Name : " + player.getName());
        JLabel playerEvo = new JLabel("Evo : " + player.getEvoLevel());
        JLabel playerLV = new JLabel("Level : " + player.getlvl());
        playerHP = new JLabel("HP : " + player.getHp() + " / " + player.getmaxHp());
        playerMP = new JLabel("MP : " + player.getMp() + " / " + player.getMaxMp()); 
        playerstatus.add(playerStatLabel);
        playerstatus.add(playerLabel);
        playerstatus.add(playerEvo);
        playerstatus.add(playerLV);
        playerstatus.add(playerHP);
        playerstatus.add(playerMP);
        status.add(playerstatus);
        JPanel wPokemonstatus = new JPanel();
        wPokemonstatus.setLayout(new BoxLayout(wPokemonstatus, BoxLayout.Y_AXIS));
        JLabel wPokemonStatLabel = new JLabel("Wild Pokemon Status");
        JLabel wPokemonLabel = new JLabel("Name : " + wildPokemon.getName());
        JLabel wPokemonLV = new JLabel("Level : " + wildPokemon.getlvl());
        wildPokemonHP = new JLabel("HP : " + wildPokemon.getHp() + " / " + wildPokemon.getMaxHp());
        wPokemonstatus.add(wPokemonStatLabel);
        wPokemonstatus.add(wPokemonLabel);
        wPokemonstatus.add(wPokemonLV);
        status.add(wPokemonstatus);
        ImageIcon playPic = new ImageIcon(player.getPic());
        JLabel playImg = new JLabel(playPic);
        pic.add(playImg);
        ImageIcon wPokePic = new ImageIcon(wildPokemon.getPic());
        JLabel wPokeImg = new JLabel(wPokePic);
        pic.add(wPokeImg);
        JButton attack = new JButton("Attack");
        JButton skill = new JButton("Skill");
        JButton bag = new JButton("Bag");
        JButton run = new JButton("RUN!!!");
        JPanel allButton = new JPanel();
        allButton.setLayout(new FlowLayout());
        skillPanel = new JPanel();
        JPanel skillList = new JPanel();
        skillList.setLayout(new BoxLayout(skillList, BoxLayout.Y_AXIS));
        ArrayList<JButton> buttonSkill = new ArrayList<JButton>();
        for(int i = 0; i < player.getnumberskill(); i++){
            buttonSkill.add(new JButton(player.getSkill(i).getSkillName() + " " + player.getSkill(i).getSkillDamage() + " DMG "));
            skillList.add(buttonSkill.get(i));
            buttonSkill.get(i).addActionListener(new SkillUsed(i, player, wildPokemon));
        }
        skillPanel.add(skillList);
        allButton.add(skillPanel);
        skillPanel.setVisible(false);
        select.add(attack);
        select.add(skill);
        select.add(bag);
        select.add(run);
        allButton.add(select);
        










    }
}