
public class ShurikenFlurry extends Skill{

    public ShurikenFlurry(int baseDMG){
        super("Shuriken : 70 MP");
        damage = (int)(baseDMG*5);
        mpUse = 70;
    }

}