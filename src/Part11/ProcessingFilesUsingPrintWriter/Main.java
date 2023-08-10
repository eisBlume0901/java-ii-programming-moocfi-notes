package Part11.ProcessingFilesUsingPrintWriter;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Main
{
    public static void main(String[] args) /* throws IOException */
    {

        SaveableDictionary d = new SaveableDictionary("GermanToEnglish");
        d.save();
        System.out.println(d.listOfWordsAndTranslation());

        d.load();
        System.out.println(d.listOfWordsAndTranslation());
//        writeToFile("File", "PrintWriter is amazing");
        // File should be outside the src folder to work

        // Version 2
//        Scanner scanner = new Scanner(System.in);
//        String file = scanner.nextLine();
//        try
//        {
//            PrintWriter writer = new PrintWriter(file);
//            String text = scanner.nextLine();
//            writer.println(text);
//            writer.close();
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }

    }

    // Version 1
    public static void writeToFile(String fileName, String text) throws IOException
    {
        PrintWriter writer = new PrintWriter(fileName);
        writer.println(text);
        writer.close();
    }
}
