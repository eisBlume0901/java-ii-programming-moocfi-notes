package Part12.TypeParameters;
// Using the Generic List interface version 1
public class MovieList implements List<Movie>
{
    private List<Movie> movieList;

    public MovieList(List<Movie> movieList)
    {
        this.movieList = movieList;
    }

    @Override
    public void add(Movie value)
    {
        this.movieList.add(value);
    }

    @Override
    public Movie get(int index)
    {
        return this.movieList.get(index);
    }

    @Override
    public Movie remove(int index)
    {
        Movie value = this.movieList.get(index);
        this.movieList.remove(index);
        return value;
    }
}
