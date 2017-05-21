import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    int enemyID;
    int speed;
    int health;
    boolean instanceExists = true;
    public Enemy(int enemyNumber)
    {
        super();
        this.enemyID = enemyNumber;
        setImage("enemies/enemy" + enemyID + ".png");
        if(enemyNumber == 1){
            speed = 3;
            health = 2;
        }
    }    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getX() < 880){
            setLocation(getX() + speed, getY());
        }
        else{
            setRotation(270);
            setLocation(getX(), getY() - speed);
        }
        if(health == 0){
            instanceExists = false;
        }
        checkCollision();
        if(instanceExists==false){
            getWorld().removeObject(this);
        }
    }    
    public void checkCollision(){
        List<Base>targets = getIntersectingObjects(Base.class);
        
        if (targets.isEmpty() != true) {
            for (Base b : targets) {
                b.setHealth(b.getHealth() - 1);
            }            
            instanceExists = false;
        }
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int newHealth){
        this.health = newHealth;
    }
}
