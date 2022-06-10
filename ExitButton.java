import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitButton here.
 * 
 * @author github.com/fiekzz
 * @version (a version number or a date)
 */
public class ExitButton extends Actor
{
    GreenfootImage btn = new GreenfootImage("./assets/buttons/exit.png");
    
    public ExitButton()
    {
        btn.scale(100,100);
        setImage(btn);
    }
    
    public void act()
    {
        
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
            System.exit(0);
            Greenfoot.playSound("./assets/sounds/button.mp3");
        }
    }
}
