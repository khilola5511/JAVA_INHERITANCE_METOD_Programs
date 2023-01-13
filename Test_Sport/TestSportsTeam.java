
package Week_3_Inheritance;

// Demo of SportsTeams / Football / Soccer
public class TestSportsTeam {

    public static void main(String[] args) {
        
        Football steelers = new Football("Steelers", 1933, 6);
        Soccer afcBournemouth = new Soccer("AFC Bournemouth", 1899, 0);
         
        // Cannot access the super class but can access the sub classes 
        // which are derived from super
        // steelers.
        // afcBournemouth.
        
        steelers.printFootball();
        // Show ...
        System.out.println("QB = " + steelers.getQB());
        
        
        System.out.println("");
        afcBournemouth.printSoccer();
        
        
        
        
        
       
        
        
        
    }
    
}
