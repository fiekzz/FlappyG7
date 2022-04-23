import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Planets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planets extends Actor
{
    private int yLocation;
    private int size;
    private String asset;
    private final int xVelocity = 2;
    
    public Planets(String asset, int yLocation, int size)
    {   
        this.asset = asset;
        this.yLocation = yLocation;
        this.size = size;
        
        GreenfootImage pic = new GreenfootImage(asset);
        pic.scale(size,size);
        setImage(pic);
    }
    
    public void act()
    {
        int currentX = getX() - xVelocity;

        setLocation(currentX, yLocation);

        if(currentX <= 0 && getWorld() != null) {
            getWorld().removeObject(getWorld().getObjects(Planets.class).get(0));
        }

        if(currentX == 599 || currentX == 600) {

            int normal = Greenfoot.getRandomNumber(100);
            int randomNum = normal + 10;
            
            currentX = currentX + 200 + randomNum;
            ((iiumWallpaper)getWorld()).spawnDistraction(currentX);
        }
    }
}
