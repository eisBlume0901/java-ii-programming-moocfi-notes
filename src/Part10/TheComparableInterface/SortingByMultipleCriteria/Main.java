package Part10.TheComparableInterface.SortingByMultipleCriteria;
import java.util.*;

import static java.lang.System.*;

public class Main
{
    public static void main(String[] args)
    {
        List<Film> films = new ArrayList<>();
        films.add(new Film ("Violet Evergarden Movie", 2020));
        films.add(new Film ("Sen to Chihiro no Kamikakushi", 2001));
        films.add(new Film ("Howl no Ugoku Shiro", 2004));
        films.add(new Film ("Made in Abyss Movie 3: Fukaki Tamashii no Reimei", 2020));

        for (Film f : films)
            out.println(f);

        Comparator<Film> comparator = Comparator
                .comparing(Film::getReleaseYear)
                .thenComparing(Film::getName);

        Collections.sort(films, comparator);

        out.println();
        out.println("Sorted Films");
        for (Film f : films)
            out.println(f);


        List<Film> letterFilms = new ArrayList<>();
        letterFilms.add(new Film ("A", 2000));
        letterFilms.add(new Film ("B", 1999));
        letterFilms.add(new Film ("C", 2001));
        letterFilms.add(new Film ("D", 2000));

        out.println();
        for (Film f : letterFilms)
            out.println(f);

        Collections.sort(letterFilms, comparator);

        out.println();
        out.println("Sorted letter films");
        for (Film f : letterFilms)
            out.println(f);



        out.println();
        out.println("Sorted letter films (1)"); // It does not compare and sort properly
        letterFilms
                .stream()
                .sorted((l1, l2) ->
                {
                    return l1.getReleaseYear() - l2.getReleaseYear();
                })
                .sorted((l1, l2) ->
                {
                    return l1.getName().compareTo(l2.getName());
                })
                .forEach(f -> out.println(f));

        out.println();
        out.println("Sorted letter films (2)"); // It does sort one criterion only
        letterFilms
                .sort( (l1, l2) ->
                {
                    return l1.getReleaseYear() - l2.getReleaseYear();
                });

        for (Film f : letterFilms)
            out.println(f);


        out.println("Sorted letter films (3)"); // It does sort one criterion only
        letterFilms
                .sort( (l1, l2) ->
                {
                    return l1.getName().compareTo(l2.getName());
                });

        for (Film f : letterFilms)
            out.println(f);


    }
}
