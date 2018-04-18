

/**
 * Write a description of class ChangeMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChangeMachine
{


    /**
     * Default constructor for objects of class ChangeMachine
     */
    public ChangeMachine()
    {

    }

    public static int change(int amount)
    {
        int hundred = amount/100;
        int twenty = amount/20;
        int ten = amount/10;
        int five = amount/5;
        int one = amount;
        int total = 0;
        
        for (int i = 0; i <hundred;i++)
        {
            return change(amount-(100*i));
        }
        
        for (int i = 0; i <twenty;i++)
        {
            return change(amount-(20*i));
        }
       
        for (int i = 0; i <ten;i++)
        {
            return change(amount-(10*i));
        }
        
        for (int i = 0; i <five;i++)
        {
            return change(amount-(5*i)); 
        }
        
        return amount; 
            

        

            
            
          
    }

}
