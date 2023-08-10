package Part9.InterfaceAsReturnTypeOfAMethod;

public class Packer
{
    private Factory factory;

    private int itemCount;
    public Packer(int itemCount)
    {
        this.factory = new Factory();
        this.itemCount = itemCount;
    }

    public Box giveABoxOfThings()
    {
        Box box = new Box(this.itemCount);

        int i = 0;
        while (i < this.itemCount)
        {
            // Interface cannot be instantiated because it represents
            // a contract or set of behaviors that a class should
            // implement
            Packable newThing = factory.produceNew();
            //factory.produceNew() returns an object of a class that
            // implements the Packable interface
            box.add(newThing);
        }

        return box;
    }

    @Override
    public String toString() {
        return factory.toString();
    }
}
