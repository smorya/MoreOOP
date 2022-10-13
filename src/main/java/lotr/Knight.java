package lotr;

import java.util.Random;

public class Knight extends Character {
    public Knight() {
        super(new Random().nextInt(13) + 2, new Random().nextInt(13) + 2);
    }

    public void kick(Character whoIsKicked) {
        NobleKick nobleKick = new NobleKick();
        nobleKick.kick(this ,whoIsKicked);

    }
}



