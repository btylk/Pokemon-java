
public class Froakie extends Player{
    public Froakie(String newName){
        super(newName, "Froakie");
        maxHp = 550;
        maxMp = 125;
        hp = maxHp;
        mp = maxMp;
        exp = 0;
        myDmg = 150;
        skills.add(new NormalAttack(myDmg));
        skills.add(new Bubble(myDmg));
        playerPic = "Froakie.png";
    }
}