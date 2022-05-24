package SixCardGolf;
/**
 * Write a description of class Card here.
 *
 * @author (Harshilkumar Vaghela,3116318)
 * @date (March 2,2020, ACS-1904, Assignment 2)
 */
public class Card
{
    private Suit suit;
    private Face face;
    public Card(Suit s,Face f){
        suit=s;
        face=f;
    }

    public Suit getSuit(){
        return suit;
    }

    public Face getFace(){
        return face;
    }

    public String toString(){
        return face.getDisplay()+suit.getDisplay();
    }
}
