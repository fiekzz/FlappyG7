import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Speed counter class
 * Class will be created when the user wants to start the game
 * Speed counter to manage speed of the distractor
 * 
 * @author github.com/fiekzz
 * @version 4 June 2022
 */

public class CountSpeed extends Actor
{
    private static int countSpeed;
    // speed constructor
    public CountSpeed()
    {
        countSpeed = 0;
    }
    
    public void act()
    {
        
    }
    // setter for counter    
    public static void add(int num)
    {
        countSpeed += num;
    }
    // getter for speed counter
    public static int getCurrentSpeed()
    {
        return countSpeed;
    }
    
}
