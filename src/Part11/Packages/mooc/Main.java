package Part11.Packages.mooc;

import Part11.Packages.mooc.logic.ApplicationLogic;
import Part11.Packages.mooc.ui.TextInterface;
import Part11.Packages.mooc.ui.UserInterface;

public class Main
{
    public static void main(String[] args)
    {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
        /* Expected output:
        Application logic is working
        Updating UI
        Application logic is working
        Updating UI
        Application logic is working
        Updating UI
         */
    }
}
