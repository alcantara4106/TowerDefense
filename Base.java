import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Base here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Base extends Actor
{
    /**
     * Act - do whatever the Base wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null)
        {
            boolean checkCursor = !getIntersectingObjects(Cursor.class).isEmpty();
            if(mouse.getClickCount() > 0 && checkCursor)
            {
                TowerShadow b = new TowerShadow(1);
                getWorld().addObject(b,getX(),getY());
            }
        }
    }    
}