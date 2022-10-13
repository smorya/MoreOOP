package lotr;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public abstract class Character{
    private int hp ;
    private int power;

    public void setHp(int hp){
        if (getHp() < 0){
            setHp(0);
        }
    }
    public boolean isAlive(){
        return getHp() > 0;
    }
    @Override
    public String toString(){
        return this.getClass() + "{hp=" + this.hp + ", power=" + this.power;
    }

    public abstract void kick(Character whoKick, Character whoIsKicked);
}

//

