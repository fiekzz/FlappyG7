import greenfoot.*;

/**
 * Ending class
 * Will be created when the game has over
 * 
 * @author github.com/fiekzz
 * @version 4 June 2022
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
