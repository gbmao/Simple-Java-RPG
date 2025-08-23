package database;

import characters.Enemies;
//TODO eventually create some class extends inside a package ( soo each enemy has it own feature)
public class GameEnemies {

//    public GameEnemies(String enemyType, int health, int attackDamage, int xp) {
//        super(enemyType, health, attackDamage, xp);
//    }



    public  Enemies slime = new Enemies("Slime", 5, 1, 30);
    public  Enemies skeletonWarrior = new Enemies("Skeleton Warrior", 7, 3, 60);
    public  Enemies skeletonArcher = new Enemies("Skeleton Archer", 4, 4, 70);
    public  Enemies firstBoss = new Enemies("Giant Spider", 12, 4, 150);



}
