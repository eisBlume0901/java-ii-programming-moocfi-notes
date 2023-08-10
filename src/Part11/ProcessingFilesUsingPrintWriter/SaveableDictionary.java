package Part11.ProcessingFilesUsingPrintWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class SaveableDictionary
{
    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary()
    {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file)
    {
        this.file = file;
        this.dictionary = new HashMap<>();
    }

    public void add(String words, String translation)
    {
        if (!this.dictionary.containsKey(words))
            this.dictionary.put(words, translation);
    }

    public String translate(String word)
    {
        String result = null;
        for (Map.Entry<String, String> entry : this.dictionary.entrySet())
        {
            if (entry.getValue().equals(word))
                result = entry.getKey();
            if (entry.getKey().equals(word))
                result = entry.getValue();
        }
        return result;
    }

    public void delete(String word)
    {
        if (this.dictionary.containsKey(word))
            this.dictionary.remove(word);
        else
        {
            String remove = null;
            for (Map.Entry<String, String> entry : this.dictionary.entrySet())
                if (entry.getValue().equals(word))
                    remove = entry.getKey();
            this.dictionary.remove(remove);
        }
    }

    public boolean load()
    {
        boolean hasLoaded = false;
        try
        {
            Files.lines(Paths.get(this.file))
                    .map(line -> line.split(":"))
                    .filter(part -> part.length > 1)
                    .forEach(word -> add(word[0], word[1]));
            hasLoaded = true;
        }
        catch (IOException e)
        {
            hasLoaded = false;
            e.printStackTrace();
        }
        return hasLoaded;
    }


    public boolean save()
    {
        boolean hasSaved = false;
        try
        {
            PrintWriter writer = new PrintWriter(this.file);
            System.out.println("Word: ");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            System.out.println("Translation: ");
            String translation = scanner.nextLine();
            writer.println(word + ":" + translation);
            writer.close(); // Close the writer after writing all entries
            hasSaved = true;
        } catch (IOException e) {
            hasSaved = false;
            e.printStackTrace();
        }
        return hasSaved;
    }

    public Map<String, String> listOfWordsAndTranslation()
    {
        return this.dictionary;
    }
}

