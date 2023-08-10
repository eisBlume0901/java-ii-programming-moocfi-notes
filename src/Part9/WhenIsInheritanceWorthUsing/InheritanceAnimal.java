package Part9.WhenIsInheritanceWorthUsing;

public class InheritanceAnimal
{
    public void eat()
    {
        System.out.println("The animal is eating.");
    }

    /*
    public static void eat()

    Part12.ArrayListAndHashTable.Main class

    InheritanceAnimal.eat();
     */
}

class Dog extends InheritanceAnimal
{
    public void bark()
    {
        System.out.println("The dog is barking.");
    }
}

class Main1
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog();
        myDog.eat(); //The animal is eating
        myDog.bark(); //The dog is barking


    }
}
