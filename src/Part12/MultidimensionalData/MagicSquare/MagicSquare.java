package Part12.MultidimensionalData.MagicSquare;
import java.util.*;
public class MagicSquare
{
    private int[][] square;

    public MagicSquare(int size)
    {
        if (size < 2)
            size = 2;

        this.square = new int[size][size];
    }

    public int getWidth()
    {
        return this.square.length;
    }

    public int getHeight()
    {
        return this.square.length;
    }
    public ArrayList<Integer> sumsOfRows()
    {
        ArrayList<Integer> sumsOfRows = new ArrayList<>();
        for (int row = 0; row < square.length; row++)
        {
            int total = 0;
            // This should be inside the for loop so that it would keep being overridden per each row execution
            for (int col = 0; col < square[row].length; col++)
            {
                total += readValue(col, row);
                // The read value is flipped which is col, row. It starts 0,0 -> 1,0, -> 2,0
                // this.square[y][x] originally y = row and x = col. Per row is vertically
                // Row pattern:     0 0 0 1 1 1 2 2 2
                // Column pattern:  0 1 2 0 1 2 0 1 2
            }
            sumsOfRows.add(total);
        }
        return sumsOfRows;
    }

    public ArrayList<Integer> sumsOfColumns()
    {
        ArrayList<Integer> sumsOfColumns = new ArrayList<>();
        for (int row = 0; row < square.length; row++)
        {
            int total = 0;
            // This should be inside the for loop so that it would keep being overridden per each row execution
            for (int col = 0; col < square[row].length; col++)
            {
                total += readValue(row, col);
                // The read value is flipped which is row, col. It starts 0,0 -> 0,1 -> 0,2
                // this.square[y][x] originally y = row and x = col. Per column is horizontally
                // Row pattern:     0 0 0 1 1 1 2 2 2
                // Column pattern:  0 1 2 0 1 2 0 1 2
            }
            sumsOfColumns.add(total);
        }
        return sumsOfColumns;
    }

    public ArrayList<Integer> sumsOfDiagonals()
    {
        ArrayList<Integer> sumsOfDiagonals = new ArrayList<>();
        int principal = 0, secondary = 0;
        /*
        Principal diagonal runs from upper left to the lower right.
        Entries of a[i][j] where i = j.
        Secondary diagonal runs from lower left to the upper right.
        Entries of a[i][j] where (i + j) = matrix.length - 1
         */
        for (int row = 0; row < square.length; row++)
            for (int col = 0; col < square[row].length; col++)
            {
                if (row == col)
                    principal += readValue(row, col);
                if ((row + col) == square.length - 1)
                    secondary += readValue(row, col);
            }
        sumsOfDiagonals.add(principal);
        sumsOfDiagonals.add(secondary);
        return sumsOfDiagonals;
    }

    public boolean isMagicSquare()
    {
        return false;
    }

    public ArrayList<Integer> giveAllNumbers()
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++)
            for (int col = 0; col < square[row].length; col++)
                numbers.add(square[row][col]);
        return numbers;
    }

    public boolean allNumbersDifferent()
    {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++)
            if (numbers.get(i - 1) == numbers.get(i))
                return false;
        return true;
    }

    public boolean sumsAreSame()
    {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3)
            return false;

        for (int i = 1; i < sums.size(); i++)
            if (sums.get(i - 1) != sums.get(i))
                return false;

        return true;
    }

    public int readValue(int x, int y)
    {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight())
            return -1;

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value)
    {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight())
            return;

         this.square[y][x] = value;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++)
        {
            for (int col = 0; col < square[row].length; col++)
            {
                result.append(square[row][col]).append("\t");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
