
public class NormalAttack extends Skill{

    public NormalAttack(int baseDMG){
        super("Normal Attack : 15 MP");
        damage = (int)(baseDMG*1.5);
        mpUse = 15;
    }

}