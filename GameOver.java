import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.FileNotFoundException;
//import java.util.ArrayList;

public class GameOver extends Actor
{
    private final String scoreFile = "./Highscore.txt";
    private static int highestScore = 0;
    private static int currentScore;
    //private ArrayList<Integer> scores = new ArrayList<Integer>();
    private GreenfootImage bg = new GreenfootImage("./assets/GameOver1.png");
    
    public GameOver() {
        
        this.currentScore = score.getCurrentScore();
        
        //highScore();
        
        bg.scale(500,500);
        setImage(bg);
        
        if(currentScore >= highestScore) {
            this.highestScore = currentScore;
        }
        
    }
    
    public void act()
    {
        World myWorld = getWorld();
        myWorld.showText("Your score:  " + score.getCurrentScore(), 600, 550);
        myWorld.showText("Highest score: " + highestScore, 600,570);
        
        
        
    }
}
