package world;

import characters.Player;
import locations.Locations;

import static database.GameData.createRoom;

public class GameWorld {
    private Player player;
    private Locations location;
    private static int totalRooms;


    public GameWorld(Player player) {
        this.player = player;
        this.location = createRoom(player.getLevel(), totalRooms);
    }

    public static int getTotalRooms() {
        totalRooms++;
        return totalRooms;
    }

    public Locations getLocation() {
        return location;
    }

    public void goForward() {
        location.setNext(createRoom(player.getLevel(), totalRooms ));
        location.getNext().setPrevious(location);
        location = location.getNext();
    }

    public void goBack() {
        if (location.getPrevious() == null) {
            System.out.println("You cant go back");
        } else {
            location = location.getPrevious();

        }
    }

    public void roomDescription(){
        System.out.println("You are in a " + location.getName() + location.getSize() + location.getLight());
    }


}
