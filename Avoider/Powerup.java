import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Powerup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Powerup extends Actor
{
    /**
     * Act - do whatever the Powerup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Fall();
            
        Destroy();
        
    }

    public void Fall()    
    {
        setLocation(getX(), getY() + 1);
    }

    public void Destroy()
    {
        if (getY() > 390 || isTouching(enemies.class ))
        {
            ((AvoiderWorld)getWorld()).update();
            //score2 = score2 + 5;
            getWorld().removeObject(this);
            
            
        }
        
        
    }
}
