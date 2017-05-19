import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public Enemy(int enemyNumber)
    {
        super();
        this.enemyID = enemyNumber;
        setImage("enemies/enemy" + enemyID + ".png");
        if(enemyNumber == 1){
            speed = 3;
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
    }    
}
