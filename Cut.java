
public class Cut extends Skill{

    public Cut(int baseDMG){
        super("Cut :  30 MP");
        damage = (int)(baseDMG*2.3);
        mpUse = 30;
    }

}