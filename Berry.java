
public class Berry extends Item{

    protected int forHP;
    protected int forMp;
    Player player;
    public Berry(){
        super("Berry");
        forHP = 200;
        forMp = 160;
    }
    
    public int getForHp(){
        return forHP;
    }

    public int getForMp(){
        return forMp;
    }
}