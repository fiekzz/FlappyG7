import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class score extends Actor
{
    private static int score;

    public score()
    {
        score = 0;
    }

    public void act()
    {
        World myWorld = getWorld();
        myWorld.showText(String.valueOf(score), 600, 200);
        
        //getWorld().showText(String.valueOf(score), 500,500);
        
    }

    public static void add(int num)
    {
        score += num;
    }
    
    public static int getCurrentScore()
    {
        return score;
    }
    
}
