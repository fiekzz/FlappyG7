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
    
    public FlappyRocket(int screenWidth, int screenHeight) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    
    public void act()
    {
        int currentHeight = getY() + dy;
        setLocation(getX(), currentHeight);       
        
         if(Greenfoot.isKeyDown("space") == true) {
             dy = -10;
         }
         
         dy += Gravity;
         
         if(currentHeight >= screenHeight || currentHeight <= 0) {
             System.out.println("Game over!");
             Greenfoot.stop();
         }
         
    }
}
