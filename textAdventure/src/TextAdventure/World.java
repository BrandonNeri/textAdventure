package TextAdventure;

/**
 * @author Brandon Neri
 */
public class World {

    // Varialbe Decleration
    private Room startingRoom;
    private Room endingRoom;

    public World(Room startingRoom, Room endingRoom) {
        this.startingRoom = startingRoom;
        this.endingRoom   = endingRoom;
    }

    public Room getStartingRoom() {
        // Method to return starting room
        return startingRoom;
    }

    public Room getEndingRoom() {
        // Method to return ending room
        return endingRoom;
    }
}
