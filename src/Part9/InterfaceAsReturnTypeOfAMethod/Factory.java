package Part9.InterfaceAsReturnTypeOfAMethod;

import java.util.*;
public class Factory {

    public Factory()
    {
        // Note that there is no need to write an empty constructor without
        // parameters if the class doesn't have other constructors.
        // In these cases Java automatically creates a default constructor for
        // the class which is an empty constructor without parameters.
    }

    public Packable produceNew()
    {
        // The Random-object used here can be used to draw random numbers.
        Random ticket = new Random();
        // Draws a number from the range [0, 5). The number will be 0, 1, 2, 3, or 4.
        int number = ticket.nextInt(5);

        if (number == 0)
        {
            return new CD("AURORA", "Running With The Wolves", 2015);
        }
        else if (number == 1)
        {
            return new CD("Aimer", "Akane Sasu", 2016);
        }
        else if (number == 2)
        {
            return new Book("Diana Wynne Jones", "Howl's Moving Castle", 1986);
        }
        else if (number == 3)
        {
            return new Book("J.R.R. Tolkien","The Lord of the Rings", 1937);
        }
        else
        {
            return new ChocolateBar();
        }
    }
}
