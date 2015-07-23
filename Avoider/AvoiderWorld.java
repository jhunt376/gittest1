import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvoiderWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderWorld extends World
{
    private Scoreboard score;
    int scoreCap;
    int score2;
    int enemySpawnRate;
    int enemySpeed;
    int oneenemy;
    /**
     * Constructor for objects of class AvoiderWorld.
     * 
     */
    public AvoiderWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootSound bkgMusic = new GreenfootSound("iframe width=560 height=315 src=httpswww.youtube.comembedDLbtEMnkpLU frameborder=0 allowfullscreeniframe");        
        bkgMusic.playLoop();
        oneenemy = 1;
        score2 = 0;
        scoreCap = 100;
        setPaintOrder (Scoreboard.class,box.class);
        score = new Scoreboard();
        populate();
        

    }

    public void act()
    {
        super.act();
        bigenemy();
        powerup();

        if(Greenfoot.getRandomNumber(1000) < enemySpawnRate)
        {
            enemies e = new enemies();
            e.setSpeed(enemySpeed);
            addObject(e, Greenfoot.getRandomNumber(getWidth() - 20) + 10, - 30);
            score.addToScore();
        }
        increaseLevel();
    }

    public void powerup()
    {
        if(Greenfoot.getRandomNumber(5000) < 3)
        {
            for(int i = 1; i<=1; i++)
            {
                addObject(new Powerup(), Greenfoot.getRandomNumber(600) , (0));  
            }
        }

    }

    public void bigenemy()
    {
        int score = getScore();

        if (score >= 900 && oneenemy == 1)
        {
            addObject(new BigEnemy(),  Greenfoot.getRandomNumber(600) , (0));  
            oneenemy = 2;
        }
    }

    public void increaseLevel()
    {
        int score = getScore();

        if(score > 100 && score < 400)
        {
            enemySpawnRate = 25;
            enemySpeed = 2;
        }
        else if (score > 400 && score < 600)
        {
            enemySpawnRate = 30;
            enemySpeed = 3;
        }
        else if (score > 600 && score < 900)
        {
            enemySpawnRate = 40;
            enemySpeed = 4;
        }
        else if (score > 900)
        {
            enemySpawnRate = 50;
            enemySpeed = 5;
        }
    }

    public int getScore()
    {
        return score.getScore();
    }

    public void populate()
    {
        for(int i = 1; i<=1; i++)
        {
            addObject(score, (73) , (347));  
        }   

        for(int i = 1; i<=1; i++)
        {
            addObject(new box(), (50) , (350));  
        }

        for(int i = 1; i<=1; i++)
        {
            addObject(new box(), (80) , (350));  
        }

        for(int i = 1; i<=1; i++)
        {
            if(Greenfoot.getRandomNumber(1000) < enemySpawnRate)
            {
                enemies e = new enemies();
                addObject(e, Greenfoot.getRandomNumber(600) , (0));  
            }
        }

        for(int i = 1; i<=1; i++)
        {
            addObject(new Avoider(), (300) , (300));  
        }
    }

    public void update()
    {
        for(int i = 1; i<=1; i++)
        {
            score.addToScore();
            score.addToScore();
            score.addToScore();
            score.addToScore();
            score.addToScore();
            score2 = score2 + 5;
        }

    }

    public void upgrade()
    {
        if (score2 == scoreCap) 
        {
            //((enemies))getWorld()).Fall();
            scoreCap = scoreCap + 100;
        }
    }
}
