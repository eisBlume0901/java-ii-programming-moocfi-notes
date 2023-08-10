package Part9.InheritanceQuiz;

public class Counter
{
    public int addToNumber(int number)
    {
        return number + 1;
    }

    public int subtractFromNumber(int number)
    {
        return number - 1;
    }
}

class SuperCounter extends Counter
{
    @Override
    public int addToNumber(int number)
    {
        return number + 5;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Counter counter = new Counter();
        Counter superCounter = new SuperCounter();
        int number = 3;
        number = superCounter.subtractFromNumber(number);
        System.out.println(number); // 3 - 1 = 2

        number = superCounter.subtractFromNumber(number);
        System.out.println(number); // 2 - 1 = 1

        number = counter.addToNumber(number);
        System.out.println(number); // 1 + 1 = 2
    }
}