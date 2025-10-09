package world;

import characters.Player;
import locations.Locations;

import static database.GameData.createRoom;

public class GameWorld {
    private Player player;
    //private Locations location;
    private static int totalRooms;


    public GameWorld(Player player) {
        this.player = player;
//        this.location = createRoom(player.getLevel(), totalRooms);
        player.setLocation(createRoom(player.getLevel(), totalRooms));
    }

    public static int getTotalRooms() {
        totalRooms++;
        return totalRooms;
    }

    public Locations getLocation() {
        return player.getLocation();
    }

    public void goForward() {

        if (player.getLocation().getNext() == null) {

        player.getLocation().setNext(createRoom(player.getLevel(), totalRooms));
        player.getLocation().getNext().setPrevious(player.getLocation());
        }
//        location = location.getNext();
        player.setLocation(player.getLocation().getNext());
    }

    public void goBack() {
        if (player.getLocation().getPrevious() == null) {
            System.out.println("You cant go back");
        } else {
//            location = location.getPrevious();
            player.setLocation(player.getLocation().getPrevious());

        }
    }

//    public void roomDescription() {
//        System.out.println("You are in a " + location.getName() + location.getSize() + location.getLight());
//    }

    public void roomDescription() {
        System.out.println(player.getLocation().getRoomNumber());
        System.out.println("You are in a " + player.getLocation().getName() + player.getLocation().getSize() + player.getLocation().getLight());
    }

}
