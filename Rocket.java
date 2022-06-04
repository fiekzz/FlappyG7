import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    final double Gravity = 0.5;
    double dy = 0;
    private int screenHeight;
    private boolean isAlive = true;
    GreenfootSound jumpSound = new GreenfootSound("./assets/sounds/jump2.wav");
    GreenfootSound crashSound = new GreenfootSound("./assets/sounds/explosion.mp3");
    GreenfootSound theme = new GreenfootSound("./assets/sounds/rocketTheme.mp3");
    private World link;
    private double currentHeight;
    
    public Rocket(int screenHeight, World link) {
        this.screenHeight = screenHeight;
        this.link = link;
        GreenfootImage avatar = new GreenfootImage("./assets/rocket2.png");
        avatar.scale(100,100);
        setImage(avatar);
    }
    
    public void act()
    {
        theme.play();
        currentHeight = getY() + dy;
        setLocation(getX(), (int)currentHeight);
        
        if(Greenfoot.isKeyDown("space") == true) {
            jumpSound.play();
            dy = -5;
        }
        
        dy += Gravity;
        
        if(currentHeight >= getWorld().getHeight() || currentHeight < 0) {
            isAlive = false;
        }
        
        getIntersect();

        if(!isAlive) {
            crashSound.play();
            theme.stop();
            
            //getWorld().removeObject(this);
            Greenfoot.setWorld(this.link);
        }
    }
    
    public void getIntersect() {
        //entity myEntity = (entity)getOneIntersectingObject(entity.class);
        
        Actor distraction = getOneObjectAtOffset(0,0,entity.class);
        
        if(distraction != null) {
            getWorld().removeObject(distraction);
            isAlive = false;
            //crashSound.play();
            //getWorld().theme.stop();
        }
        
    }
}
