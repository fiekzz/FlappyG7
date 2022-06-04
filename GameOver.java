import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.FileNotFoundException;
//import java.util.ArrayList;

/**
 * Game over class
 * Class will be created when the game has ended
 * Display the current score and the highest score when the game has over
 * 
 * @author github.com/fiekzz
 * @version 4 June 2022
 */

public class GameOver extends Actor
{
    private static int highestScore = 0;
    private static int currentScore;
    private GreenfootImage bg = new GreenfootImage("./assets/GameOver1.png");
    // gameover constructor
    public GameOver() {
        // get the ended current score
        this.currentScore = score.getCurrentScore();
        // set scale
        bg.scale(500,500);
        setImage(bg);
        // set the highest score if it has been broken
        if(currentScore >= highestScore) {
            this.highestScore = currentScore;
        }
        
    }
    // score displayer
    public void act()
    {
        World myWorld = getWorld();
        myWorld.showText("Your score:  " + score.getCurrentScore(), 600, 550);
        myWorld.showText("Highest score: " + highestScore, 600,570);        
    }
}
