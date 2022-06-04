import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CountEntity extends Actor
{
    private static int count;
    
    public CountEntity()
    {
        count = 0;
    }
    
    public void act()
    {
        
    }
    
    public static void add(int num)
    {
        count += num;
    }
    
    public static int getCount()
    {
        return count;
    }
}
