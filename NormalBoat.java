import greenfoot.*;
import java.util.List;
/**
 * Write a description of class NormalBoat here.
 * 
 * @author Ethan Alcantara 
 * @version v1.0 4/17/17
 */
public class NormalBoat extends Ship
{
    int pause;
    public void act(){
        if(Greenfoot.isKeyDown("right")){setLocation(getX() + 5, getY());}
        if(Greenfoot.isKeyDown("up")){setLocation(getX(), getY() - 5);}
        if(Greenfoot.isKeyDown("left")){setLocation(getX() - 5, getY());}
        if(Greenfoot.isKeyDown("down")){setLocation(getX(), getY() + 5);}
        if(Greenfoot.isKeyDown("space") && pause <= 0){
            RedBullet bullet = new RedBullet();
            getWorld().addObject(bullet,getX()+100,getY());
            pause = 30;
        }
        if(Greenfoot.isKeyDown("M") && pause <= 0){
            Bullet2 bullet = new Bullet2();
            getWorld().addObject(bullet,getX()+100,getY());
            pause = 30;
        }
        if(Greenfoot.isKeyDown("f")){
            System.out.println("X: " + this.getX() + " ");
        }
        if(pause > 0)pause --;        
    }
}
