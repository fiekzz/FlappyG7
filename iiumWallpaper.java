import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class iiumWallpaper here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class iiumWallpaper extends World
{

    private GreenfootImage bg;
    
    public iiumWallpaper()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        bg = new GreenfootImage("./images/FlappyWallpaper 1.1.png"); // adjust filename as needed
        bg.scale((int)(getWidth() * 1.25), (int)(getHeight() * 1.25));
        setBackground(bg);

        // Create flappy
        FlappyRocket flappy = new FlappyRocket(getWidth(), getHeight(), bg);
        addObject(flappy, 200, getHeight() / 2);
        
        // Spawn distraction
        int initial_location = 600;
        spawnDistraction(initial_location);

    }
    
    
    
    public void changePos(int dy) {
        int temp = -5;
        getBackground().drawImage(bg, temp, 0);
        getBackground().drawImage(bg, temp + bg.getWidth(), 0);
    }
    
    public void spawnDistraction(int initial_location)
    {
        final int maxSize = 225;
        final int minSize = 75;

        int getRandom = Greenfoot.getRandomNumber(5);
        getRandom += 1;

        int size = getRandomNumber(maxSize,minSize);
        
        int randomY = getRandomNumber(500, 50);
        int randomX = getRandomNumber(50, 10);
        String asset;
        int yLocation;

        yLocation = randomY;

        switch (getRandom)
        {
            case 1: asset = "./images/planet1.png"; break;
            case 2: asset = "./images/Planet2.png"; break;
            case 3: asset = "./images/Planet3.png"; break;
            case 4: asset = "./images/Planet4.png"; break;
            case 5: asset = "./images/Planet7.png"; break;
            default: asset = "";
        }

        Planets planet = new Planets(asset,yLocation,size);
        addObject(planet, initial_location + randomX, randomY);

    }

    public int getRandomNumber(int maxSize, int minSize) {
        int normal = Greenfoot.getRandomNumber(maxSize - minSize + 1);
        int size = minSize + normal;

        return size;
    }
}

