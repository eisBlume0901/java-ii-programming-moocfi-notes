package Part11.Exceptions;

public class Grade
{
    private int grade;
    public Grade(int grade)
    {
        try
        {
            this.grade = grade;
            if (grade < 0 || grade > 5)
                throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Grade must be between 0 and 5");
        }

        // Alternative version
        if (grade < 0 || grade > 5)
            throw new IllegalArgumentException("Grade must be between 0 and 5.");
        this.grade = grade;
    }

    public int getGrade()
    {
        return this.grade;
    }
}
