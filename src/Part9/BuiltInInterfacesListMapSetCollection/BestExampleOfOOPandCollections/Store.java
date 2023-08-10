package Part9.BuiltInInterfacesListMapSetCollection.BestExampleOfOOPandCollections;

import java.util.*;
public class Store
{
    // Encapsulate instance variables
    private Warehouse warehouse;
    private Scanner scanner;

    // Constructor
    public Store(Warehouse warehouse, Scanner scanner)
    {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    // Method
    public void shop(String customer)
    {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection");

        for (String product : this.warehouse.products())
        {
            System.out.println(product);
        }

        while (true)
        {
            System.out.println("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();

            if (product.isEmpty())
            {
                break;
            }

            if (this.warehouse.stock(product) > 0)
            {
                cart.add(product, this.warehouse.price(product));
                this.warehouse.take(product);
            }
            else
            {
                System.out.println("There is no product available! ");
            }
        }

        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
