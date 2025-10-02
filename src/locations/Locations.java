package locations;

public class Locations {
    private String name;
    private String light;
    private String size;
    private static int totalRooms;
    private Locations next;
    private Locations previous;

    public Locations(String name, String light, String size){
    this.name = name;
    this.light = light;
    this.size = size;
    totalRooms++;

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

    public static int getTotalRooms() {
        return totalRooms;
    }

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


