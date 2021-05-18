package TextAdventure;

/**
 * @author Brandon Neri
 */
public class Item {

    // Varialbe Decleration
    private String name;
    private String description;

    public Item(String name, String description) {
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
}
