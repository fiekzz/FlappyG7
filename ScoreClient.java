import okhttp3.*;
import com.google.gson.*;
import java.io.IOException;

public class ScoreClient  
{
    private final String fireURL = "https://firestore.googleapis.com/v1/projects/flappyg7-46c21/databases/(default)/documents/FlapScore";
    
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    
    OkHttpClient client = new OkHttpClient();
    
    String getScore() throws IOException
    {
        Request request = new Request.Builder()
        .url(fireURL)
        .build();
        
        try(Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
    
    String postScore(String name, int score) throws Exception
    {
        PostScoreModel scoreModel = new PostScoreModel(name, score);
        String jsonString = new Gson().toJson(scoreModel);
        
        RequestBody body = RequestBody.create(jsonString, JSON);
        Request request = new Request.Builder().url(fireURL).post(body).build();
        
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
    
    public ScoreClient(){}
}
