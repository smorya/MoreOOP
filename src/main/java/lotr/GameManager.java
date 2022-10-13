package lotr;

public class GameManager {
    Character one = CharacterFactory.create
    public void fight(Character one, Character two){
        System.out.println("The first character is"  + one.toString());
        System.out.println("The second character is"  + two.toString());
        int counter = 1;
        while(one.isAlive() && two.isAlive()){
            System.out.println("The"+ counter +" round of fight");
            System.out.println(one.getClass()+ " hits"+ two.getClass());
            one.kick(one, two);
            System.out.println("The result is: \n"+one.getHp() + "\n"+ two.getHp());
            System.out.println(two.getClass()+ " hits"+ one.getClass());
            two.kick(two,one);
            System.out.println("The result is: \n"+one.getHp() + "\n"+ two.getHp());



        }

    }
}
