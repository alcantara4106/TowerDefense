import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Actor
{
    int towerID;
    int pause;
    Enemy closestEnemy;
    public Cannon(int towerNumber)
    {
        super();
        this.towerID = towerNumber;
        setImage("towers/cannon" + towerID + ".png");
        pause = 30;
        setRotation(90);
    }
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!getObjectsInRange(200, Enemy.class).isEmpty()){
            closestEnemy = getObjectsInRange(200, Enemy.class).get(0);
            turnTowards(closestEnemy.getX(),closestEnemy.getY());
            if(getRotation() < 180){
                turn(-30);
            }
            else if(getRotation() >= 180 && getRotation() < 361){
                turn(30);
            }
            if(pause > 0){
                pause --; 
            }
            else{
                pause = 30;
                Bullet bullet = new Bullet(5,this.getRotation());
                getWorld().addObject(bullet,getX(),getY());
            }
        }
        
    }    
}
