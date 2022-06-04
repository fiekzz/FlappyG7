import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Counter for entity (distractor)
 * Class will be created when the user wants to start the game
 * Entity counter to improve the entity spawner
 * 
 * @author github.com/fiekzz
 * @version 4 June 2022
 */

public class CountEntity extends Actor
{
    // static variable
    private static int count;
    // count constructor
    public CountEntity()
    {
        this.count = 0;
    }
    
    public void act()
    {
        
    }
    // add num to the counter
    public static void add(int num)
    {
        count += num;
    }
    // get the counter
    public static int getCount()
    {
        return count;
    }
}
