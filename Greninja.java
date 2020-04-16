
public class Greninja extends Player{

    public Greninja(Player lastPlayer){
        super(lastPlayer.getName(), "Greninja");
        maxHp = lastPlayer.getmaxHp()+3000;
        maxMp = lastPlayer.getmaxMp()+1000;
        hp = maxHp;
        mp = maxMp;
        exp = lastPlayer.getexp();
        myDmg = lastPlayer.getDmg();
        level = lastPlayer.getlvl();
        myBag = lastPlayer.myBag;
        skills.add(new DarkPulse(myDmg));
        skills.add(new ShurikenFlurry(myDmg));
        playerPic = "Greninja2.png";
        wincount = lastPlayer.getWinCount();
    }
}