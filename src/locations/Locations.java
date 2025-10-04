package locations;

import characters.Enemies;
import world.GameWorld;

public class Locations {
    private String name;
    private String light;
    private String size;

    private Locations next;
    private Locations previous;
    private Enemies enemy;

    private int roomNumber;

    public Locations(String name, String light, String size){
    this.name = name;
    this.light = light;
    this.size = size;

    roomNumber = GameWorld.getTotalRooms();

    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public String getName(){ return name;}
    public String getLight(){return light;}
    public String getSize(){ return size;}

    public void setName(String name){
        this.name =name;
    }

    public void setLight(String light){
        this.light = light;
    }

    public void setSize(String size){
        this.size = size;
    }

//    public static int getTotalRooms() {
//        return totalRooms;
//    }

    public void setPrevious(Locations previous) {
        this.previous = previous;
    }

    public void setNext(Locations next) {
        this.next = next;
    }

    public Locations getNext() {
        return next;
    }

    public Locations getPrevious() {
        return previous;
    }

    public void setEnemy(Enemies enemy) {
        this.enemy = enemy;
    }
    public Enemies roomEnemy(){
        return  enemy;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "name='" + name + '\'' +
                ", light='" + light + '\'' +
                ", size='" + size + '\'' +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }
}


