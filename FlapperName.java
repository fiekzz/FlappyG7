import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlapperName here.
 * 
 * @author github.com/fiekzz
 * @version (a version number or a date)
 */
public class FlapperName extends Actor
{
    private static String name;
    
    FlapperName(){}
    
    FlapperName(String name)
    {
        setName(name);
    }
    
    public void act()
    {
        
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public static String getName()
    {
        return name;
    }
}
