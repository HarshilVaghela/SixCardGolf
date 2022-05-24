package SixCardGolf;
import java.util.ArrayList;
/**
 * Abstract class SetOfCards - write a description of the class here
 *
 * @author (Harshilkumar Vaghela,3116318)
 * @date (March 2,2020, ACS-1904, Assignment 2)
 */
public abstract class SetOfCards
{   protected ArrayList<Card> cards;
    protected int maximum;
    public SetOfCards(){
        cards=new ArrayList<>();
        maximum=0;
    }

    public SetOfCards(ArrayList<Card> c,int m)
    {
        cards=c;
        maximum=m;
    }

    public ArrayList getCards(){
        return cards;
    }

    public void setCards(ArrayList<Card> c){
        cards=c;
    }

    public void addCard(Card c){
        if (cards.size()<maximum)
            cards.add(c);
    }

    public abstract String evaluate();

    public String toString(){
        StringBuilder b=new StringBuilder();
        for (int i=0;i<cards.size()-1;i++){
            b.append(cards.get(i)+" ");
        }
        b.append(cards.get(cards.size()-1));
        return "["+b+"]";
    }
}
