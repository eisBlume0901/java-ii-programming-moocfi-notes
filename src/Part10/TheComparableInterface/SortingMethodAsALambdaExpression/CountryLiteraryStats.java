package Part10.TheComparableInterface.SortingMethodAsALambdaExpression;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CountryLiteraryStats implements Comparable<CountryLiteraryStats>
{
    private String country;
    private int year;
    private float literacyPercent;
    private Gender gender;
    public enum Gender
    {
        male, female;
    }

    public CountryLiteraryStats(Gender gender, String country, int year, float literacyPercent)
    {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    // Getters
    public float getLiteracyPercent()
    {
        return this.literacyPercent;
    }

    public Gender getGender()
    {
        return this.gender;
    }

    // Setter

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    @Override
    public String toString()
    {
        return this.country + " (" + this.year + ")" + ", " + this.gender + ", " + this.literacyPercent;
    }

    @Override
    public int compareTo(CountryLiteraryStats o)
    {
        return Float.compare(this.literacyPercent, o.literacyPercent);
    }

    public static void main(String[] args)
    {
        File file = new File("Literacy");
        String fileAbsolutePath = String.valueOf(file.getAbsoluteFile());
        System.out.println(fileAbsolutePath);
        List<String> rows = new ArrayList<>();
        List<CountryLiteraryStats> stats = new ArrayList<>();
        try
        {
            Files.lines(Paths.get(fileAbsolutePath))
                    .map(data -> data.split(","))
                    .filter(parts -> parts[2].contains("male"))
                    .map(parts -> new CountryLiteraryStats(Gender.female, parts[3], Integer.parseInt(parts[4]), Float.parseFloat(parts[5])))
                    .forEach(data -> stats.add(data));


            stats.sort(Comparator.comparingDouble(Person -> Person.getLiteracyPercent()));
            // Version 1: stream, sorted but does not implement comparable interface since you declare the operator to be used
            // forEach
//            stats
//                    .stream()
//                    .sorted( (c1, c2) ->
//                    {
//                        return Float.compare(c1.literacyPercent, c2.literacyPercent);
//                    })
//                    .forEach(data -> System.out.println(data));

            // Version 2: sort, implement Comparator Interface and override compareTo
//            stats
//                    .sort(CountryLiteraryStats::compareTo); // Method reference
//            stats
//                    .forEach(data -> System.out.println(data));
            // Version 3: Lambda version of Version 2
//            stats
//                    .sort((d1, d2) ->
//                    {
//                        return d1.compareTo(d2);
//                    });
//            stats
//                    .forEach(data -> System.out.println(data));
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
