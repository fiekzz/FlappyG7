import greenfoot.*;

public class StartGame extends World
{
    // game background
    private GreenfootImage gameBg = new GreenfootImage("./assets/game_background.png");
    // theme song
    private GreenfootSound theme = new GreenfootSound("./assets/sounds/theme.mp3");
    private final int totalEntities = 25;
    
    public StartGame()
    {   
        // screen size
        super(1200, 800, 1);
        
        gameBg.scale(getWidth(), getHeight());
        setBackground(gameBg);
        
        // spawn rocket
        addObject(new Rocket(getHeight(), new EndGame()), 200, 400);
        
        // spawn location of planets
        spawnEntity(600);
        spawnEntity(1000);
        addObject(new CountEntity(),600,200);
        addObject(new CountSpeed(), 600,200);
        
        // score displayer
        addObject(new score(), 600, 200);
        
        
    }
    
    public void spawnEntity(int initialLocationX)
    {
        
        //theme.play();
        int size = Greenfoot.getRandomNumber(200) + 100;
        
        // spawn random planet
        String planet = "./assets/Entity/e" + String.valueOf(Greenfoot.getRandomNumber(27) + 1) + ".png";

        entity distraction = new entity(planet, size);
        addObject(distraction, initialLocationX, Greenfoot.getRandomNumber(700)+100);
    }
    
    public int getRandomNumber(int max, int min)
    {
        int normal = Greenfoot.getRandomNumber(max - min + 1);
        int size = min + normal;
        
        return size;
    }
}
