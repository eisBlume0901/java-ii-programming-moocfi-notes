package Part9.BuiltInInterfacesListMapSetCollection.BestExampleOfOOPandCollections;

import java.util.*;
public class ShoppingCart
{
    // Encapsulate instance variable

    private Map<String, Item> shoppingList;
    // Constructor
    public ShoppingCart()
    {
        this.shoppingList = new HashMap<>();
    }

    // Methods
    public void add(String product, int price)
    {
        if (this.shoppingList.containsKey(product))
        {
            Item item = this.shoppingList.get(product);
            // We can store the object product from the object item too!
            // Map<Product, Item>
            // Map<Key,    Value>
            // this.shoppingList.get(product) has a String key then it retrieves the Item object.
            // We create an object variable (not a primitive one) so that we can store the value
            // this.shoppingList.get(product)
            item.increaseQuantity();
        }
        else
        {
            Item item = new Item(product, 1, price);
            this.shoppingList.put(product, item);

        }

        // Alternative Solution
//        this.items.putIfAbsent(product, new Item(product, 0, price));
//        this.items.get(product).increaseQuantity();
    }

    public int price()
    {
        int totalPrice = 0;
        for (Item object : this.shoppingList.values())
        {
            totalPrice += object.price();
        }
        return totalPrice;
    }

    public void print()
    {
        //  (Item item : this.shoppingList.values();
        for (String object : this.shoppingList.keySet())
        {
            System.out.println(this.shoppingList.get(object));
        }

    }
}
