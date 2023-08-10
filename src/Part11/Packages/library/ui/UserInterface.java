package Part11.Packages.library.ui;
import java.util.*;
public class UserInterface
{
    private Scanner scanner;

    public UserInterface(Scanner scanner)
    {
        this.scanner = scanner;
    }

    public void start()
    {
        printTitle();
        System.out.println("We are inside the library.ui");
    }

    void printTitle()
    /*
     It won't be used outside the class or any other package if its private
     It won't be used outside the package if its package-private (void)
     */
    {
        System.out.println("***********");
        System.out.println("* LIBRARY *");
        System.out.println("***********");
    }
}
