package Part10.EnumeratedTypeEnumAndIterator.BestExample;

import java.util.*;
public class Hand implements Comparable<Hand>
{
    List<Card> cardList;
    public Hand()
    {
        this.cardList = new ArrayList<>();
    }

    public void add(Card card)
    {
        this.cardList.add(card);
    }

    public void print()
    {
        Iterator<Card> iterator = this.cardList.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    public void sort()
    {
        // Version 1: sort, without implementing Comparable interface since we declare the operation to be used within
        // the stream pipeline
//        this.cardList
//                .sort( (c1, c2) ->
//                {
//                    if (c1.getValue() == c2.getValue())
//                        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
//                    return c1.getValue() - c2.getValue();
//                });

        // Version 2: sort, method reference, implement Comparable interface
//        this.cardList
//                .sort(Card::compareTo);

        // Version 3: sort, lambda expression, implement Comparable interface
        this.cardList
                .sort((c1, c2) ->
                {
                    return c1.compareTo(c2);
                });
    }

    // implementing Comparator interface
//    public int compare(Hand h1, Hand h2)
//    {
//        return h1.cardList.stream().mapToInt(card -> card.getValue()).sum() -
//                h2.cardList.stream().mapToInt(card -> card.getValue()).sum();
//    }

    // implementing Comparable interface
    @Override
    public int compareTo(Hand hand)
    {
        return this.cardList.stream().mapToInt(card -> card.getValue()).sum() -
                hand.cardList.stream().mapToInt(card -> card.getValue()).sum();
    }

    public void sortBySuit()
    {
        this.cardList
                .sort( (c1, c2) ->
                {
                    if (c1.getSuit() == c2.getSuit())
                        return c1.getValue() - c1.getValue();
                    return new BySuitInValueOrder().compare(c1, c2);
                });
    }
}
