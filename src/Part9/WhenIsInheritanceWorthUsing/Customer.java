package Part9.WhenIsInheritanceWorthUsing;

// Example of misusing inheritance
public class Customer
{
    private String name;
    private String address;

    public Customer(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public String getName()
    {
        return this.name;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}

class Order //extends Customer
    /* Why inheritance was misused?
    It breaks the single responsibility principle:
    the Order class is responsible both for maintaining the
    customer information and the order information


    Inheritance vs Referencing
    1. Inheritance - subclass extends or specializes the superclass by adding or modifying its
    own properties and behaviors. It promotes code reuse and helps to create a hierarchical relationship
    between classes
    2. Referencing - object of one class can hold a reference to an object of another class. The referenced
    object can be used to access its properties and methods, but it cannot be modified by the referencing
    object. It promotes modularity and helps to create a network of objects that work together to solve a problem
     */
{
    private Customer customer;
    private String product;
    private String count;

    /* Misused inheritance
    public Order(String product, String count, String name, String address)
    {
        super(name, address);
        this.product = product;
        this.count = count;
    }
    */

    //Better version since it references an object
    //The semantics of an order seems intuitive because an order has been placed by the customer
    public Order(Customer customer, String product, String count)
    {
        this.customer = customer;
        this.product = product;
        this.count = count;
    }
    public String getProduct()
    {
        return this.product;
    }

    public String getCount()
    {
        return this.count;
    }

    public String postalAddress()
    {
        return this.customer.getName() + "\n" + this.customer.getAddress();
    }
    /*
    public String postalAddress()
    {
        return this.getName() + "\n" + this.getAddress();
    }
     */
}
