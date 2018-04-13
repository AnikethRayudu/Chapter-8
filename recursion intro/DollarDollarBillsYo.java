

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
        if (monataryGoal == 1)
            return 1;
        else
        {
            for (int i = 0; i<10; i++)
            {
                return collect(monataryGoal/10);
            }
        }
        
    }

    
}
