package Part11.Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Grade kateGrade = new Grade(6);
        readNumber();

        List<String> lines = new ArrayList<>();
        try (Scanner reader = new Scanner(new File("file.txt")))
        {
            while (reader.hasNextLine())
                lines.add(reader.nextLine());
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }

    public static int readNumber()
    {
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give a number: ");
            try
            {
                int num = Integer.parseInt(scanner.nextLine());
                System.out.println("Valid input. It is a number!");
                return num;
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Please input numbers only.");
            }
        }
    }
}
