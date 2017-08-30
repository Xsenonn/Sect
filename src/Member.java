/**
 * Created by User on 8/30/2017.
 */

public class Member
{
    String Name;
    int HP;
    int Stamina;
    int Faith;
    int Hunger;

    Member(String name)
    {
        this.Name = name;
        HP = 100;
        Stamina = 100;
        Faith = 100;
        Hunger = 0;
    }

    public int getFaith() {
        return Faith;
    }

    public int getHP() {
        return HP;
    }

    public int getHunger() {
        return Hunger;
    }

    public int getStamina() {
        return Stamina;
    }


}

