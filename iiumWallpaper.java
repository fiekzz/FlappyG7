import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class iiumWallpaper here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class iiumWallpaper extends World
{

    
    
    public iiumWallpaper()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage bg = new GreenfootImage("C:/Users/fikri/Downloads/327-International-Islamic-University-Malaysia-IIUM.jpg"); // adjust filename as needed
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        FlappyRocket flappy = new FlappyRocket(getWidth(), getHeight());
        
        addObject(flappy, 80, getHeight() / 2);
    }
}
