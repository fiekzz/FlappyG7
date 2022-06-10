import java.util.ArrayList;

/**
 * Write a description of class PostScoreModel here.
 * 
 * @author github.com/fiekzz
 * @version (a version number or a date)
 */
public class PostScoreModel  
{
    private FieldObj fields;
    
    private class FieldObj {
        private NameObj User;
        private ScoreObj Score;
        
        FieldObj(NameObj User, ScoreObj Score)
        {
            this.User = User;
            this.Score = Score;
        }
        
        public NameObj getUser()
        {
            return User;
        }
        
        public ScoreObj getScore()
        {
            return Score;
        }
    }
    
    private class NameObj {
        private String stringValue;
        
        NameObj(String name){
            this.stringValue = name;
        }
        
        public String getStringValue()
        {
            return stringValue;
        }
    }
    
    private class ScoreObj {
        private int integerValue;
        
        ScoreObj(int score) {
            this.integerValue = score;
        }
        
        public int getIntegerValue()
        {
            return integerValue;
        }
    }
    
    public PostScoreModel(String name, int score)
    {
        this.fields = new FieldObj(new NameObj(name), new ScoreObj(score));
    }
}