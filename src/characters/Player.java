package characters;

public class Player {

    private String name;
    private int level;
    private int health;

     public Player(String name, int level, int health){
         this.name = name;
         this.level = level;
         this.health = health;
     }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }
}
