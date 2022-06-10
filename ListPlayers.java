import java.util.ArrayList;
import java.util.*;
import java.io.*;

/**
 * Write a description of class ListPlayers here.
 * 
 * @author github.com/fiekzz 
 * @version (a version number or a date)
 */
public class ListPlayers  
{
    private static ArrayList<PlayerObj> Players;
    
    ListPlayers(){}
    
    public ListPlayers(ArrayList<PlayerObj> Players)
    {
        setPlayers(Players);
    }
    
    void setPlayers (ArrayList<PlayerObj> Players)
    {
        this.Players = Players;
        Collections.sort(Players);        
    }
    
    static ArrayList<PlayerObj> getPlayers()
    {
        return Players;
    }
    
    static String getPlayerName(int i)
    {
        return Players.get(i).getName();
    }
    
    static int getPlayerScore(int i)
    {
        return Players.get(i).getScore();
    }
    
    void clearPlayers()
    {
        Players.clear();
    }
}
