import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rocket actor class
 * Spawn when the game has started
 * 
 * @author github.com/fiekzz
 * @version 4 June 2022
 */
public class Rocket extends Actor
{
    // set the gravity to 0.5
    final double Gravity = 0.5;
    // movement speed downwards
    double dy = 0;
    // screen height
    private int screenHeight;
    // check if it is still alive
    private boolean isAlive = true;
    // assets getter
    GreenfootSound jumpSound = new GreenfootSound("./assets/sounds/jump2.wav");
    GreenfootSound crashSound = new GreenfootSound("./assets/sounds/explosion.mp3");
    GreenfootSound theme = new GreenfootSound("./assets/sounds/rocketTheme.mp3");
    // world linker
    private World link;
    // get current height
    private double currentHeight;
    
    // rocket constructor
    public Rocket(int screenHeight, World link) {
        this.screenHeight = screenHeight;
        this.link = link;
        GreenfootImage avatar = new GreenfootImage("./assets/rocket2.png");
        avatar.scale(100,100);
        setImage(avatar);
    }
    
    public void act()
    {
        // play the song when the game has started
        theme.play();
        // get current height of rocket
        currentHeight = getY() + dy;
        // set current height location
        setLocation(getX(), (int)currentHeight);
        // jump if the space button has been pressed
        if(Greenfoot.isKeyDown("space") == true) {
            jumpSound.play();
            dy = -5;
        }
        // velocity increase along with the gravity
        dy += Gravity;
        // check if the rocket is out of bounds
        if(currentHeight >= getWorld().getHeight() || currentHeight < 0) {
            isAlive = false;
        }
        // check if the rocket has collided with the distractor
        getIntersect();
        // end the game when game has over
        if(!isAlive) {
            // play crash sound
            crashSound.play();
            // stop game song
            theme.stop();
            // change the page
            Greenfoot.setWorld(this.link);
        }
    }
    // collider detector
    public void getIntersect() {
        // create distraction class to check if the rocket has been collided
        // distraction will return an object if it has collided
        Actor distraction = getOneObjectAtOffset(0,0,entity.class);
        // check if the distraction has been occured
        // if the distraction class is null == not collided yet
        if(distraction != null) {
            getWorld().removeObject(distraction);
            isAlive = false;
        }
        
    }
}
