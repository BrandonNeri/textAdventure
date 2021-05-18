package TextAdventure;

/**
 * @author Brandon Neri
 */
public class Room {

    // Varialbe Decleration
    private String name;
    private String description;

    private Exit exit1, exit2, exit3, exit4, SecretExit;
    private Item item;
    private Creature creature;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        // Method to return name
        return name;
    }

    public String getDescription() {
        // Method to return description
        return description;
    }

    public Exit getExit1() {
        // Method to return exit1
        return exit1;
    }

    public Exit getExit2() {
        // Method to return exit2
        return exit2;
    }

    public Exit getExit3() {
        // Method to return exit3
        return exit3;
    }

    public Exit getExit4() {
        // Method to return exit4
        return exit4;
    }

    public Exit getSecretExit() {
        // Method to return secret exit
        return SecretExit;
    }

    public Item getItem() {
        // Method to return item
        return item;
    }

    public Creature getCreature() {
        // Method to return creature
        return creature;
    }

    public void setName(String newName) {
        // Method to set name
        this.name = newName;
    }

    public void setDescription(String newDescription) {
        // Method to set description
        this.description = newDescription;
    }

    public void setExit1(Exit exit) {
        // Method to set exit1
        this.exit1 = exit;
    }

    public void setExit2(Exit exit) {
        // Method to set exit2
        this.exit2 = exit;
    }

    public void setExit3(Exit exit) {
        // Method to set exit3
        this.exit3 = exit;
    }

    public void setExit4(Exit exit) {
        // Method to set exit4
        this.exit4 = exit;
    }

    public void setSecretExit(Exit exit) {
        // Method to set secret exit
        this.SecretExit = exit;
    }

    public void setItem(Item item) {
        // Method to set room item
        this.item = item;
    }

    public void setCreature(Creature creature) {
        // Method to set room creature
        this.creature = creature;
    }
}
