package Part12.MultidimensionalData.MagicSquare;

public class Program
{
    public static void main(String[] args)
    {
        // Test the MagicSquare class here

        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(3));

        MagicSquare threeByThree = new MagicSquare(3);
        System.out.println();
        threeByThree.placeValue(0, 0, 8);
        threeByThree.placeValue(1, 0, 1);
        threeByThree.placeValue(2, 0, 6);
        threeByThree.placeValue(0, 1, 3);
        threeByThree.placeValue(1, 1, 5);
        threeByThree.placeValue(2, 1, 7);
        threeByThree.placeValue(0, 2, 4);
        threeByThree.placeValue(1, 2, 9);
        threeByThree.placeValue(2, 2, 2);
        System.out.println(threeByThree);

        System.out.println(threeByThree.sumsOfRows());
        System.out.println(threeByThree.sumsOfColumns());
        System.out.println(threeByThree.sumsOfDiagonals());

        MagicSquare notMagicSquare = new MagicSquare(3);
        System.out.println();
        notMagicSquare.placeValue(0, 0, 1);
        notMagicSquare.placeValue(1, 0, 2);
        notMagicSquare.placeValue(2, 0, 3);
        notMagicSquare.placeValue(0, 1, 4);
        notMagicSquare.placeValue(1, 1, 5);
        notMagicSquare.placeValue(2, 1, 6);
        notMagicSquare.placeValue(0, 2, 7);
        notMagicSquare.placeValue(1, 2, 8);
        notMagicSquare.placeValue(2, 2, 9);
        System.out.println(notMagicSquare);

        System.out.println(notMagicSquare.sumsOfRows());
        System.out.println(notMagicSquare.sumsOfColumns());
        System.out.println(notMagicSquare.sumsOfDiagonals());
    }
}
