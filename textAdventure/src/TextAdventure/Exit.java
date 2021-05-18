package TextAdventure;

/**
 * @author Brandon Neri
 */
public class Exit {

    // Varialbe Decleration
    private String name;
    private String description;
    private String transition_text;

    private Room destination;
    private Item required_item;

    private boolean value;

    public Exit(String name, String description, String transition_text) {
        this.name = name;
        this.description = description;
        this.transition_text = transition_text;
    }

    public String getName() {
        // Method to return name
        return name;
    }

    public String getDescription() {
        // Method to return description
        return description;
    }

    public String getTransition() {
        // Method to return transition text
        return transition_text;
    }

    public Room getDestination() {
        // Method to return destination
        return destination;
    }

    public Item getRequiredItem() {
        // Method to return requried exit item
        return required_item;
    }

    public boolean getCreatureBlocks() {
        // Method to get creature in exit
        return value;
    }

    public void setDestination(Room destination) {
        // Method to change destination
        this.destination = destination;
    }

    public void setRequiredItem(Item item) {
        // Method to change requried items
        this.required_item = item;
    }

    public void setCreatureBlocks(boolean value) {
        // Method to change creature value
        this.value = value;
    }
}
