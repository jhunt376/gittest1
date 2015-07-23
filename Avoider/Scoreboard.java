import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    private int points;

    public Scoreboard()
    {

        points = 0;
        GreenfootImage img = new GreenfootImage(100,30);
        img.drawString("Score: " + points, 5,25);
        setImage(img);
        
    }

    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 1000) {
            img.drawString("Score: " + points, 5,25); 
        } else {
            img.drawString("You win!!!", 5,25);
            //Greenfoot.playSound("fanfare.wav");
        }        
    } 
    
    public int getScore()
    {
        return points;
    }
}

