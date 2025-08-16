package characters;

public class Player {

    private String name;
    private int level;
    private int health;
    private String damage;
    private int xp;



     public Player(String name, int level, int health, String damage, int xp){
         this.name = name;
         this.level = level;
         this.health = health;
         this.damage = damage;
         this.xp = xp;
     }

    public String getDamage() {
        return damage;
    }

    public int getXp() {
        return xp;
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

    public void setHealth(int health){

         this.health = health;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void addXp(int xp){

         this.xp += xp;
        // conectar o xp maximo com o setLevel
        // level * 10 + 100
        int xpToLeveling = getLevel() * 10 + 100;
        if(getXp() > xpToLeveling){

            setLevel(getLevel() + 1 );
            // call setXp with exceeding xp
            int exceedingXp = getXp() - xpToLeveling;
            if(exceedingXp > 0){
                setXp(exceedingXp);
            }
        }


    }

    public void setLevel(int level){


    }

}

