package characters;

public class Enemies {
    private String enemyType;
    private int health;
    private int atackDamage;

    public Enemies(String enemyType, int health,int atackDamage){
        this.enemyType = enemyType;
        this.health = health;
        this.atackDamage = atackDamage;
    }

    public String GetEnemyType(){ return enemyType; }
    public int GetHealth(){return health;}
    public int GetAtackDamage(){ return atackDamage;}

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public void setAtackDamage(int atackDamage) {
        this.atackDamage = atackDamage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Enemies() {enemyType = "Slime"; health = 4; atackDamage = 1;};



}
