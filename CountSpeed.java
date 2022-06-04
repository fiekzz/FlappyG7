import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CountSpeed extends Actor
{
    private static int countSpeed;
    
    public CountSpeed()
    {
        countSpeed = 0;
    }
    
    public void act()
    {
        
    }
    
    public static void add(int num)
    {
        countSpeed += num;
    }
    
    public static int getCurrentSpeed()
    {
        return countSpeed;
    }
    
}
