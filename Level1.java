import greenfoot.*;

/**
 * Write a description of class Ocean here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    /**
     * Constructor for objects of class Ocean.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        Base base = new Base();
        addObject(base,880,160);
        HealthBar health = new HealthBar();
        addObject(health,880,90);
        Cursor cursor = new Cursor();
        addObject(cursor,1270,713);
        Path path1 = new Path();
        addObject(path1,600,320);
        
        Menu menu = new Menu();
        addObject(menu,1175,360);
        Menu menu2 = new Menu();
        addObject(menu2,105,360);
        
        Runner runner = new Runner();
        addObject(runner,302,56);
        
        setPaintOrder(Enemy.class,Menu.class);
    }
}
