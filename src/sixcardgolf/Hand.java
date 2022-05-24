package SixCardGolf;
import java.util.ArrayList;
/**
 * Write a description of class Hand here.
 *
 * @author (Harshilkumar Vaghela,3116318)
 * @date (March 2,2020, ACS-1904, Assignment 2)
 */
public class Hand extends SetOfCards
{
    public Hand(){
        maximum=6;
    }

    public Hand(ArrayList<Card> c,int m){
        super(c,m);
    }

    public String evaluate(){int sum=0;
        for(int i=0;(i+3)<cards.size();i++){
            int sum1=0;
            if (cards.get(i).getFace()!=cards.get(i+3).getFace())
                sum1=cards.get(i).getFace().getPoints()+cards.get(i+3).getFace().getPoints();
            sum+=sum1;
        }
        return Integer.toString(sum);
    }

    public String toString(){
        StringBuilder k=new StringBuilder();
        for(int i=0;i<3;i++){
            k.append(cards.get(i)+"\t");
        }
        k.append("\n");
        for(int i=3;i<6;i++){
            k.append(cards.get(i)+"\t");
        }
        return k.toString();
    }
}