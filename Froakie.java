
public class Froakie extends Player{
    public Froakie(String newName){
        super(newName, "Froakie");
        maxHp = 250;
        maxMp = 95;
        hp = maxHp;
        mp = maxMp;
        exp = 0;
        myDmg = 120;
        skills.add(new NormalAttack(myDmg));
        skills.add(new Bubble(myDmg));
        playerPic = "Froakie.png";
    }
}