import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    Base base;
    public void addedToWorld(World world){
        
    }
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        base = getObjectsInRange(100, Base.class).get(0);
        if(base.getHealth() > 0){
            setImage("health/health" + Math.min(base.getHealth(),4) + ".png");
        }
        else{
            setImage("health/health0.png");
            gameOver();
        }
    }    
    public void gameOver(){
        GameOver text = new GameOver();
        getWorld().addObject(text,getWorld().getWidth()/2,getWorld().getHeight()/2);
        Explosion splode = new Explosion();
        getWorld().addObject(splode,base.getX(),base.getY());
        Greenfoot.stop();
    }
}
