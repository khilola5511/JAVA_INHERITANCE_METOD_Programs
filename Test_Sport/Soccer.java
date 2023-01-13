
package Week_3_Inheritance;

// Sub Class (Child)
public class Soccer extends SportsTeam {
    
    private int PLT = 6;

    public Soccer() {
        
    }
    
    public Soccer(String n, int d, int l) {
        // We could make the variables in SportsTeam public .. but encapsulation
        setSport("Soccer");
        setTeamName(n);
        setDateFounded(d);
        PLT = 0;
    }

    public int getPremierLeagueTitles() {
        return PLT;
    }

    public void setPremierLeagueTitles(int t) {
        this.PLT = t;
    }
    
    public void printSoccer() {
        System.out.println(getTeamName() + " is a " + getSport() + " team "
       + " founded on " + getDateFounded() + " with " + getPremierLeagueTitles()
        + " Premier League Titles.");
    }
    
}

