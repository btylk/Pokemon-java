
public class Frogadier extends Player{

        public Frogadier(Player lastPlayer){
            super(lastPlayer.getName(), "Frogadier");
            maxHp = lastPlayer.getmaxHp()+1000;
            maxMp = lastPlayer.getmaxMp()+300;
            hp = maxHp;
            mp = maxMp;
            exp = lastPlayer.getexp();
            myDmg = lastPlayer.getDmg();
            level = lastPlayer.getlvl();
            myBag = lastPlayer.myBag;
            skills.add(new Cut(myDmg));
            skills.add(new WaterDrip(myDmg));
            playerPic = "Frogadier2.png";
            wincount = lastPlayer.getWinCount();
        }
}