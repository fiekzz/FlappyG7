import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Entity class
 * Create entity to distract the rocket
 * Add up the score when rocket has passed
 * 
 * @author github.com/fiekzz
 * @version 4 June 2022
 */

public class entity extends Actor
{
    private int yLocation;
    private int xVelocity = 3;
    private int currentX;
    private boolean validScore = true;
    private boolean validSpeed = true;
    private String fileLocation;
    private GreenfootSound plusScore = new GreenfootSound("./assets/sounds/newScore.mp3");
    
    // entity constructor
    public entity(String fileLocation, int size)
    {
        // get the picture file location
        this.fileLocation = fileLocation;
        // set and create the image
        GreenfootImage image = new GreenfootImage(fileLocation);
        image.scale(size, size);
        setImage(image);
        // count the entity
        CountEntity.add(1);
        
    }

    public void act()
    {
        // get and set current location in x-direction
        currentX = getX() - xVelocity;
        setLocation(currentX, getY());
        // check if the distractor is out of bounds
        // respawn if it is out of bounds
        if(getX() <= 1)
        {
            // set new picture of the asset
            String planet = "./assets/Entity/e" + String.valueOf(Greenfoot.getRandomNumber(27) + 1) + ".png";
            GreenfootImage pic = new GreenfootImage(planet);
            // get random size and set
            int size = Greenfoot.getRandomNumber(200) + 100;
            pic.scale(size,size);
            setImage(pic);
            // set the spawn location
            setLocation(getX() + 1200, Greenfoot.getRandomNumber(700)+100);
            // check is the score is valid to add
            validScore = true;
            // add up the speed
            CountSpeed.add(1);
            // check is the current speed is enough to be added
            if((CountSpeed.getCurrentSpeed() % 5) == 0)
            {
                xVelocity += 1;
            }
            
        }
        // check if new distractor is enough to be added
        // spawn new distractor
        if(getX() <= 400 && CountEntity.getCount() < 1) {
            spawnNew();
        }
        // check if the entity has passed the rocket
        // add up the score
        if(getX() <= 200 && validScore){
            score.add(1);
            plusScore.play();
            validScore = false;
        }
        
        
    }
    // spawn new distractor
    public void spawnNew() {
        ((StartGame)getWorld()).spawnEntity(getWorld().getWidth());
    }
}
