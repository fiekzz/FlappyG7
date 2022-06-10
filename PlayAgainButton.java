import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgainButton here.
 * 
 * @author github.com/fiekzz
 * @version (a version number or a date)
 */
public class PlayAgainButton extends Actor
{
    GreenfootImage btn = new GreenfootImage("./assets/buttons/playagain.png");
    
    public PlayAgainButton()
    {
        btn.scale(100,100);
        setImage(btn);
    }
    
    public void act()
    {
        // Add your action code here.
        
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MainMenu());
            Greenfoot.playSound("./assets/sounds/button.mp3");
        }
    }
}
