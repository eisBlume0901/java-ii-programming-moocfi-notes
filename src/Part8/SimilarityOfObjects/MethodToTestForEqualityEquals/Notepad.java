package Part8.SimilarityOfObjects.MethodToTestForEqualityEquals;

public class Notepad
{
    private String name;
    private int year;

    public Notepad(String name, int year)
    {
        this.name = name;
        this.year = year;
    }

    public boolean equals(Object object)
    {
        if (object == null || this.getClass() != this.getClass())
        {
            return false;
        }

        if (object == this)
        {
            return true;
        }

        Notepad compared = (Notepad) object;

        return this.name.equals(compared);
    }
}
