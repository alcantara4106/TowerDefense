import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cursor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cursor extends Actor
{
    /**
     * Act - do whatever the Cursor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null){
            this.setLocation(mouse.getX(),mouse.getY());
        }
        if(Greenfoot.isKeyDown("f")){
            System.out.println("mouse_x: " + mouse.getX() + " ");
            System.out.println("mouse_y" + mouse.getY() + " ");
        }
    }    
}
