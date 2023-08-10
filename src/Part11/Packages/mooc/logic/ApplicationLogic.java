package Part11.Packages.mooc.logic;

import Part11.Packages.mooc.ui.UserInterface;

public class ApplicationLogic
{
    private UserInterface ui;

    public ApplicationLogic(UserInterface ui)
    {
        this.ui = ui;
    }

    public void execute(int times)
    {
        int n = times;
        while (n > 0)
        {
            System.out.println("Application logic is working");
            this.ui.update();
            n--;
        }
    }
}
