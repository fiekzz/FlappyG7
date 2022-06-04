import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class entity extends Actor
{
    private int yLocation;
    private int xVelocity = 3;
    private int currentX;
    private boolean validScore = true;
    private boolean validSpeed = true;
    private String fileLocation;
    private GreenfootSound plusScore = new GreenfootSound("./assets/sounds/newScore.mp3");

    public entity(String fileLocation, int size)
    {
        this.fileLocation = fileLocation;

        GreenfootImage image = new GreenfootImage(fileLocation);
        image.scale(size, size);
        setImage(image);
        
        CountEntity.add(1);
        
    }

    public void act()
    {
        currentX = getX() - xVelocity;
        setLocation(currentX, getY());
        
        if(getX() <= 1)
        {
            String planet = "./assets/Entity/e" + String.valueOf(Greenfoot.getRandomNumber(27) + 1) + ".png";
            GreenfootImage pic = new GreenfootImage(planet);
            
            int size = Greenfoot.getRandomNumber(200) + 100;
            pic.scale(size,size);
            setImage(pic);
            
            setLocation(getX() + 1200, Greenfoot.getRandomNumber(700)+100);
            validScore = true;
            
            CountSpeed.add(1);
            
            if((CountSpeed.getCurrentSpeed() % 5) == 0)
            {
                xVelocity += 1;
            }
            
            System.out.println("Velocity: " + xVelocity + " Speed: " + CountSpeed.getCurrentSpeed());
        }
        
        if(getX() <= 400 && CountEntity.getCount() < 1) {
            spawnNew();
        }
        
        if(getX() <= 200 && validScore){
            score.add(1);
            plusScore.play();
            validScore = false;
        }
        
        
    }
    
    public void spawnNew() {
        ((StartGame)getWorld()).spawnEntity(getWorld().getWidth());
    }
}
