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
        playerMP = new JLabel("MP : " + player.getMp() + " / " + player.getmaxMp()); 
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
        wPokemonstatus.add(wildPokemonHP);
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
        Bag playerBag = player.myBag;
        panel = new JPanel();
        JPanel itemPanel = new JPanel();
        itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.Y_AXIS));
        panel.add(itemPanel);
        for(int i = 0; i < playerBag.getNumberItem(); i++){
            buttons.add(new JButton(playerBag.getItem(i).getItemName()));
            itemPanel.add(buttons.get(i));
            buttons.get(i).addActionListener(new InnerBagGui(i,player,itemPanel));

        }
        allButton.add(panel);
        panel.setVisible(false);
        container.add(status);
        container.add(pic);
        container.add(allButton);

        attack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                wildPokemon.takingDmg(player.getDmg());
                wildPokemonHP.setText("HP : " + wildPokemon.getHp() + " / " + wildPokemon.getMaxHp());
                if(wildPokemon.getHp() <= 0 ){
                    player.expgain(wildPokemon.getExp());
                    Item dropItem = wildPokemon.DropItem();
                    if(dropItem != null){
                        player.myBag.addItem(dropItem);
                    }
                    dispose();
                    new PlayerInfoGui(player);
                }
                else{
                    player.dmgToHp(wildPokemon.getDmg());
                    playerHP.setText("HP : " + player.getHp() + " / " + player.getmaxHp());
                    if(player.isPlayerDie()){
                        player.resurrection();
                        dispose();
                        new PlayerInfoGui(player);
                    }
                }
            }
        });

        bag.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(panel.isShowing()){
                    panel.setVisible(false);
                }
                else{
                    panel.setVisible(true);
                }
            }
        });

        skill.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(skillPanel.isShowing()){
                    skillPanel.setVisible(false);
                }
                else{
                    skillPanel.setVisible(true);
                }
            }
        });

        run.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new PlayerInfoGui(player);
            }
        });
        setSize(1060,720);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class InnerBagGui implements ActionListener{
        int i;
        Player player;
        JPanel itemJPanel;
        public InnerBagGui(int index,Player player,JPanel itemJPanel){
            i = index;
            this.player = player;
            this.itemJPanel = itemJPanel;
        }
        public void actionPerformed(ActionEvent e){
            player.useBerry(player.myBag.getItem(0));
            player.myBag.removeItem(0);
            panel.setVisible(false);
            itemJPanel.remove(0);
            playerHP.setText("HP : " + player.getHp() + " / " + player.getmaxHp());
            playerMP.setText("MP : " + player.getMp() + " / " + player.getmaxMp());
        }
    }

    public class SkillUsed implements ActionListener{
        int i;
        Player player;
        WildPokemon wildPokemon;
        public SkillUsed(int index,Player player,WildPokemon wildPokemon){
            i = index;
            this.player = player;
            this.wildPokemon = wildPokemon;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(player.getMp() >= player.getSkill(i).getSkillMpUse()){
                wildPokemon.takingDmg(player.getSkill(i).getSkillDamage());
                player.useMp(player.getSkill(i).getSkillMpUse());
                playerMP.setText("MP : " + player.getMp() + " / " + player.getmaxMp());
                wildPokemonHP.setText("HP : " + wildPokemon.getHp() + " / " + wildPokemon.getMaxHp());
                if(wildPokemon.getHp() <= 0){
                    player.expgain(wildPokemon.getExp());
                    Item dropItem = wildPokemon.DropItem();
                    if(dropItem != null){
                        player.myBag.addItem(dropItem);
                    }
                    dispose();
                    new PlayerInfoGui(player);
                }
                else{
                    player.dmgToHp(wildPokemon.getDmg());
                    playerHP.setText("HP : " + player.getHp() + " / " + player.getmaxHp());
                    if(player.isPlayerDie()){
                        player.resurrection();
                        dispose();
                        new PlayerInfoGui(player);
                    }
                    skillPanel.setVisible(false);
                }
            }
            else{
                JOptionPane.showMessageDialog(container, "Not Enough MP");
            }
        }
    }

}