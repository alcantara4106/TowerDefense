import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonShadow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TowerShadow extends Actor
{
    int towerID;
    public TowerShadow(int towerNumber)
    {
        super();
        this.towerID = towerNumber;
        setImage("towers/towershadow" + towerID + ".png");
    }
    /**
     * Act - do whatever the CannonShadow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */  
    
    public void act() 
    {
        boolean instanceExists = true;
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null)
        {            
            setLocation(80* Math.round(mouse.getX()/80),80* Math.round(mouse.getY()/80));
            if(mouse.getClickCount() > 0)
            {
                TowerBase base = new TowerBase(1);
                getWorld().addObject(base,this.getX(),this.getY());
                instanceExists = false;
            }
        }
        if(instanceExists == false){
            getWorld().removeObject(this);
        }
    }    
}
