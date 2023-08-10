package Part10.EnumeratedTypeEnumAndIterator;

public class Main
{
    public static void main(String[] args)
    {
        Card first = new Card(10, Suit.HEART);

        System.out.println(first);

        if (first.getSuit() == Suit.SPADE)
            System.out.println("is a spade");
        else
            System.out.println("is not a spade");

        System.out.println(Suit.DIAMOND.ordinal()); // 0
        System.out.println(Suit.SPADE.ordinal()); // 1
        System.out.println(Suit.CLUB.ordinal()); // 2
        System.out.println(Suit.HEART.ordinal()); // 3

        /*
        Their order is the dependent on who you declared first.
         */

        Hand kateHand = new Hand();

        kateHand.add(new Card(5, Suit.SPADE));
        kateHand.add(new Card(8, Suit.HEART));
        kateHand.add(new Card(3, Suit.DIAMOND));
        kateHand.add(new Card(10, Suit.CLUB));

        System.out.println("\nCards in the hand: ");
        kateHand.print();

        kateHand.removeWorst(7);
        System.out.println("\nRemaining cards in the hand");
        kateHand.print();
    }
}
