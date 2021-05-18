package TextAdventure;

/**
 * @author Brandon Neri
 */
public class TextAdventure {

    public static void main(String[] args) {

        // Objects of Item Class
        Item sword_of_sword   = new Item("sword", "You found the mightiest sword of all swords.");
        Item football_of_nerf = new Item("football of nerf", "You found the Nerf Football. It may be foam, but this item still hurts if you throw it hard enough.");
        Item galaxy_note_7    = new Item("galaxy note 7", "You found the Galaxy Note 7. Keep your eye on this item, it goes boom!");

        // Objects of Creature Class
        Creature bob_ross     = new Creature("Bob Ross", "I'm Bob Ross, the guy that paint happy little trees!", "Well that wasn't a happy little accident. Bob Ross is dead.");
        Creature kool_aid_man = new Creature("Kool Aid Man", "Oooh Yeahhh! I'm the Kool Aid Man.", "Oooh Nooo! Kool Aid Man Died");
        Creature barney       = new Creature("Barney", "I'm Barney, the one and only purple dinosaur!", "Boom...there's no more purple dinosaur.");

        // Objects of Room Class
        Room the_fun_room   = new Room("The Fun Room", "Welcome to the Fun Room. There is no fun to have here...");
        Room the_broom_room = new Room("The Broom Room", "Welcome to the Broom Room. A kind of dusty room that needs a broom.");
        Room the_boom_room  = new Room("The Boom Room", "Welcome to the Boom Room. WARNING: Keep flamable objects out of this room!");
        Room the_toy_room   = new Room("The Toy Room", "Welcome to the Toy Room. There isn't a toy you can't find in here.");
        Room the_sword_room = new Room("The Sword Room", "Welcome to the Sword Room. A lot of sharp things in here.");
        Room the_art_room   = new Room("The Art Room", "Welcome to the Art Room. Grab a brush and your water colors...Its time to paint!");
        Room the_trash_room = new Room("The Trash Room", "Welcome to the Trash Room. Its kind of trashy in here.");
        Room the_kitchen    = new Room("The Kitchen", "Welcome to the Kitchen. Lets grab a drink of Kool Aid");
        Room the_empty_room = new Room("The Empty Room", "Welcome to the Empty Room. There is nothing in here. I'm serious.");
        Room the_dorm_room  = new Room("The Dorm Room", "Welcome to the Dorm Room. There's no A/C in this room...");

        // Objects of Exit Class
        Exit toy_room   = new Exit("toy room", "toy room", "To the Toy Room...");
        Exit sword_room = new Exit("sword room", "sword room", "To the Sword Room...");
        Exit kitchen    = new Exit("kitchen", "kitchen", "To the Kitchen...");
        Exit boom_room  = new Exit("boom room", "boom room", "To the Boom Room...");
        Exit fun_room   = new Exit("fun room", "fun room", "To the Fun Room...");
        Exit trash_room = new Exit("trash room", "trash room", "To the Trash Room...");
        Exit art_room   = new Exit("art room", "test", "To the Art Room...");
        Exit empty_room = new Exit("empty room", "art room", "To the Empty Room...");
        Exit dorm_room  = new Exit("dorm room", "dorm room", "To the Dorm Room...");
        Exit broom_room = new Exit("broom room", "broom room", "To the Broom Room...");

        // Items to Destroy Creatures
        bob_ross.setItemToDestroy(sword_of_sword);
        kool_aid_man.setItemToDestroy(football_of_nerf);
        barney.setItemToDestroy(galaxy_note_7);

        // Item Locations in Rooms
        the_dorm_room.setItem(galaxy_note_7);
        the_trash_room.setItem(sword_of_sword);
        the_toy_room.setItem(football_of_nerf);

        // Creature Locations in Rooms
        the_art_room.setCreature(bob_ross);
        the_kitchen.setCreature(kool_aid_man);
        the_boom_room.setCreature(barney);

        // Room Exit Destinations
        toy_room.setDestination(the_toy_room);
        sword_room.setDestination(the_sword_room);
        kitchen.setDestination(the_kitchen);
        boom_room.setDestination(the_boom_room);
        fun_room.setDestination(the_fun_room);
        trash_room.setDestination(the_trash_room);
        art_room.setDestination(the_art_room);
        empty_room.setDestination(the_empty_room);
        dorm_room.setDestination(the_dorm_room);
        broom_room.setDestination(the_broom_room);

        // Broom Room Exit
        the_broom_room.setExit1(toy_room);
        the_broom_room.setExit2(sword_room);
        the_broom_room.setExit3(fun_room);

        // Sword Room Exit
        the_sword_room.setExit1(broom_room);
        the_sword_room.setExit2(art_room);

        // Fun Room Exit
        the_fun_room.setExit1(broom_room);
        the_fun_room.setExit2(boom_room);

        // Boom Room Exit
        the_boom_room.setExit1(fun_room);
        the_boom_room.setExit2(trash_room);

        // Trash Room Exit
        the_trash_room.setExit1(boom_room);
        the_trash_room.setSecretExit(toy_room);
        trash_room.setCreatureBlocks(true);

        // Toy Room Exit
        the_toy_room.setExit1(broom_room);
        the_toy_room.setExit2(kitchen);

        // Kitchen Room Exit
        the_kitchen.setExit1(toy_room);
        the_kitchen.setExit2(dorm_room);

        // Dorm Room Exit
        the_dorm_room.setExit1(kitchen);
        dorm_room.setCreatureBlocks(true);


        // Art Room Exit
        the_art_room.setExit1(empty_room);
        the_art_room.setExit2(sword_room);
        
        // Empty Room (no exit required, room ends game)
        empty_room.setCreatureBlocks(true);

        // Game Objects
        World world      = new World(the_broom_room, the_empty_room);
        Player newPlayer = new Player("Little Tim Tim", "The scared little boy stuck in a text adventure game");
        Game theGame     = new Game(world, newPlayer);

        // Game Start
        theGame.start();
    }
}