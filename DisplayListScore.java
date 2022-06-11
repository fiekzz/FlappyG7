import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisplayListScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayListScore extends Actor
{
    private ListPlayers listPlayers = new ListPlayers();
    private final int gap = 20;
    private int xLocation;
    private int yLocation;
    private int spawnY;
    private boolean valid;
    
    DisplayListScore(int xLocation, int yLocation)
    {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.spawnY = yLocation + gap;
        this.valid = true;
    }
    
    public void act()
    {
        
        if(valid)
        {
            World myWorld = getWorld();
            myWorld.showText("Current Highscore", xLocation, yLocation);
            
            if(listPlayers.getPlayers().size() > 5){
                displayList(5, myWorld);
            } else {
                displayList(listPlayers.getPlayers().size(), myWorld);
            }
            
            valid = false;
        }
    }
    
    public void displayList(int length, World myWorld)
    {
        for(int i = 0; i < length; i++)
        {
            spawnY += gap;
            myWorld.showText(listPlayers.getPlayerName(i), xLocation - 50, spawnY);
            myWorld.showText(String.valueOf(listPlayers.getPlayerScore(i)), xLocation + 70, spawnY);
        }
    }
}
