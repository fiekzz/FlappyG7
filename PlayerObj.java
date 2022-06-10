import java.io.*;
import java.util.*;
/**
 * Write a description of class PlayerObj here.
 * 
 * @author github.com/fiekzz
 * @version (a version number or a date)
 */

class PlayerObj implements Comparable<PlayerObj>
{
    private String Name;
    private int Score;
    
    public int compareTo(PlayerObj player)
    {
        //return this.Score - player.Score;
        return player.Score - this.Score;
    }
    
    PlayerObj(){}
    
    public PlayerObj(String Name, int Score)
    {
        setName(Name);
        setScore(Score);
    }
    
    void setName(String Name)
    {
        this.Name = Name;
    }
    
    void setScore(int Score)
    {
        this.Score = Score;
    }
    
    String getName()
    {
        return Name;
    }
    
    int getScore()
    {
        return Score;
    }
    
}
