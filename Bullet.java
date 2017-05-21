import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    int speed;
    boolean instanceExists = true;
    public Bullet(int newSpeed, int rotation)
    {
        super();
        this.speed = newSpeed;
        this.setRotation(rotation);
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        if(this.getX() >= getWorld().getWidth() - 10 || this.getX() < 10
        || this.getY() >= getWorld().getHeight() - 10 || this.getY() < 10){
            instanceExists = false;
        }
        else if(!getIntersectingObjects(Enemy.class).isEmpty()){
            for (Enemy b : getIntersectingObjects(Enemy.class)) {
                b.setHealth(b.getHealth() - 1);
            }            
            instanceExists = false;
        }
        else{
            move(speed);
        }
        if(instanceExists == false){
            getWorld().removeObject(this);
        }
    }    
    
}
