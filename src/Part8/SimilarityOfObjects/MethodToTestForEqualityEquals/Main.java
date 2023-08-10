package Part8.SimilarityOfObjects.MethodToTestForEqualityEquals;

public class Main
{
    public static void main(String[] args)
    {
        Book bookObject = new Book("Book object", 2000, "...");
        //1st part
        Book anotherBookObject = bookObject;

        if (bookObject.equals(anotherBookObject)) {
            System.out.println("The books are the same"); //This will be the output
        } else {
            System.out.println("The books aren't the same");
        }

        // we now create an object with the same content
        // that's nonetheless its own object

        //2nd part
        anotherBookObject = new Book("Book object", 2000, "...");

        if (bookObject.equals(anotherBookObject)) {
            System.out.println("The books are the same"); //This will be the updated output since we created a public boolean equals()
        } else {
            System.out.println("The books aren't the same"); //This will be the output
        }

        /* Have the same values
        "Book object", 2000, "..."

        1st part: compares the object than the values
        2nd part: compares the object than the values that is why it is considered as not the same
        because we created a new object.

        .equals() method works when two strings identical in content even if they are two
        separate objects. Therefore, create a userDefined function

        public boolean equals(Object comparedObject)
         */
    }
}
