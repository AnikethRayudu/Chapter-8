

/**
 * Write a description of class Palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palindrome
{

    /**
     * Default constructor for objects of class Palindrome
     */
    public Palindrome()
    {
        // initialise instance variables

    }

    public static boolean tester(String word)
    {
        if (word.length() <= 1)
            return true;
        if (word.charAt(0)==(word.charAt(word.length()-1)))
            return tester(word.substring(1,word.length()-1));
        else
            return false;
    }

}
