package locations;

public class Locations {
    private String name;
    private String light;
    private String size;
    private static int totalRooms;

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
}


