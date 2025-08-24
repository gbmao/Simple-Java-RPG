package characters;
import database.GameItems;
import items.Items;
import utils.Utils;

public class Enemies {
    private String enemyType;
    private int health;
    private int attackDamage;
    private int xp;
    protected boolean isAlive;
    private Items item;
    private double dropRate;


    public Enemies(String enemyType, int health, int attackDamage, int xp, Items item, double dropRate) {
        this.enemyType = enemyType;
        this.health = health;
        this.attackDamage = attackDamage;
        this.xp = xp;
        this.item = item;
        this.dropRate = dropRate;
        isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
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

    public int attack() {
        System.out.println(getEnemyType() + " attacks!!!");
        return getAttackDamage();

    }

    public int getXp() {
        return xp;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public void tookDamage(int damageTaken) {
        int newHealth = getHealth() - damageTaken;
        System.out.println(getEnemyType() + " took " + damageTaken + " damage!");
        if (newHealth <= 0) {
            isAlive = false;
            System.out.println(getEnemyType() + " DIED!");
        }
        setHealth(newHealth);
    }

    public void dropItem() {
        Utils.dropRandomItem(item, dropRate);

    }
    public int whatToDo(){
        double chance = Math.random();

        if(chance < 0.6){
            return attack();
        }else{
            return specialAttack();
        }
    }

    public int specialAttack() {

        return attack();
    }



}

class Slime extends Enemies {

    public Slime() {
        super("Slime", 5, 1, 30, GameItems.hpPotion, 0.4);

    }

    public int specialAttack() {
        System.out.println(getEnemyType() + " uses a SPECIAL move!");
        return Math.round(getAttackDamage() * (float) 1.5);
    }



}

class Goblin extends Enemies {

    public Goblin() {
        super("Goblin warrior", 14, 4, 60, GameItems.hpPotion, 0.6);
    }

//    public void specialAttack() {
//        System.out.println(getEnemyType() + " starts concentration it's force!!!");
//        setAttackDamage(getAttackDamage() + 1);
//    }

}

class SkeletonArcher extends Enemies {

    public SkeletonArcher() {
        super("Skeleton Archer", 10, 5, 100, GameItems.poisonPotion, 0.5);
    }

//    public void specialAttack() {
//        System.out.println(getEnemyType() + " uses double hit!!!");
////        attack(Player.player1);
////        attack(Player.player1);
//    }
}
