package lotr;

public class ElfKick implements BasicKick{

    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoKick.getPower() > whoIsKicked.getPower()){
            whoIsKicked.setHp(0);
        }else{
            whoKick.setHp(whoKick.getHp()-1);
        }
    }

}
