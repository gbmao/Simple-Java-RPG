package items;

public class Items {
    private String name;
    private String description;
    private int point;

    //constructor
    public Items(String name, String description, int point ){
        this.name = name;
        this.description = description;
        this.point = point;
    }

    //getters


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPoint() {
        return point;
    }

    //setters


    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(int point) {
        this.point = point;
    }

}

