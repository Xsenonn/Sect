import java.lang.reflect.*;

/**
 * Created by User on 8/30/2017.
 */

public class Sect
{
    String deity;
    int food;
    int water;
    int believers;
    
    Sect(String God)
    {
        this.deity = God;
        int food = 500;
        int water = 500;
        int believers = 0;
    }


    public void eatFood(int ate)
    {
        this.food -= ate;
    }

    public void drinkWater(int drunk)
    {
       this.water -= drunk;
    }



}

