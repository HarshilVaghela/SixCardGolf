package SixCardGolf;
/**
 * Enumeration class Suit - write a description of the enum class here
 *
 * @author (Harshilkumar Vaghela,3116318)
 * @date (March 2,2020, ACS-1904, Assignment 2)
 */
public enum Suit
{
    CLUBS("\u2663"),

    SPADES("\u2660"),

    HEARTS("\u2665"),

    DIAMONDS("\u2666");
    private String display;
    private Suit(String s){
        display=s;
    }

    public String getDisplay(){
        return display;
    }
}
