package Part10.EnumeratedTypeEnumAndIterator.BestExample;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // test your code here

        Card first = new Card(2, Suit.DIAMOND);
        Card second = new Card(14, Suit.SPADE);
        Card third = new Card(12, Suit.HEART);

        System.out.println(first); // DIAMOND 2
        System.out.println(second); // SPADE A
        System.out.println(third); // HEART Q

        Hand hand = new Hand();

        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sort();
        hand.print();
        /* Expected output:
        DIAMOND 2
        SPADE 2
        HEART Q
        SPADE A
         */

        Hand hand1 = new Hand();

        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(2, Suit.SPADE));

        Hand hand2 = new Hand();

        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));

        int comparison = hand1.compareTo(hand2);
        if (comparison < 0) {
            System.out.println("better hand is");
            hand2.print();
        } else if (comparison > 0){
            System.out.println("better hand is");
            hand1.print();
        } else {
            System.out.println("hands are equal");
        }

        ArrayList<Card> cards = new ArrayList<>();

        cards.add(new Card(3, Suit.SPADE));
        cards.add(new Card(2, Suit.DIAMOND));
        cards.add(new Card(14, Suit.SPADE));
        cards.add(new Card(12, Suit.HEART));
        cards.add(new Card(2, Suit.SPADE));

        BySuitInValueOrder sortBySuitSorter = new BySuitInValueOrder();
        Collections.sort(cards, sortBySuitSorter);

        cards.stream().forEach(c -> System.out.println(c));
        /* Expected output
        DIAMOND 2
        HEART Q
        SPADE 3
        SPADE A
        SPADE 2
         */

        // Version 2 Using Collections.sort method, using lambda without creating a Comparator interface
        Collections.sort(cards, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());

        Hand hand3 = new Hand();

        hand3.add(new Card(12, Suit.HEART));
        hand3.add(new Card(4, Suit.SPADE));
        hand3.add(new Card(2, Suit.DIAMOND));
        hand3.add(new Card(14, Suit.SPADE));
        hand3.add(new Card(7, Suit.HEART));
        hand3.add(new Card(2, Suit.SPADE));

        hand3.print();

        hand3.sortBySuit();

        System.out.println("\nSorted by Suit");
        hand3.print();

    }
}
