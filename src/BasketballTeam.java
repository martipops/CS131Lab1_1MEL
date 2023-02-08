/**
 * BasketballTeam inherits SportsTeam
 * BasketballTeam contains field goals and free throws and
 * methods that correlate with those variables
 * 
 */

public class BasketballTeam extends SportsTeam {

    private int fieldGoals;
    private int fieldGoalsAttempted;
    private int freeThrows;
    private int freeThrowsAttempted;

    public BasketballTeam() {
        this.fieldGoals = 0;
        this.fieldGoalsAttempted = 0;
        this.freeThrows = 0;
        this.freeThrowsAttempted = 0;
    }

    public BasketballTeam(String teamName, String teamMascot, String headCoach) {
        super(teamName, teamMascot, headCoach);
    }

    /**
     * @return double
     */
    public double fieldGoalPercentage() {
        return (double) fieldGoals / fieldGoalsAttempted * 100.0;

    }

    /**
     * @return double
     */
    public double freeThrowPercentage() {
        return (double) freeThrows / freeThrowsAttempted * 100.0;

    }

    /**
     * Sets the stats of the basketball team
     * 
     */
    public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows,
            int freeThrowsAttempted) {
        this.wins = wins;
        this.losses = losses;
        this.fieldGoals = fieldGoals;
        this.fieldGoalsAttempted = fieldGoalsAttempted;
        this.freeThrows = freeThrows;
        this.freeThrowsAttempted = freeThrowsAttempted;

    }

    /**
     * @return double[] list of stats
     */
    @Override
    public double[] getStats() {
        return new double[] { this.getWinPercentage(), this.fieldGoalPercentage(), this.freeThrowPercentage() };
    }
}