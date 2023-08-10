package Part10.EnumeratedTypeEnumAndIterator;

import java.util.*;
public class Hand
{
    // Encapsulate instance variables
    private List<Card> cards;

    public Hand()
    {
        this.cards = new ArrayList<>();
    }
    public void add(Card card)
    {
        this.cards.add(card);
    }

    public void print()
    {
        // Using lambda expressions
//        this.cards
//                .stream()
//                .forEach(System.out::println);

        // Using Iterator interface implemented by the Collection interface
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext())
        {
            Card nextInLine = iterator.next();
            // Iterator next method can also be stored in a variable
            System.out.println(nextInLine);
        }
    }

    public void removeWorst(int value)
    {
        /*
        Using lambda expressions could result to ConcurrentModificationException
        - object is modified while it is being iterated over which lead to potential
        data corruption

        forEach does not allow modification while iteration/traversion
         */


//        this.cards
//                .stream()
//                .forEach(card ->
//                        {
//                            if (card.getValue() < value) this.cards.remove(card);
//                        });

        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext())
            if (iterator.next().getValue() < value)
                iterator.remove();


        for (int i = this.cards.size() - 1; i >= 0; i--)
            if (this.cards.get(i).getValue() < value)
                this.cards.remove(this.cards.get(i));
    }
}
