import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Leaf  extends Actor
{
        private GreenfootImage leaf0 = new GreenfootImage("cutoutleaf0.png");
        private GreenfootImage leaf1 = new GreenfootImage("cutoutleaf1.png");
        private GreenfootImage leaf2 = new GreenfootImage("cutoutleaf2.png");
        private GreenfootImage leaf3 = new GreenfootImage("cutoutleaf3.png");

    public Leaf()
    {
      //Create a constructor for Leaf that DOES take an integer as a parameter
      //If the parameter given is 1, make the Leaf show up as cutoutleaf0.png
      //If the parameter given is 1, make the Leaf show up as cutoutleaf1.png
      //If the parameter given is 2, make the Leaf show up as cutoutleaf2.png
      //If the parameter given is 3, make the Leaf show up as cutoutleaf3.png
      int imageNum = Greenfoot.getRandomNumber(4);
        //if we are given an image number of 1...
        if( imageNum == 0)
        {
            //Set the leaf's image to the 1st image
            setImage("cutoutleaf0.png");
        }
        //Otherwise, if we are give an image number of 2...
        else if( imageNum == 1 )
        {
            //Set the leaf's image to the 2nd image
            setImage("cutoutleaf1.png");
        }
        else if( imageNum == 3 )
        {
            //Set the leaf's image to the 2nd image
            setImage("cutoutleaf2.png");
        }
        else //Otherwise...
        {
            //Set the leaf's image to the 3rd image
            setImage("cutoutleaf3.png");
        }

    }
    /**
     * act is the contructer that makes the leaf moveDown(), Rotate() the leaf and check if the leaft is atEdge().
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */    
    public void act() 
    {
        moveDown();
        Rotate();
        atEdge();
    }    
    /**
     * moveDown is the contructer that makes the leaf fall down in random speed and random location
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void moveDown()
    {
            setLocation(getX()+Greenfoot.getRandomNumber(10)-5, getY()+2);
            
    }
    /**
     * atEdge is the contructor that remove the leaf from the world if it is touching the edge
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void atEdge()
    {
        if(isAtEdge() == true)
            {
               getWorld().removeObject(this);
            }
    }
    /**
     * Rotate is the contructor that make the leaf spin around in the air and set a speed of rotation
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    private void Rotate()
    {
        int speed= 2;
        
         
         int rotation = getRotation();
        
         setRotation(rotation + 5);
         move (speed);
    }
    
}
