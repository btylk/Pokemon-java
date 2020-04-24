
public class ShurikenFlurry extends Skill{

    public ShurikenFlurry(int baseDMG){
        super("Shuriken : 550 MP");
        damage = (int)(baseDMG*5);
        mpUse = 550;
    }

}