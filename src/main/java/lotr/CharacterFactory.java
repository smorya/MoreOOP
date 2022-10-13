package lotr;
import java.util.Random;
public class CharacterFactory {
    public Object createCharacter() {
        Class[] characters = {Hobbit.class, King.class, Elf.class, Knight.class};
        int random = new Random().nextInt(characters.length);
//        if (random == 0){
//            return new Hobbit();
//        }else if (random == 1) {
//            return new King();
//        } else if (random == 2) {
//            return new Elf();
//        } else if (random == 3) {
//            return new Knight();
//        }
//        return null;
        switch (random) {
            case 0:
                return new Hobbit();
            case 1:
                return new King();
            case 2:
                return new Elf();

            default:
                return new Knight();
        }


    }


}




