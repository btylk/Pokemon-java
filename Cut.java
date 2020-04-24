
public class Cut extends Skill{

    public Cut(int baseDMG){
        super("Cut :  120 MP");
        damage = (int)(baseDMG*2.3);
        mpUse = 120;
    }

}