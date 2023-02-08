import java.util.Random;

/**
 * NonPlayerCharacter class inherits methods from GameCharacter
 * Idea of a NPC for a game with exclaimations and introduction methods
 * 
 */
public class NonPlayerCharacter extends GameCharacter {

    private boolean active;
    private String intelligenceType;

    /**
     * The empty argument constructor to create default values
     */
    public NonPlayerCharacter() {
        super();
        this.active = false;
        this.intelligenceType = "NONE";
    }

    /**
     * Passes arguments into constructor
     * 
     * @param uniqueID, personality, active, intelligenceType arguments to pass thru
     */

    public NonPlayerCharacter(String uniqueID, String personality, boolean active, String intelligenceType) {
        super(uniqueID, personality); // calls parent constructor with uniqueID and personality parameters
        this.active = active;
        this.intelligenceType = intelligenceType;
    }

    /**
     * Returns a list of the values of the objects as a String.
     * 
     * @return String: list of values as a report
     */

    @Override
    public String reportStructure() {
        StringBuilder sb = new StringBuilder("==================================\n");
        sb.append("UniqueID: " + getUniqueID() + "\n");
        sb.append("Personality: " + getPersonality() + "\n");
        sb.append("==================================\n");
        sb.append("Active: " + this.active + "\n");
        sb.append("Intelligence Type: " + this.intelligenceType + "\n");
        sb.append("==================================\n");
        return sb.toString();
    }

    /**
     * Gives an introduction for the character
     * 
     * @return String: introduction
     */
    public String introduce() {

        return "Hello, my name is " + getUniqueID();
    }

    /**
     * Get a random exclaimation
     * 
     * @return String: exclamation to say
     */
    public String exclaim() {
        String[] exclamations = { "Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers" };
        Random rand = new Random();
        return exclamations[rand.nextInt(exclamations.length)];
    }

}
