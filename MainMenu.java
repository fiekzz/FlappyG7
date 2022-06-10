import greenfoot.*;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;
import org.json.*;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

/**
 * Main menu class
 * Start off the game with this page
 * 
 * @author github.com/fiekzz
 * @version 4 June 2022
 */

public class MainMenu extends World
{   
    // background image
    GreenfootImage menuBg = new GreenfootImage("./assets/MainMenu.png");
    // themse sound
    public GreenfootSound theme = new GreenfootSound("./assets/sounds/theme.mp3");
    private String Name;
    private int Score;
    private String name;
    private ArrayList<PlayerObj> Players = new ArrayList<PlayerObj>();
    private ScoreClient client = new ScoreClient();

    public MainMenu()
    {
        // create main menu page
        super(1200, 800, 1);
        // scale the background
        menuBg.scale(getWidth(), getHeight());
        // set the background image
        setBackground(menuBg);
        // create start button and link to another page
        //StartButton btn = new StartButton(new StartGame(), theme);
        addObject(new StartButton(theme), 600, 350);
        
        StoreScore();
        
        addObject(new DisplayListScore(), -10, -10);
        
        name = Greenfoot.ask("Enter your name:");
        
        FlapperName flapperName = new FlapperName(name);
        
        // play theme song
        //theme.play();
    }
    
    public void StoreScore()
    {
        try {
            String jsonString = client.getScore();
            
            JSONObject obj = new JSONObject(jsonString);
            JSONArray documentsArr = obj.getJSONArray("documents");
            
            addLoop(documentsArr.length(), documentsArr);
            
        } catch (Exception e) {
            
        }
    }
    
    public void addLoop(int length, JSONArray documentsArr)
    {
        String tempName;
        int tempScore;
        for(int i = 0; i < length; i++)
        {
            tempName = documentsArr.getJSONObject(i).getJSONObject("fields").getJSONObject("User").getString("stringValue");
            tempScore = Integer.parseInt(documentsArr.getJSONObject(i).getJSONObject("fields").getJSONObject("Score").getString("integerValue"));
            
            PlayerObj tempPlayer = new PlayerObj(tempName,tempScore);
            
            Players.add(tempPlayer);
        }
        ListPlayers listPlayers = new ListPlayers(Players);
    }
    
}