import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvoiderGameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderGameOverScreen extends World
{

    /**
     * Constructor for objects of class AvoiderGameOverScreen.
     * 
     */
    public AvoiderGameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

    }

    public void act()    
    {
        image();
        
        if (Greenfoot.mouseClicked(this))
        {
            
            Greenfoot.setWorld(new AvoiderWorld());
        }
    }

    public void image()
    {
        //setImage("avoider game cover.png");

    }
}
