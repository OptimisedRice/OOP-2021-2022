package ie.tudublin;

public class Cat extends Animal
{
    private int numLives;

    public int getLives()
    {
        return numLives;
    }

    public String kill()
    {
        if (numLives > 0)
        {
            numLives = numLives - 1;
            return "Ouch!";
        }
        else if(numLives == 0)
        {
           return "Dead";
        }
        else
        {
            return "";
        }
    }
    public Cat(String name)
    {
        super(name);
        numLives = 9;
    }
}