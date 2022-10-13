package lotr;

public class Hobbit extends Character {

    public Hobbit() {
        super(3, 0);
    }

    @Override
    public void kick(Character whoIsKicked) {
        System.out.println("Don't beat me");
    }
}


