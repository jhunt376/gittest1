import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigEnemy extends Actor
{
    int BigMove;
    public void act() 
    {
        BigMove = Greenfoot.getRandomNumber(100) - 50;
        
        Fall();
            
        Destroy();
        
    }

    public void Fall()    
    {
        setLocation(getX() + BigMove, getY() + 1);
        
    }

    public void Destroy()
    {
        if (getY() > 390)
        {
            ((AvoiderWorld)getWorld()).update();
           
            getWorld().removeObject(this);
        }
                
    }
}
