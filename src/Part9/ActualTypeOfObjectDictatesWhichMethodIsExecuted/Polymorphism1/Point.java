package Part9.ActualTypeOfObjectDictatesWhichMethodIsExecuted.Polymorphism1;

import java.util.ArrayList;

public class Point
{
    private final int x;
    private final int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int manhattanDistanceFromOrigin()
    {
        return Math.abs(x) + Math.abs(y);
    }

    protected String location()
    {
        return x + ", " + y;
    }

    @Override
    public String toString()
    {
        return "(" + this.location() + ") distance " + this.manhattanDistanceFromOrigin();
    }
}

class ColorPoint extends Point
    // identical to a point but it only contains a color that is expressed as a string
    // due to similarity, we can create a new class by extending the class Point.
{
    private final String color;

    public ColorPoint(int x, int y, String color)
    {
        super(x, y);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " color: " + color;
        /* super.toString() method calls the toString method of the superclass.

        @Override
        public String toString()
        {
            return "(" + this.location() + ") distance " + this.manhattanDistanceFromOrigin();
        }
         */
    }
}

class Main
{
    public static void main(String[] args)
    {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(4, 8));
        points.add(new ColorPoint(1, 1, "green"));
        points.add(new ColorPoint(2, 5, "blue"));
        points.add(new Point3D(5, 2, 8));
        points.add(new Point(0, 0));


        for (Point p: points)
        {
            System.out.println(p);
        }
        /*
        (4, 8) distance 12
        (1, 1) distance 2 color: green
        (2, 5) distance 7 color: blue
        (5, 2, 8) distance 15
        (0, 0) distance 0
         */
    }
}

class Point3D extends Point
{
    private final int z;

    public Point3D(int x, int y, int z)
    {
        super(x, y);
        this.z = z;
    }

    @Override
    protected String location()
    {
        return super.location() + ", " + this.z;
    }

    @Override
    public int manhattanDistanceFromOrigin()
    {
        return super.manhattanDistanceFromOrigin() + Math.abs(this.z);
    }
}