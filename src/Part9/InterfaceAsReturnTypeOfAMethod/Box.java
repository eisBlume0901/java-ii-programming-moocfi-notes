package Part9.InterfaceAsReturnTypeOfAMethod;

import java.util.*;

public class Box implements Packable{

    // Encapsulate instance variables
    private double maxCapacity;
    private ArrayList<Packable> itemsInBox;
    public Box(double maxCapacity)
    {
        this.maxCapacity = maxCapacity;
        this.itemsInBox = new ArrayList<>();
    }

    public void add(Packable itemsToPack)
    {
        if (this.weight() + itemsToPack.weight() <= this.maxCapacity)
        {
            this.itemsInBox.add(itemsToPack);
        }
    }
    @Override
    public double weight() {
        double totalWeight = 0.0;

        for (Packable e : itemsInBox)
        {
            totalWeight += e.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {

        return "Box: " + this.itemsInBox.size() + " items, total weight " + this.weight() + " kg";
    }
}
