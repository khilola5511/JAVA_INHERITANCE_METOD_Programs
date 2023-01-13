
package Week_3_Inheritance;

// Sub Class (Child)
public class Football extends SportsTeam {
    
    private int lombardies = 6;

    public Football() {
        
    }
    
    public Football(String n, int d, int l) {
        // We could make the variables in SportsTeam public .. but encapsulation
        setSport("Football");
        setTeamName(n);
        setDateFounded(d);
        lombardies = l;
    }

    public int getLombardies() {
        return lombardies;
    }

    public void setLombardies(int lombardies) {
        this.lombardies = lombardies;
    }
    
    public void printFootball() {
        System.out.println(getTeamName() + " is a " + getSport() + " team "
        + " founded on " + getDateFounded() + " with " + getLombardies()
        + " super bowl wins.");
    }
    
    // Add later
    public String getQB()
    {
        if(getTeamName().equalsIgnoreCase("Steelers"))
        {
            return "Big Ben";
        }
        else if(getTeamName().equalsIgnoreCase("Patriots"))
        {
           return "Tom Brady"; 
        }
        else if(getTeamName().equalsIgnoreCase("Kansas City"))
        {
            return "Patrick Mahomes";
        }
        else 
        {
            return "Someone Else";
        }
    }
    
}
