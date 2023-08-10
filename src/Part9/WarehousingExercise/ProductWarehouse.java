package Part9.WarehousingExercise;

public class ProductWarehouse extends Warehouse
{
    private String productName;
    public ProductWarehouse(String productName, double capacity)
    {
        super(capacity, 0.0); //This should be declared first
        this.productName = productName;
//      super(capacity, 0.0); //Causes error when it is placed here
    }
    public String getName()
    {
        return this.productName;
    }

    public void setName(String newName)
    {
        this.productName = newName;
    }

    public String toString()
    {
        return this.productName + ": balance = " + getBalance() + ", space left " + howMuchSpaceLeft();
    }
}
