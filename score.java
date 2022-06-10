 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Score counter class
 * Count the current score for the game
 * 
 * @author github.com/fiekzz
 * @version 4 June 2022
 */

public class score extends Actor
{
    // static score
    private static int score = 0;
    // score constructor
    public score()
    {
        
    }

    public void act()
    {
        // display the current score
        World myWorld = getWorld();
        myWorld.showText(String.valueOf(score), 600, 200);
    }
    // setter for the score counter
    public static void add(int num)
    {
        score += num;
    }
    // get the current score
    public static int getCurrentScore()
    {
        return score;
    }
    
}
