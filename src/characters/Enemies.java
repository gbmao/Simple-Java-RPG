package characters;

public class Enemies {
    private String enemyType;
    private int health;
    private int attackDamage;
    private int xp;

    public Enemies() {
    }

    public Enemies(String enemyType, int health, int attackDamage, int xp) {
        this.enemyType = enemyType;
        this.health = health;
        this.attackDamage = attackDamage;
        this.xp = xp;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getXp() {
        return xp;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public void setAttackDamage(int atackDamage) {
        this.attackDamage = atackDamage;
    }

    public void setHealth(int health) {
        this.health = health;
    }



}
