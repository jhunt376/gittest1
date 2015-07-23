import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemies extends Actor
{
    int pic = 1;
    
    int scoreCap;
    int score2;
    int enemySpeed;
    /**
     * Act - do whatever the enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public enemies()
    {
        enemySpeed = 1;        
        score2 = 0;
        scoreCap = 100;
    }
    
    public void act() 
    {
        
        Fall();
        Picture();    
        Destroy();
        
    }

    public void Fall()    
    {
        setLocation(getX(), getY() + enemySpeed);
    }

    public void Destroy()
    {
        if (getY() > 390 || isTouching(enemies.class ))
        {
            ((AvoiderWorld)getWorld()).update();
            score2 = score2 + 5;
            getWorld().removeObject(this);
            
            
        }
        
        
    }
    
    public void Picture()
    {
        if (pic ==1)
        {
            setImage("smiley4.png");
            pic = 2;
        }
        else if (pic == 2)
        {
            setImage("smiley5.png");
            pic = 1;
        }
    }
    
    public void setSpeed(int speed)
    {
        enemySpeed = speed;
    }
    
}
