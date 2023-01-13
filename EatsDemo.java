
package Week_3_Inheritance;

import Week_3_Interfaces.DogEats;


public class EatsDemo {

    public static void main(String[] args) {
        
        DogEats dog = new DogEats();
        
        dog.eat();
        dog.bark();
        
        System.out.println("");
        // super
        dog.eatNBark();
        
    }
    
}
