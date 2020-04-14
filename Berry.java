
public class Berry extends Item{

    protected int forHP;
    protected int forMp;

    public Berry(){
        super("Berry");
        forHP = 25;
        forMp = 20;
    }
    
    public int getForHp(){
        return forHP;
    }

    public int getForMp(){
        return forMp;
    }
}