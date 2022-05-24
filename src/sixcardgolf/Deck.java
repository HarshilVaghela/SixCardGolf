package SixCardGolf;import java.util.Collections;
import java.util.ArrayList;
/**
 * Write a description of class Deck here.
 *
 * @author (Harshilkumar Vaghela,3116318)
 * @date (March 2,2020, ACS-1904, Assignment 2)
 */
public class Deck extends SetOfCards
{
    public Deck(){
        maximum=52;
        for(Suit s:Suit.values()){
            for(Face f:Face.values()){
                createCards(s,f);
            }
        }
    }

    private void createCards(Suit s,Face f){
        cards.add(new Card(s,f));
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public String evaluate(){
        return Integer.toString(cards.size());
    }

    public Card deal(){
        Card c=cards.get(0);
        cards.remove(c);
        return c;
    } 

}
