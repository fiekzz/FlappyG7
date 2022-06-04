import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Score displayer when the game is still running
 * 
 * @author github.com/fiekzz
 * @version 4 June 2022
 */
public class ShowScore extends Actor
{
    private int currentScore = 0;
    // score constructor    
    public ShowScore()
    {
        this.currentScore = score.getCurrentScore();
    }
    // display the score
    public void act()
    {
        GreenfootImage showScore = new GreenfootImage(" Your score: " + score.getCurrentScore() + " ", 30, Color.WHITE, Color.BLACK);
        showScore.scale(120,50);
        setImage(showScore);
    }
}
