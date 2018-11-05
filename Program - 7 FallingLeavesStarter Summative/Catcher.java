 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Catcher  extends Actor
{
    /**
     * act is the contructor that make the catcher moveRight(), and moveLeft(), and checkForLeaf() is if a ...
     * leaf is touching catcher
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void act() 
    {
       moveRight();
       moveLeft();
      
       checkForLeaf();
    }
    /**
     * checkForLeaf is a contructor that if the catcher is touching a leaf it will remove it, add a point music effect and...
     * update the scoreboard.
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    private void checkForLeaf()
    {
        if(isTouching(Leaf.class))
        {
            removeTouching(Leaf.class);
            Greenfoot.playSound("point.mp3");
            //call the method update from the KittyWorld class
            ( (AutumnWorld)getWorld() ).update();
        }
    }
    
    /**
     * moveRight is the contructor the make the catcher move right 
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void moveRight()
    {   
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+6, getY());
        }
    }
    /**
     * moveLeft is the contructor that makes the catcher move left
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void moveLeft()
    {   
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-6, getY());
        }
    }

    
    
}
