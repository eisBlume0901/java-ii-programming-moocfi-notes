package Part10.TheComparableInterface;

public class Member implements Comparable<Member>
{
    private String name;
    private int height;

    public Member(String name, int height)
    {
        this.name = name;
        this.height = height;
    }

    // Getters
    public String getName()
    {
        return this.name;
    }

    public int getHeight()
    {
        return this.height;
    }

    @Override
    public String toString()
    {
        return this.name + " (" + this.height + ")";
    }

    @Override
    public int compareTo(Member member)
    {
        // Alternative version
//        if (this.height == member.height)
//        {
//            return 0;
//        }
//        else if (this.height > member.height)
//        {
//            return 1;
//        }
//        else
//        {
//            return -1;
//        }
        return this.height - member.height;
    }
}
