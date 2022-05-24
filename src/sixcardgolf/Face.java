package SixCardGolf;
/**
 * Enumeration class Suit - write a description of the enum class here
 *
 * @author (Harshilkumar Vaghela,3116318)
 * @date (March 2,2020, ACS-1904, Assignment 2)
 */
public enum Face
{
    ACE("A",1) ,

    TWO("2",-2),

    THREE("3",3),

    FOUR("4",4),

    FIVE("5",5),

    SIX("6",6),

    SEVEN("7",7),

    EIGHT("8",8),

    NINE("9",9),

    TEN("10",10),

    JACK("J",10),

    QUEEN("Q",10),

    KING("K",0);
    private String display;
    private int points;
    private Face(String d,int p){
        display=d;
        points=p;
    }

    public String getDisplay(){
        return display;
    }

    public int getPoints(){
        return points;
    }
}
