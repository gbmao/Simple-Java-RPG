package characters;
//TODO refactor to a cleaner code
//TODO create a method for raising HP and  damage as level up

public class Player {

    private String name;
    private int level;
    private int health;
    private int damage;
    private int xp;
    protected boolean isAlive;

    public static Player player1 = new Player("AAA", 1, 10, 2, 0);

    public Player() {
//        this("AAA", 1, 10, 2, 0);
    }

    public Player(String name, int level, int health, int damage, int xp) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.damage = damage;
        this.xp = xp;
        isAlive = true;
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

    /**
     * Use this to see actual lvl
     *
     * @return actual lvl
     */
    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {

        this.health = health;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    /**
     * Adds XP to the player. If the new XP exceeds the threshold,
     * the player automatically levels up. Any excess XP is retained.
     *
     * @param xp The amount of XP to add.
     */
    public void addXp(int xp) {

        this.xp += xp;
        int xpToLeveling = getLevel() * 10 + 100;
        if (getXp() > xpToLeveling) {

            addLevel(1);
            // call setXp with exceeding xp
            int exceedingXp = getXp() - xpToLeveling;
            if (exceedingXp > 0) {
                setXp(exceedingXp);
            }
            //TODO a better way to show the level up msg
            //TODO show how much xp needed for leveling
            System.out.println("Voce upou e tem : " + exceedingXp + " de xp");
        }


    }

    public void addLevel(int level) {

        this.level += level;
        this.health += 1;
        if (level % 2 == 0) {
            this.damage += 1;
        }

    }
    /**Input the damage took
     * @param damageTaken input any damage to be taken
     */
    public void tookDamage(int damageTaken){
        int newHealth = getHealth() - damageTaken;
        if(newHealth <= 0) {
            isAlive = false;
            System.out.println(getName() + " DIED!");
        }
        setHealth(newHealth);
    }

}

