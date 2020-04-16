
public class WaterDrip extends Skill{

    public WaterDrip(int baseDmg){
        super("Water Drip : 40 MP");
        damage = (int)(baseDmg*2.6);
        mpUse = 40;
    }

}