import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartButton extends Actor
{
    GreenfootImage btn = new GreenfootImage("./assets/startBtn.png");
    
    private World link;
    
    GreenfootSound theme;
    GreenfootSound btnSound = new GreenfootSound("./assets/sounds/button.wav");
    
    public StartButton(World link, GreenfootSound theme)
    {
        btn.scale(150, 100);
        setImage(btn);
        
        this.theme = theme;
        // set the link
        this.link = link;
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(this.link);
            theme.stop();
            Greenfoot.playSound("./assets/sounds/button.mp3");
        }
    }
}
