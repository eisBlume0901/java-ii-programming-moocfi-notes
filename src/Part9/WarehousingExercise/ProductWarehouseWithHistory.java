package Part9.WarehousingExercise;

public class ProductWarehouseWithHistory extends ProductWarehouse
{
    private ChangeHistory historyListObj;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance)
    {
        super(productName, capacity);
        historyListObj = new ChangeHistory();

        // Set the initialBalance as the initial balance of the warehouse
        super.addToWarehouse(initialBalance);

        // Set the first value of the change history
        historyListObj.add(initialBalance);
    }

    public void addToWarehouse(double amount)
    {
        double result = 0.0;
        result = super.getBalance() + amount;
        // the result value since we wanted to record the changed state to the history
        historyListObj.add(result);
        // only add the amount to the Warehouse class
        super.addToWarehouse(amount);
    }

    public double takeFromWarehouse(double amount)
    {
        double result = 0.0;
        result = super.getBalance() - amount;
        historyListObj.add(result);
        return super.takeFromWarehouse(amount);
    }

    public String history()
    {
        return this.historyListObj.toString();
    }

    public void printAnalysis()
    {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + historyListObj.toString());
        System.out.println("Largest amount of product: " + historyListObj.maxValue());
        System.out.println("Smallest amount of product: " + historyListObj.minValue());
        System.out.println("Average: " + historyListObj.average());
    }
}
