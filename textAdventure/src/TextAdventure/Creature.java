package TextAdventure;

/**
 * @author Brandon Neri
 */
public class Creature {

    // Varialbe Decleration
    private String name;
    private String description;
    private String defeat;

    private Item item_defeat;

    public Creature(String name, String description, String defeat_text) {
        this.name = name;
        this.description = description;
        this.defeat = defeat_text;
    }

    public String getName() {
        // Method to return name
        return name;
    }

    public String getDescription() {
        // Method to return description
        return description;
    }

    public String getDefeatedText() {
        // Method to return defeat text
        return defeat;
    }

    public Item getItemToDestroy() {
        // Method to return destroy item
        return item_defeat;
    }

    public void setItemToDestroy(Item item) {
        // Method to set destroy item
        item_defeat = item;
    }
}
