package Part9.BuiltInInterfacesListMapSetCollection.BestExampleOfOOPandCollections;

public class Item
{
    // Encapsulate instance variable
    private String product;
    private int qty;
    private int unitPrice;

    // Constructor
    public Item(String product, int qty, int unitPrice)
    {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Methods
    public int price()
    {
        return this.unitPrice * this.qty;
    }

    public void increaseQuantity()
    {
        this.qty++;
    }

    @Override
    public String toString()
    {
        return this.product + ": " + this.qty;
    }
}
