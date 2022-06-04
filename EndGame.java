import greenfoot.*;

/**
 * Write a description of class EndGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGame extends World
{
    // background image
    GreenfootImage bg = new GreenfootImage("./assets/game_background.png");
    
    public EndGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);
        bg.scale(getWidth(), getHeight());
        addObject(new GameOver(), 600, 400);
        setBackground(bg);
    }
}
