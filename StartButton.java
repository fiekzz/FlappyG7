import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Start button class
 * Create a button to play the game
 * 
 * @author github.com/fiekzz
 * @version 4 June 2022
 */

public class StartButton extends Actor
{
    // get button asset
    GreenfootImage btn = new GreenfootImage("./assets/buttons/new_start.png");
    // assets
    GreenfootSound theme;
    GreenfootSound btnSound = new GreenfootSound("./assets/sounds/button.wav");
    
    // button constructor
    public StartButton(GreenfootSound theme)
    {
        // scale the button size
        btn.scale(300, 300);
        setImage(btn);
        // set the theme
        this.theme = theme;
    }

    public void act()
    {
        // check is the button has been clicked
        // change the page when the button has been clicked
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new StartGame());
            theme.stop();
            Greenfoot.playSound("./assets/sounds/button.mp3");
        }
    }
}
