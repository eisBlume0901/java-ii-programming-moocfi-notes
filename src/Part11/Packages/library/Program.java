package Part11.Packages.library;

import Part11.Packages.library.domain.Book;
import Part11.Packages.library.ui.UserInterface;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Book book = new Book("the ABCs of packages!");
        System.out.println("Hello package library!" + book.getName());

        UserInterface ui = new UserInterface(new Scanner(System.in));
//        ui.printTitle();
        /*
        It does not work since it is outside the package library.ui
         */
    }
}
