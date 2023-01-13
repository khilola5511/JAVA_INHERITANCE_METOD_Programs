
package Week_3_Interfaces;

import Week_3_Interfaces.AnimalEats;

public class DogEats extends AnimalEats{
    
    public void eat()
    {
        System.out.println("Eating dog food ...");
    }
    
    public void bark()
    {
        System.out.println("Barking.");
    }
    
    public void eatNBark()
    {
        bark();
        super.eat();
    }
    
}
