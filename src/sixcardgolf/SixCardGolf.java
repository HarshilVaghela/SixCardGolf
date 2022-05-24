package SixCardGolf;
/**
 * Write a description of class SixCardGolf here.
 *
 * @author (Harshilkumar Vaghela,3116318)
 * @date (March 2,2020, ACS-1904, Assignment 2)
 */
public class SixCardGolf
{
    public static void main(String[] args){
        Deck deck=new Deck();
        deck.shuffle();
        Hand hand1=new Hand();
        for(int i=0;i<6;i++){
            Card c=deck.deal();
            hand1.addCard(c);
        }
        Hand hand2=new Hand();
        for(int i=0;i<6;i++){
            Card c=deck.deal();
            hand2.addCard(c);
        }
        Hand hand3=new Hand();
        for(int i=0;i<6;i++){
            Card c=deck.deal();
            hand3.addCard(c);
        }
        Hand hand4=new Hand();
        for(int i=0;i<6;i++){
            Card c=deck.deal();
            hand4.addCard(c);
        }
        System.out.println("\nPlayer 1:\n"+hand1+"\nScore: "+hand1.evaluate());
        System.out.println("\nPlayer 2:\n"+hand2+"\nScore: "+hand2.evaluate());
        System.out.println("\nPlayer 3:\n"+hand3+"\nScore: "+hand3.evaluate());
        System.out.println("\nPlayer 4:\n"+hand4+"\nScore: "+hand4.evaluate());
        System.out.println("\nNumber of Cards remaining in the deck: "+deck.evaluate());

    }
}
