import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyRocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyRocket extends Actor
{
    int dy = 0;
    final int Gravity = 1;
    int screenWidth;
    int screenHeight;
    GreenfootImage bg;
        
    public FlappyRocket(int screenWidth, int screenHeight, GreenfootImage bg) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.bg = bg;
        //GreenfootImage image = getImage();
        GreenfootImage avatar = new GreenfootImage("./images/alienSpaceship.png");
        
        avatar.scale(50,50);
        setImage(avatar);
    }
    
    public void act()
    {
        int currentHeight = getY() + dy;
        setLocation(getX(), currentHeight);       
        
        if(Greenfoot.isKeyDown("space") == true) {
            dy = -5;
        }
         
        dy += Gravity;
         
        if(currentHeight >= screenHeight || currentHeight <= 0) {
            System.out.println("Game over!");
            Greenfoot.setWorld(new iiumWallpaper());
            Greenfoot.stop();
        }

        if(isTouching(Planets.class))
        {
            System.out.println("Game over!");
            System.out.println("Collision occured!");
            Greenfoot.stop();
        }

         
    }
    
    
}
