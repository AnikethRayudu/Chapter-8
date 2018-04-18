

/**
 * Write a description of class DollarDollarBillsYo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DollarDollarBillsYo
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class DollarDollarBillsYo
     */
    public DollarDollarBillsYo()
    {
        x = 0;
    }
    
    public static int collect(int monataryGoal)
    {
        int temp = 0;
        if (monataryGoal == 1)
            return 0;
        else if (monataryGoal >1)
        {
            for (int i = 0; i<10; i++)
            {
                temp += 1+collect(monataryGoal/10);
            }
            return temp;
        }
        else
            return 0;
    }

    
}
