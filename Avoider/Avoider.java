import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avoider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avoider extends Actor
{
    int kill;
    /**
     * Act - do whatever the Avoider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Avoider()
    {
       kill = 2; 
       play();
    }
    
    public void act() 
    {
        followMouse();
        //powerup();
        spawnEnemy();
        //play();
          
        Destroy();
      
    }   

    public void play()
    {
        Greenfoot.playSound("megaman.mp3");
    }
    
    public void powerup()
    {
       kill = 2; 
    }
    
    public void followMouse()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();

        if(mi != null) setLocation(mi.getX(), mi.getY());
    }

    public void spawnEnemy()
    {
        if(Greenfoot.getRandomNumber(1000) < 20)
        {
            enemies e = new enemies();
            getWorld().addObject(e, Greenfoot.getRandomNumber(600) , (0));  
        }
    }

    public void Destroy()
    {
        if(isTouching(enemies.class) || (isTouching(BigEnemy.class)))
        {
            if (kill == 1)
            {
                getWorld().removeObject(this);
                //AvoiderWorld world = (AvoiderWorld) getWorld();
                //world.endGame();
                AvoiderGameOverScreen go = new AvoiderGameOverScreen();
                Greenfoot.setWorld(go);
            }
            else if (kill == 2)
            {
               kill = 3; 
            }
            else if (kill == 3)
            {
               kill = 4; 
            }
            else if (kill == 4)
            {
               kill = 5; 
            }
            else if (kill ==5)
            {
               kill = 6; 
            }
            else if (kill == 6)
            {
               kill = 7; 
            }
            else if (kill == 7)
            {
               kill = 8; 
            }
            
            else if (kill == 8)
            {
               kill = 9; 
            }
            else if (kill == 9)
            {
               kill = 10; 
            }
            else if (kill == 10)
            {
               kill = 11; 
            }
            else if (kill == 11)
            {
               kill = 1; 
            }
        }
    }
}
