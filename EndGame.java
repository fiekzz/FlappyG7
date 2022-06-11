import greenfoot.*;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;
import org.json.*;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
/**
 * Ending class
 * Will be created when the game has over
 * 
 * @author github.com/fiekzz
 * @version 4 June 2022
 */
public class EndGame extends World
{
    // background image
    GreenfootImage bg = new GreenfootImage("./assets/new_background.png");
    
    private ArrayList<PlayerObj> Players = new ArrayList<PlayerObj>();
    private ScoreClient client = new ScoreClient();
    private ListPlayers listPlayers = new ListPlayers();
    private score userScore = new score();
    
    public EndGame()
    {   
        
        super(1200, 800, 1);
        bg.scale(getWidth(), getHeight());
        addObject(new GameOver(), 600, 300);
        setBackground(bg);
        
        postScore();
        getScore();
        
        addObject(new DisplayListScore(600, 500),-10,-10);
        
        addObject(new PlayAgainButton(), 600 - 150, 700);
        addObject(new ExitButton(), 600 + 150, 700);
    }
    
    private void postScore()
    {
        try {
            score newScore = new score();
            
            String res = client.postScore(new FlapperName().getName(), newScore.getCurrentScore());
            
            newScore.resetScore();
        } catch (Exception e) {}
    }
    
    private void getScore()
    {
        try {
            
            String jsonString = client.getScore();
            
            JSONObject obj = new JSONObject(jsonString);
            JSONArray documentsArr = obj.getJSONArray("documents");
            
            String tempName;
            int tempScore;
            
            for(int i = 0; i < documentsArr.length(); i++)
            {
                tempName = documentsArr.getJSONObject(i).getJSONObject("fields").getJSONObject("User").getString("stringValue");
                tempScore = Integer.parseInt(documentsArr.getJSONObject(i).getJSONObject("fields").getJSONObject("Score").getString("integerValue"));
                
                PlayerObj tempPlayer = new PlayerObj(tempName,tempScore);
                
                Players.add(tempPlayer);
            }
            listPlayers.clearPlayers();
            listPlayers.setPlayers(Players);
            
        } catch (Exception e) {}
        
        addObject(new DisplayListScore(600, 500), 0, 0);
    }
}
