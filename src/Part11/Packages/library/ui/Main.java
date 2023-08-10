package Part11.Packages.library.ui;
import Part11.Packages.library.ui.UserInterface;

import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        UserInterface ui = new UserInterface(new Scanner(System.in));
        ui.printTitle();
    }
}
