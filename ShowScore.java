import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShowScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShowScore extends Actor
{
    private int currentScore = 0;
    
    public ShowScore()
    {
        this.currentScore = score.getCurrentScore();
    }
    
    public void act()
    {
        GreenfootImage showScore = new GreenfootImage(" Your score: " + score.getCurrentScore() + " ", 30, Color.WHITE, Color.BLACK);
        showScore.scale(120,50);
        setImage(showScore);
    }
}
