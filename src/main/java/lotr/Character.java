package lotr;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public abstract class Character{
    private int hp ;
    private int power;

    public void setHp(int number){
        if (number<=0 || getHp()-number <0){
            hp = 0;
        }
    }
    public boolean isAlive(){
        return getHp() > 0;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + this.hp + ", power=" + this.power + "}";
    }

    public abstract void kick(Character whoIsKicked);
}

//

