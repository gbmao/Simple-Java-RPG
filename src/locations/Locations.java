package locations;

public class Locations {
    private String name;
    private String light;
    private String size;

    public Locations(String name, String light, String size){
    this.name = name;
    this.light = light;
    this.size = size;

    }

    public String GetName(){ return name;}
    public String GetLight(){return light;}
    public String GetSize(){ return size;}

    public void setName(String name){
        this.name =name;
    }

    public void setLight(String light){
        this.light = light;
    }

    public void setSize(String size){
        this.size = size;
    }
}


