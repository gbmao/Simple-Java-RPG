package characters;
//TODO refactor to a cleaner code
//TODO create a method for raising HP and  damage as level up

public class Player {

    private String name;
    private int level;
    private int health;
    private int damage;
    private int xp;

    public Player(){
        this("AAA", 0, 10, 2, 0);
    }

     public Player(String name, int level, int health, int damage, int xp){
         this.name = name;
         this.level = level;
         this.health = health;
         this.damage = damage;
         this.xp = xp;
     }

    public int getDamage() {
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

            addLevel( 1 );
            // call setXp with exceeding xp
            int exceedingXp = getXp() - xpToLeveling;
            if(exceedingXp > 0){
                setXp(exceedingXp);
            }
            //TODO a better way to show the level up msg
            //TODO show how much xp needed for leveling
            System.out.println("Voce upou e tem : " + exceedingXp + " de xp");
        }


    }

    public void addLevel(int level){

        this.level += level;

    }

}

