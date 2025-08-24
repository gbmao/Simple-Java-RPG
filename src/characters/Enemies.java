package characters;

import database.GameItems;
import items.HealingPotions;
import items.ItemDrop;
import items.Items;
import items.OffensePotions;
import utils.Utils;

public class Enemies {
    private String enemyType;
    private int health;
    private int attackDamage;
    private int xp;
    protected boolean isAlive;

    public Enemies() {
    }

    public Enemies(String enemyType, int health, int attackDamage, int xp) {
        this.enemyType = enemyType;
        this.health = health;
        this.attackDamage = attackDamage;
        this.xp = xp;
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


    public void tookDamage(int damageTaken){
        int newHealth = getHealth() - damageTaken;
        if(newHealth <= 0) {
            isAlive = false;
            System.out.println(getEnemyType() + " DIED!");
        }
        setHealth(newHealth);
    }

}

class  Slime extends Enemies {

    private Items item;

    public Slime(String enemyType, int health, int attackDamage, int xp, Items item) {
        super(enemyType, health, attackDamage, xp);
        this.item = item;
    }

    public int Attack(){
        return getAttackDamage();
    }

    public int specialAttack(){
        return Math.round(getAttackDamage() * (float) 1.5);
    }

    public void dropItem(){
        ItemDrop.dropRandomItem(item, 0.8);
    }



}

class Goblin extends Enemies {
    public Goblin(String enemyType, int health, int attackDamage, int xp) {
        super(enemyType, health, attackDamage, xp);
    }

    public void goblinMagic(){

    }
}
