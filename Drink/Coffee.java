
package Week_3_Inheritance;

public class Coffee extends Drink{
    
    public Coffee()
    {
        // If you choose to use super it MUST be the first statement in constructor
        super(); // Show it works even without using this (Automatically)
        System.out.println("Coffee has been created ...");
    }
    
}
