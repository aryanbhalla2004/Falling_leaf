import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutumnWorld  extends World
{
    private Scoreboard score;
    /**
     * AutumnWorld is the contructer that sets the size of the world and add the catcher in the world.
     * Also adding scoreboard in the corner on the top left cornor.
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */ 
    public AutumnWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(750, 500, 1); 
        addObject(new Catcher(), getWidth()/2, getHeight()-80);  
        
        score = new Scoreboard();
        addObject( score, 75, 20);
    }
    
   /**
     * act is the contructer that addleaf in the world.
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */ 
    public void act()
    {

        addLeaf();
    }
    /**
     * addLeaf is the contructer that add leaf in the world in random times.
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */ 
    private void addLeaf()
    {
        if(Greenfoot.getRandomNumber(100)<2)
        {
            //Use addObject to add three food iteam in a random location in the world
           addObject( new Leaf(), Greenfoot.getRandomNumber(500),0 );
        }
    }
    /**
     * update is the contructer that update the score in the scoreboard.
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */ 
    public void update()
    {
        score.addToScore();
    }
}
