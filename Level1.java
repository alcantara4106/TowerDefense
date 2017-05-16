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
        addObject(base,935,165);
        base.setLocation(932,143);
        Cursor cursor = new Cursor();
        addObject(cursor,1270,713);
    }
}
