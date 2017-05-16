import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TowerBase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TowerBase extends Actor
{
    int towerID;
    public TowerBase(int towerNumber)
    {
        super();
        this.towerID = towerNumber;
        setImage("towers/towerbase" + towerID + ".png");
        Cannon cannon = new Cannon(1);
        getWorld().addObject(cannon,getX(),getY());
    }
    /**
     * Act - do whatever the TowerBase wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
