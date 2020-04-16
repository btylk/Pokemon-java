
public class Bubble extends Skill{

    public Bubble(int baseDMG){
        super("Bubble : 20 MP");
        damage = (int)(baseDMG*1.8);
        mpUse = 20;
    }

}