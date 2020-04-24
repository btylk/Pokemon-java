
public class WaterDrip extends Skill{

    public WaterDrip(int baseDmg){
        super("Water Drip : 160 MP");
        damage = (int)(baseDmg*2.6);
        mpUse = 160;
    }

}