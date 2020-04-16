
public class DarkPulse extends Skill{

    public DarkPulse(int baseDMG){
        super("Dark Pulse : 55 MP");
        damage = (int)(baseDMG*3.5);
        mpUse = 55;
    }

}