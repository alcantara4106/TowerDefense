import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner extends Actor
{
    int pause = 10;
    /**
     * Act - do whatever the Runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(pause > 0){
            pause --;
        }
        else{
            if(Greenfoot.isKeyDown("space")){
                pause = (int)(Math.random() * 50) + 30;
                //1 will be replaced with a random int in final version for randomized enemies
                Enemy enemy = new Enemy(1);            
                getWorld().addObject(enemy,0,480);
            }
        }
    }    
}
