package lotr;

public class Elf extends Character{
    public Elf(){
        super(10, 10);
    }

    public void kick(Character whoKick, Character whoIsKicked) {
        ElfKick elfKick = new ElfKick();
        elfKick.kick(whoKick ,whoIsKicked);
    }
//
}



