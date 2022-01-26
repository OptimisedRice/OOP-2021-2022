package ie.tudublin;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");

        Animal misty = new Animal("Misty");
        Animal lucy = new Animal("Lucy");
        Cat ginger = new Cat("Ginger");
        while(ginger.getLives() > 0)
        {
            System.out.println(ginger.kill());
        }
        System.out.println(ginger.kill());

        lucy = misty;
        misty.setName("Tara");

        System.out.println(misty);
        System.out.println(lucy);

        // Tara Misty
        // Tara Tara
        
    }
}