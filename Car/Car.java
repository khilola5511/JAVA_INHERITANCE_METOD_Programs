
package Week_3_Inheritance;


public class Car extends Vehicle{
    
    int maxSpeed = 120;
    
    public void displaySpeed() {
    System.out.println("The car (Child) has a max speed of " + maxSpeed);
    System.out.println("The vehicle (Parent) has a max speed of " 
            + super.maxSpeed);
    }
    
}
