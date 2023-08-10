package Part9.BuiltInInterfacesListMapSetCollection.BestExampleOfOOPandCollections;

import java.util.*;
public class Warehouse
{
    // Encapsulate instance variables
    private Map<String, Integer> productList;
    private Map<String, Integer> stockList;

    // Constructor
    public Warehouse()
    {
        this.productList = new HashMap<>();
        this.stockList = new HashMap<>();
    }

    // Methods
    public void addProduct(String product, int price, int stock)
    {
        this.productList.put(product, price);
        this.stockList.put(product, stock);
    }

    public int price(String product)
    {
        if (this.productList.containsKey(product))
        {
            return this.productList.get(product);
        }
        return -99;

        // Alternative solution
//        return this.productList.getOrDefault(product, -99);

    }

    public int stock(String product)
    {
        if (this.stockList.containsKey(product))
        {
            return this.stockList.get(product);
        }
        return 0;

        // Alternative solution
//        return this.stockList.getOrDefault(product, 0);
    }

    public boolean take(String product)
    {
        if (this.stockList.containsKey(product))
        {

            int currentStock = this.stockList.get(product);
            // Map<Product, Integer>
            // Map<Key,     Value>
            // the this.stockList.get
            if (currentStock > 0)
            {
                currentStock--;

                this.stockList.put(product, currentStock);
                return true;
            }
        }
        return false;

        // Alternative solution
//        if (!this.stockList.containsKey(product)) {
//            return false;
//        }
//
//        int stock = this.stockList.get(product);
//        if (stock <= 0) {
//            return false;
//        }
//
//        this.stockList.put(product, stock - 1);
//        return true;
    }

    public Set<String> products()
    {
        return this.productList.keySet();
    }

}
