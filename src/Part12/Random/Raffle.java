package Part12.Random;
// https://www.baeldung.com/java-generating-random-numbers-in-range
import java.util.Random;

public class Raffle
{
    public static void main(String[] args)
    {
        Random ladyLuck = new Random();

        for (int i = 0; i < 10; i++)
        {
            int randomNumber = ladyLuck.nextInt(10);
            // nextInt(0-10)
            System.out.println(randomNumber);
        }

        System.out.println();
        Random weatherMan = new Random();
        int temperature = weatherMan.nextInt(81) - 30;
        System.out.println(temperature);
    }
}
