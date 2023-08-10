package Part9.ObjectPolymorphism;

public class Printer
{
    public void printManyTimes(Object object, int times)
    {
        int i = 0;
        while (i < times)
        {
            System.out.println(object.toString());
            i++;
        }
    }

    public void printCharacters(CharSequence charSequence)
    {
        int i = 0;
        while (i < charSequence.length())
        {
            System.out.println(charSequence.charAt(i));
            i++;
        }
    }
}
