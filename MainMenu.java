import greenfoot.*;

/**
 * Main menu class
 * Start off the game with this page
 * 
 * @author github.com/fiekzz
 * @version 4 June 2022
 */

public class MainMenu extends World
{   
    // background image
    GreenfootImage menuBg = new GreenfootImage("./assets/MainMenu.png");
    // themse sound
    public GreenfootSound theme = new GreenfootSound("./assets/sounds/theme.mp3");

    public MainMenu()
    {
        // create main menu page
        super(1200, 800, 1);
        // scale the background
        menuBg.scale(getWidth(), getHeight());
        // set the background image
        setBackground(menuBg);
        // create start button and link to another page
        StartButton btn = new StartButton(new StartGame(), theme);
        addObject(btn, 600, 350);
        // play theme song
        theme.play();

    }
    
}