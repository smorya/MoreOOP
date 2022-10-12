package lotr;
import java.util.Random;

public class NobleKick {
    public void kick(Character whoKick, Character whoIsKicked) {
        whoIsKicked.setHp(whoIsKicked.getHp() - new Random().nextInt(whoKick.getPower()));

    }
}
