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
    private GreenfootImage bg = new GreenfootImage("./assets/GameOver1.png");
    // gameover constructor
    public GameOver() {
        // set scale
        bg.scale(500,500);
        setImage(bg);
        
    }
    // score displayer
    public void act()
    {     
    }
}
